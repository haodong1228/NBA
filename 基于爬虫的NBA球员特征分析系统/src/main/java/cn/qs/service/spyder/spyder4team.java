package cn.qs.service.spyder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.qs.mapper.player.MyTeamMapper;
import cn.qs.utils.MD5Util;

@Service
@Transactional
public class spyder4team  extends spyderUtil implements spyderTeam,Runnable {

	private static final Logger logger = LoggerFactory.getLogger(spyder4team.class);
	
	@Autowired
	private MyTeamMapper TeamMapper;
	
	@Autowired
	private spyder4team spteam;
	
	public void spyderUtil4team() {
		
		List<Map> teamList = new ArrayList<Map>();
		try {
			
			String startTime = getNowTime();
			
			TEAMCOUNTLIST.add("开始从网络读取数据...");
			addTeamNumFalg();
			
			List<String> teamUrlList = getTeamListUrls(TEAMURL);
			
			int totalnum = teamUrlList.size();
			setTOTALNUM(totalnum);
			
			for(int i =0;i<totalnum;i++){
				
				TEAMCOUNTLIST.add("获取 "+teamUrlList.get(i)+" ...");
				addTeamNumFalg();
				
				Map teamMap = getPlayerUrls(teamUrlList.get(i));
				
				TEAMCOUNTLIST.add(" -->"+ teamMap.get("teamName")+" 个人信息获取成功...");
				addTeamNumFalg();
				
				// 生成id
				String teamId = MD5Util.createID();
				teamMap.put("teamId", teamId);
				String coachId = MD5Util.createID();
				teamMap.put("coachId", coachId);
				// 数据入库
				TeamMapper.insertByMap(teamMap);
				
				TEAMCOUNTLIST.add(" -->"+ teamMap.get("teamName")+" 个人信息保存数据库成功 !!!");
				addTeamNumFalg();
				// 修改当前进度值
				addNOWNUM();
			}
			
			TEAMCOUNTLIST.add("完毕");
			addTeamNumFalg();
			
			String endTime = getNowTime();
			
		} catch (IOException e) {
			logger.error("出现异常！！！");
		}
		
		
	}

	/*
	 * 获取球队列表路径
	 */
	public static List getTeamListUrls(String teaminfourl) throws IOException {

		List list = new ArrayList();
		Document doc = Jsoup.connect(teaminfourl).get();
		Elements inputArray = doc.getElementsByTag("div");// 对应的元素数组

		// 获取球队路径的父节点
		List teamUrl = new ArrayList();

		for (int a = 0; a < inputArray.size(); a++) {

			Element element = inputArray.get(a);
			String classVal = element.attr("class"); // 获取元素属性的值

			if ("team".equals(classVal)) {
				Element pageUrl = inputArray.get(a);
				teamUrl.add(pageUrl);
			}

		}

		// 获取球队路径

		for (int i = 0; i < teamUrl.size(); i++) {
			Element teampageurl = (Element) teamUrl.get(i);
			Elements chpage = teampageurl.children();
			// System.out.println(chpage.size());

			for (int j = 0; j < chpage.size(); j++) {

				String page2url = chpage.get(j).attr("href");

				if (page2url == null || "".equals(page2url)) {
					// page2url = chpage.get(i).ownText();
					continue;
				}
				list.add(page2url);
			}

		}

		return list;

	}

	/*
	 * 根据球队裂变url 爬虫 球队信息
	 */
	public static Map getPlayerUrls(String oneteamurl) throws IOException {

		Map teamMap = new HashMap();

		// 把网页转换成document
		Document doc = Jsoup.connect(oneteamurl).get();

		String zhStr = "";
		Elements spanEle = doc.getElementsByTag("span");
		for(int i =0;i<spanEle.size();i++){
			String classVal = spanEle.get(i).attr("class");
			if("title-text".equals(classVal)){
				// 获取球队名称
				String teamName = spanEle.get(i).text();
				teamMap.put("teamName", teamName);
			}else if("b".equals(classVal)){
				
				String zjstr = spanEle.get(i).text();
				if("数值".equals(zjstr))continue;
				zhStr = zhStr+","+zjstr;
//				System.out.println("战绩：" + zhStr);
			}
		}
		
		//球队战绩
		
		String[] zjArr = zhStr.split(",");
		teamMap.put("averageScore", zjArr[1]);
		teamMap.put("averageAssists", zjArr[2]);
		teamMap.put("averageBackboard", zjArr[3]);
		teamMap.put("averageLoseScore", zjArr[4]);
		teamMap.put("averageError", zjArr[5]);

		// 获取球队信息
		Elements inputArray = doc.getElementsByTag("div");// 对应的元素数组
		// 进入nba、主场、官网、主教练
		Element teamInfo = null;
		// 描述
		Element txtInfo = null;
		// 获取球员路径父节点
		List pageplayerUrl = new ArrayList();

		for (int a = 0; a < inputArray.size(); a++) {

			Element element = inputArray.get(a);
			String classVal = element.attr("class"); // 获取元素属性的值

			if ("font".equals(classVal)) {
				teamInfo = inputArray.get(a);
			} else if ("txt".equals(classVal)) {
				txtInfo = inputArray.get(a);
			}

		}

		// 球队描述
		String txt = txtInfo.text();
//		System.out.println("球队描述  " + txt);
		teamMap.put("background", txt);

		Elements teamlist = teamInfo.children();
		for (int i = 0; i < teamlist.size(); i++) {
			// 获取信息
			Element oneEle = teamlist.get(i);
			String keyval = oneEle.text();

			// 处理球队信息
			System.out.println(keyval);
			String[] infoarr = keyval.split("：");

			if (infoarr.length >= 3) {
				String[] strarr = keyval.split(" ");
				String[] keyval1 = strarr[0].split("：");
				String key = keyval1[0];
				String val = keyval1[1];
				// 根据爬取的名称获取数据库字段名
				 key = TeamMap.get(key);
				teamMap.put(key, val);
				
				String[] keyval2 = strarr[1].split("：");
				key = keyval2[0];
				val = keyval2[1];
				// 根据爬取的名称获取数据库字段名
				 key = TeamMap.get(key);
				teamMap.put(key, val);
				
			}
			
			String key = infoarr[0];
			String val = infoarr[1];
			// 根据爬取的名称获取数据库字段名
			 key = TeamMap.get(key);
			teamMap.put(key, val);

		}

		System.out.println(teamMap);
		
		return teamMap;
	}

	@Override
	public void startSpyder() {
		
		// 判断是否有球员信息线程正在爬虫
		if(!TEAMROADFALG){
			// 初始化数据
			initTeamBSdata();
			Thread t = new Thread(spteam);
			t.start();
		}
		
	}

	@Override
	public void run() {
		TEAMROADFALG = true; 
		spyderUtil4team();
		TEAMROADFALG = false; 
	}




}

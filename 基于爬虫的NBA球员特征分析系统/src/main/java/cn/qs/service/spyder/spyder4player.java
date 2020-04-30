package cn.qs.service.spyder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.qs.mapper.player.MyPlayerMapper;
import cn.qs.utils.MD5Util;

/**
 * 设置访问首页， 先根据首页，爬虫所有球队的url， 让后根据每个球队的url爬虫球队中所有球员的url， 最后根据球员url爬虫球员信息
 * 
 * @author Administrator
 *
 */
@Service
@Transactional
public class spyder4player extends spyderUtil implements spyderMethod,Runnable{
	
	private static final Logger logger = LoggerFactory.getLogger(spyder4player.class);
	
	@Autowired
	private MyPlayerMapper playerMapper;
	
	@Autowired
	private spyder4player spplayer;

	/*
	 * 获取球员数据爬虫
	 */
	public  void spyderUtil4player() {
		logger.info("开始 获取球员数据..");
		try {
			
			PLAYERCOUNTLIST.add("开始从网络读取数据...");
			addPlayNumFalg();
			
			// 获取包含球员球队的所有路径url
			List teamPageList = getplayerUrls(PLAYERURL);
			
			// 获取每个球队url下的所有球员url
			List playerAllList = new ArrayList();
			for (int i = 0; i < teamPageList.size(); i++) {
				List playerList = getPagePlayerUrls("" + teamPageList.get(i));
				playerAllList.addAll(playerList);
				
			}

			// 根据每个球员的url获取球员个人信息
			int totalnum = playerAllList.size();
			setTOTALNUM(totalnum);
			
			for (int i = 0; i < totalnum; i++) {
				
				PLAYERCOUNTLIST.add("获取 "+playerAllList.get(i)+" ...");
				addPlayNumFalg();
				
				Map playerMap = getPlayerUrls("" + playerAllList.get(i));
				PLAYERCOUNTLIST.add(" -->"+ playerMap.get("name")+" 个人信息获取成功...");
				addPlayNumFalg();
				// 生成id
				String playerId = MD5Util.createID();
				playerMap.put("playerId", playerId);
				// 数据入库
				System.out.println(playerMapper.toString());
				
				// 号码和位置信息处理
				String numLocation = (String) playerMap.get("location");
				playerMap.put("number","0");  //号码
				playerMap.put("location","0");//位置
				System.out.println("here : " + numLocation);
				if(numLocation!=null && !"".equals(numLocation)){
					numLocation = numLocation.replace("）", "");
					String[] numLoc = numLocation.split("（"); 
					if(numLoc.length>=2){
						playerMap.put("number",numLoc[0]); 
						playerMap.put("location",numLoc[1]);
					}
					
				}
				System.out.println("he : " +numLocation + "  num :"+playerMap.get("number") + "   location: " + playerMap.get("location"));
				playerMapper.insertByMap(playerMap);
				logger.info("一条球员信息获取成功");
				PLAYERCOUNTLIST.add(" -->"+ playerMap.get("name")+"  的个人信息保存数据库成功！！！");
				addPlayNumFalg();
				// 修改当前进度值
				addNOWNUM();
			}
			
			logger.info("全部球员信息获取完成");
			
			PLAYERCOUNTLIST.add("完毕");
			addPlayNumFalg();
			
		} catch (IOException e) {
			logger.error("出现异常！！！！！");
		}

	}
	

	/*
	 * 获取球员球队页面的路径
	 */
	public static List getplayerUrls(String playerinfourl) throws IOException {

		List list = new ArrayList();
		// String playerteamurl = "https://nba.hupu.com/players";
		Document doc = Jsoup.connect(playerinfourl).get();
		Elements inputArray = doc.getElementsByTag("span");// 对应的元素数组

		// 获取球队路径的父节点
		List teamUrl = new ArrayList();

		for (int a = 0; a < inputArray.size(); a++) {

			Element element = inputArray.get(a);
			String classVal = element.attr("class"); // 获取元素属性的值

			if ("team_name".equals(classVal)) {
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
				// System.out.println(page2url);
			}

		}

		return list;

	}

	/*
	 * 根据球队url获取球队球员的url
	 */
	public static List getPagePlayerUrls(String playerteamurl) throws IOException {

		List list = new ArrayList();
		// String playerteamurl = "https://nba.hupu.com/players/rockets";
		Document doc = Jsoup.connect(playerteamurl).get();
		Elements inputArray = doc.getElementsByTag("td");// 对应的元素数组

		// 获取球员路径父节点
		List pageplayerUrl = new ArrayList();

		for (int a = 0; a < inputArray.size(); a++) {

			Element element = inputArray.get(a);
			String classVal = element.attr("class"); // 获取元素属性的值

			if ("td_padding".equals(classVal)) {
				Element pageUrl = inputArray.get(a);
				pageplayerUrl.add(pageUrl);
			}

		}

		// 获取球队路径

		for (int i = 0; i < pageplayerUrl.size(); i++) {
			Element teampageurl = (Element) pageplayerUrl.get(i);
			Elements chpage = teampageurl.children();
			// System.out.println(chpage.size());

			for (int j = 0; j < chpage.size(); j++) {

				String page2url = chpage.get(j).attr("href");

				if (page2url == null || "".equals(page2url)) {
					// page2url = chpage.get(i).ownText();
					continue;
				}

				list.add(page2url);
				// System.out.println(page2url);
			}

		}

		// for(int i=0;i<list.size();i++){
		// System.out.println("player url : "+list.get(i));
		// }

		return list;

	}

	/*
	 * 根据球员信息url 爬虫 球员个人信息
	 */
	public static Map getPlayerUrls(String playerteamurl) throws IOException {

		Map playerMap = new HashMap();
		// String playerteamurl =
		// "https://nba.hupu.com/players/chrispaul-1037.html";

		// 把网页转换成document
		Document doc = Jsoup.connect(playerteamurl).get();

		// 获取球员姓名信息
		Elements titles = doc.getElementsByTag("title");
		String playerName = titles.get(0).text();
		String[] titlearr = playerName.split("\\|");
		String cName = titlearr[0];
		String eName = titlearr[1];
		// System.out.println(cName + " , " + eName);

		// 姓名
		playerMap.put("name", cName);

		// 获取球员信息
		Elements inputArray = doc.getElementsByTag("div");// 对应的元素数组
		Element playerEle = null;
		// 获取球员路径父节点
		List pageplayerUrl = new ArrayList();

		for (int a = 0; a < inputArray.size(); a++) {

			Element element = inputArray.get(a);
			String classVal = element.attr("class"); // 获取元素属性的值

			if ("font".equals(classVal)) {
				playerEle = inputArray.get(a);
				break;
			}

		}
		// System.out.println(playerEle.children().get(0).text());
		// List<org.jsoup.nodes.Node> playerlist = playerEle.childNodes();
		Elements playerlist = playerEle.children();
		for (int i = 0; i < playerlist.size(); i++) {
			// 获取信息
			Element oneEle = playerlist.get(i);
			// org.jsoup.nodes.Node node = playerlist.get(i);
			// System.out.println("size : "+oneEle.childNodeSize());
			String keyval = oneEle.text();

			// 处理球员信息
			String[] infoarr = keyval.split("：");
			String key = infoarr[0];
			String val = infoarr[1];
//			System.out.println(key);
			// 根据爬取的名称获取数据库字段名
			String key1 = PlayerMap.get(key.trim());
			playerMap.put(key1, val);
			
//			 System.out.println(key +"  " + key1 + " " + val);

		}
		
		// 获取球员本赛季常规赛平均数据
		Elements tables = doc.getElementsByTag("table");

		// 获取球员平均数据父节点
		Element table = null;

		for (int a = 0; a < tables.size(); a++) {

			Element element = tables.get(a);
			String classVal = element.attr("class"); // 获取元素属性的值

			if ("players_table bott".equals(classVal)) {
				table = tables.get(a);
				break;
			}

		}

		Elements trEle = table.getElementsByTag("tr");

		// System.out.println("trEle size : "+trEle.size());
		// System.out.println("utl : "+playerteamurl);

		Element trKey = trEle.get(1);
		Elements trKeys = trKey.children();
		
		// 由于网页有些球员只有部分信息，所以此处增加判断
		int falg = trEle.size();
		Elements trVals = null;
		if (falg >= 3) {
			Element trVal = trEle.get(2);
			trVals = trVal.children();
		}
		

		// System.out.println(trNodes.get(0).text());

		for (int i = 0; i < trKeys.size(); i++) {
			String tdKey = trKeys.get(i).text();
			String tdVal = "0";
			if (falg >= 3) {
				tdVal = trVals.get(i).text();
			}
			
			if (i == 3 || i == 5 || i == 7) {
				tdKey = trKeys.get(i - 1).text() + trKeys.get(i).text();
			}
			// System.out.println(tdKey+" : "+tdVal);

			// 根据爬取的名称获取数据库字段名
			tdKey = PlayerMap.get(tdKey);

			playerMap.put(tdKey, tdVal);
		}

		// System.out.println(playerMap);
		return playerMap;
	}

	@Override
	public void run() {
		PLAYERROADFALG = true;
		spyderUtil4player();
		PLAYERROADFALG = false;
	}
	
	// 启动线程
	public void startSpyder(){
		
		
		// 判断是否有获取球队信息线程正在爬虫
		if(!PLAYERROADFALG){
			//初始化数据
			initPlayBSdata();
			// 启动线程
			Thread t = new Thread(spplayer);
			t.start();	
		}
		
	}


}

package cn.qs.controller.spyder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qs.service.spyder.spyderMethod;
import cn.qs.service.spyder.spyderTeam;
import cn.qs.service.spyder.spyderUtil;

@Controller
@RequestMapping("/user")
public class spyderController {

	private static final Logger logger = LoggerFactory.getLogger(spyderController.class);

	@Autowired
	private spyderMethod spydermethod;

	@Autowired
	private spyderTeam spyderteam;

	@RequestMapping("/spyderPlayerInfo")
	@ResponseBody
	public Map getPlayerInfoFromWeb(@RequestParam(value = "flag") String flag) {

		Map<String, Object> map = new HashMap<String, Object>();
		List<String> messageList = new ArrayList<String>();
		// 根据falg判断执行流程
		int num = Integer.parseInt(flag);
		if (num <= 0) {
			// 开始爬虫获取信息
			logger.info("开始获取球员信息...");
			spydermethod.startSpyder();
			messageList.add("获取数据中......");
			map.put("numFalg", spyderUtil.PLAYNUMFALG);
		} else {

			// 实时获取爬虫进度
			if (spyderUtil.PLAYNUMFALG <= num) {
				messageList.add("正在努力获取数据中......");
				map.put("messageList", messageList);
			} else {
				for (int i = 0; i < spyderUtil.PLAYNUMFALG - num; i++) {
					messageList.add(spyderUtil.PLAYERCOUNTLIST.get(num + i));
				}

				map.put("messageList", messageList);
			}
			map.put("numFalg", spyderUtil.PLAYNUMFALG);
		}

		// 返回爬虫进度
		float nowProgress = 0;
		if (spyderUtil.getTOTALNUM() >= 0) {
			nowProgress = (float) spyderUtil.getNOWNUM() / spyderUtil.getTOTALNUM();
		}

		map.put("nowProgress", nowProgress * 100);

		return map;
	}

	public static void main(String[] args) {
		System.out.println((float) 15 / 4);
	}

	@RequestMapping("/spyderTeamInfo")
	@ResponseBody
	public Map getTeamInfoFromWeb(@RequestParam(value = "flag") String flag) {

		Map<String, Object> map = new HashMap<String, Object>();
		List<String> messageList = new ArrayList<String>();
		int num = Integer.parseInt(flag);
		// 根据falg判断执行流程
		if (num <= 0) {
			// 开始爬虫获取信息
			logger.info("开始爬虫获取球队信息...");
			
			spyderteam.startSpyder();

			messageList.add("获取数据中......");
			map.put("numFalg", spyderUtil.TEAMNUMFALG);

		} else {

			// 实时获取爬虫进度
			if (spyderUtil.TEAMNUMFALG <= num) {
				messageList.add("正在努力获取数据中......");
				map.put("messageList", messageList);
			} else {
				for (int i = 0; i < spyderUtil.TEAMNUMFALG - num; i++) {
					messageList.add(spyderUtil.TEAMCOUNTLIST.get(num + i));
				}

				map.put("messageList", messageList);
			}
			map.put("numFalg", spyderUtil.TEAMNUMFALG);
		}

		// 返回爬虫进度
		float nowProgress = 0;
		if (spyderUtil.getTOTALNUM() >= 0) {
			nowProgress = (float) spyderUtil.getNOWNUM() / spyderUtil.getTOTALNUM();
		}

		map.put("nowProgress", nowProgress * 100);

		return map;
	}

}

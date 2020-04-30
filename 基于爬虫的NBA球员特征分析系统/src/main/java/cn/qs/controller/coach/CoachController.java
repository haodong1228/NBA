package cn.qs.controller.coach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.qs.bean.Coach;
import cn.qs.bean.Team;
import cn.qs.service.coach.CoachService;
import cn.qs.service.team.TeamService;
import cn.qs.utils.DefaultValue;
import cn.qs.utils.JSONResultUtil;
import cn.qs.utils.MD5Util;
import cn.qs.utils.ValidateCheck;

@Controller /** 自动返回的是json格式数据 ***/
@RequestMapping("coach")
public class CoachController {

	private static final Logger logger = LoggerFactory.getLogger(CoachController.class);

	@Autowired
	private CoachService coachService;
	@Autowired
	private TeamService teamService;

	/**
	 * 添加coach
	 * 
	 * @param coach
	 *            springMVC自动映射的实体
	 * @return
	 */
	@RequestMapping("addCoach")
	@ResponseBody
	public JSONResultUtil addCoach(Coach coach) {
		coach.setCoachId(MD5Util.createID());
		coachService.addCoach(coach);
		return JSONResultUtil.ok();
	}

	/**
	 * 分页查询user
	 * 
	 * @param condition
	 * @return
	 */
	@RequestMapping("getCoachs")
	@ResponseBody
	public PageInfo<Coach> getcoachs(@RequestParam Map condition) {
		int pageNum = 1;
		if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageNum"))) { // 如果不为空的话改变当前页号
			pageNum = Integer.parseInt(MapUtils.getString(condition, "pageNum"));
		}
		int pageSize = DefaultValue.PAGE_SIZE;
		if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageSize"))) { // 如果不为空的话改变当前页大小
			pageSize = Integer.parseInt(MapUtils.getString(condition, "pageSize"));
		}
		// 开始分页
		PageHelper.startPage(pageNum, pageSize);
		List<Coach> coachs = new ArrayList<Coach>();
		try {
			coachs = coachService.selectCoachDetail(condition);
			
		} catch (Exception e) {
			logger.error("getUsers error！", e);
		}
		PageInfo<Coach> pageInfo = new PageInfo<Coach>(coachs);
		return pageInfo;
	}

	/**
	 * 删除user
	 * 
	 * @param user
	 *            springMVC自动映射的实体
	 * @return
	 */
	@RequestMapping("deleteCoach")
	@ResponseBody
	public JSONResultUtil deleteCoach(String coachId) {
		//System.out.println("删除球员id:"+coachId);
		coachService.deleteCoach(coachId);
		return JSONResultUtil.ok();
	}

	/**
	 * 跳转打修改用户页面
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("updateCoach")
	public String updateCoach(String coachId, ModelMap map) {
		Map map1 = new HashMap();
		map1.put("coachId", coachId);
		List<Coach> coachs = coachService.selectCoachDetail(map1);
		List<Team> teams = teamService.findAllTeam();
		Coach coach = coachs.get(0);
		map.addAttribute("coach", coach);
		map.addAttribute("teams", teams);
//		System.out.println("修改用户id:"+userId);
		return "updateCoach";
	}

	/**
	 * 添加user
	 * 
	 * @param user
	 *            springMVC自动映射的实体
	 * @return
	 */
	@RequestMapping("doUpdateCoach")
	@ResponseBody
	public JSONResultUtil doUpdateUser(Coach coach) {
		coachService.updateCoach(coach);
		return JSONResultUtil.ok();
	}
	
	
	
}
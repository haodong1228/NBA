package cn.qs.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 整合layui+thymeleaf
 * 
 * @author Administrator
 *
 */
@Controller
public class Index {
	@RequestMapping("/index")
	public String index(ModelMap map) {
		map.addAttribute("name", "testname");
		return "index";
	}

	@RequestMapping("/welcome")
	public String welcome(ModelMap map) {
		return "welcome";
	}

	@RequestMapping("/bar")
	public String bar(ModelMap map) {
		return "bar";
	}

	@RequestMapping("/radar")
	public String radar(ModelMap map) {
		return "radar";
	}
	
	@RequestMapping("/playerinfo-list")
	public String playerinfo_list() {
		return "playerinfo-list";
	}
	
	@RequestMapping("/playerinfo-add")
	public String playerinfo_add() {
		return "playerinfo-add";
	}
	
	
	@RequestMapping("/teaminfo-list")
	public String teaminfo_list() {
		return "teaminfo-list";
	}
	
	@RequestMapping("/teaminfo-add")
	public String teaminfo_add() {
		return "teaminfo-add";
	}
	
	
	@RequestMapping("/chiefcoachinfo-list")
	public String chiefcoachinfo_list() {
		return "chiefcoachinfo-list";
	}
	
	@RequestMapping("/chiefcoachinfo-add")
	public String chiefcoachinfo_add() {
		return "chiefcoachinfo-add";
	}
	
	@RequestMapping("/marching4player")
	public String marching4player() {
		return "marching4player";
	}
	
	@RequestMapping("/playerrankinglist")
	public String playerrankinglist() {
		return "playerrankinglist";
	}
	
	@RequestMapping("/teamrankinglist")
	public String teamrankinglist() {
		return "teamrankinglist";
	}

	@RequestMapping("/fazhanguihua")
	public String fazhanguihua() {
		return "fazhanguihua";
	}
	
	@RequestMapping("/getwebinfo")
	public String getwebinfo() {
		return "getwebinfo";
	}
	
	@RequestMapping("/getwebinfolog")
	public String getwebinfolog() {
		return "getwebinfolog";
	}
	
	
	@RequestMapping("/user-list")
	public String member_list() {
		return "user-list";
	}
	
	@RequestMapping("/user-add")
	public String member_add() {
		return "user-add";
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(ModelMap map) {
		return "updateUser";
	}
	
	@RequestMapping("/updateTeam")
	public String updateTeam(ModelMap map) {
		return "updateTeam";
	}
	
	@RequestMapping("/updatePlayer")
	public String updatePlayer(ModelMap map) {
		return "updatePlayer";
	}
	
	@RequestMapping("/updateCoach")
	public String updateCoach(ModelMap map) {
		return "updateCoach";
	}
}

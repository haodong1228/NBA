package cn.qs.service.spyder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class spyderUtil {
	

	protected static final String PLAYERURL = "https://nba.hupu.com/players";

	protected static final String TEAMURL = "https://nba.hupu.com/teams";

	protected static Map<String, String> PlayerMap;

	protected static Map<String, String> TeamMap;

	public static List<String> PLAYERCOUNTLIST = new ArrayList<String>();

	public static List<String> TEAMCOUNTLIST = new ArrayList<String>();

	// 球员信息获取进度标志
	public static int PLAYNUMFALG = 0;

	// 球dui信息获取进度标志
	public static int TEAMNUMFALG = 0;

	// 进度条总数
	private static int TOTALNUM = 0;

	// 当前进度
	private static int NOWNUM = 0;
	
	// 线程标志 false:未使用  true：使用
	public static boolean PLAYERROADFALG = false; 
	
	// 线程标志 false:未使用  true：使用
	public static boolean TEAMROADFALG = false; 

	public static int getTOTALNUM() {
		return TOTALNUM;
	}

	public synchronized static void setTOTALNUM(int tOTALNUM) {
		TOTALNUM = tOTALNUM;
	}

	public static int getNOWNUM() {
		return NOWNUM;
	}

	public synchronized static void addNOWNUM() {
		NOWNUM += 1;
	}

	public spyderUtil() {

	}

	static {
		PlayerMap = new HashMap<String, String>();
		PlayerMap.put("姓名", "name");
		PlayerMap.put("位置", "location");
		PlayerMap.put("号码", "number");
		PlayerMap.put("身高", "height");
		PlayerMap.put("体重", "weight");
		PlayerMap.put("生日", "birth");
		PlayerMap.put("球队", "teamId");
		PlayerMap.put("学校", "school");
		PlayerMap.put("选秀", "showstyle");
		PlayerMap.put("国籍", "country");
		PlayerMap.put("本赛季薪金", "salary");
		PlayerMap.put("合同", "contract");
		PlayerMap.put("场次", "playRound");
		PlayerMap.put("时间", "time");
		PlayerMap.put("投篮", "shoot");
		PlayerMap.put("投篮命中率", "shootHitRate");
		PlayerMap.put("三分", "three");
		PlayerMap.put("三分命中率", "threeHitRate");
		PlayerMap.put("罚球", "penaltyShot");
		PlayerMap.put("罚球命中率", "psHitRate");
		PlayerMap.put("篮板", "backboard");
		PlayerMap.put("助攻", "remark1");
		PlayerMap.put("抢断", "steals");
		PlayerMap.put("盖帽", "blockShot");
		PlayerMap.put("失误", "error");
		PlayerMap.put("犯规", "breakRules");
		PlayerMap.put("得分", "score");

		TeamMap = new HashMap<String, String>();
		TeamMap.put("进入NBA", "intoTime");
		TeamMap.put("主教练", "coachName");
		TeamMap.put("分区", "area");
		TeamMap.put("官网", "url");
		TeamMap.put("主场", "homeCourt");

	}

	/*
	 * 加1
	 */
	protected static void addPlayNumFalg() {
		PLAYNUMFALG += 1;
	}

	/*
	 * 加1
	 */
	protected static void addTeamNumFalg() {
		TEAMNUMFALG += 1;
	}

	/*
	 * 获取当前时间
	 */
	protected String getNowTime() {
		String nowTime = "";
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		synchronized (dateFormat) {
			nowTime = dateFormat.format(now);
		}

		return nowTime;
	}

	// 初始化球员爬虫标识
	protected void initPlayBSdata() {
		PLAYNUMFALG = 0;
		TOTALNUM = 0;
		NOWNUM = 0;
		PLAYERCOUNTLIST.clear();
	}
	
	// 初始化球队爬虫标识
	protected void initTeamBSdata() {
		TEAMNUMFALG = 0;
		TOTALNUM = 0;
		NOWNUM = 0;
		TEAMCOUNTLIST.clear();
	}

}

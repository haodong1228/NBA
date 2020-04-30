package cn.qs.service.player;

public class Formatdata {
	public static Double format(String str){
		Double result = 0.0;
		if(str!=null&&!"".equals(str)){
			String temp = str.replace("%", "");
			result = Double.valueOf(temp);
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(format("35.8%"));
	}
}

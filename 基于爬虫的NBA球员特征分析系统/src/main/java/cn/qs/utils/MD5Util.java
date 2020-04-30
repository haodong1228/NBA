package cn.qs.utils;


import java.security.MessageDigest;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

public class MD5Util {
	/**
	 * 对数据进行加密   不可逆
	 * @param source
	 * @param salt
	 * @return
	 */
	public static String md5(String source, String salt) {
		String des = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			if (StringUtils.isNotBlank(salt)) {
				source = source + salt;
			}
			byte[] result = md.digest(source.getBytes());
			StringBuilder buf = new StringBuilder();
			for (int i = 0; i < result.length; i++) {
				byte b = result[i];
				buf.append(String.format("%02X", b));
			}
			des = buf.toString().toLowerCase();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("md5 failure");
		}
		return des;
	}

	
	/**
	 * 使用uuid生成主键
	 * @return
	 */
	public static String createID(){
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString();
		return id.replace("-", "");
	}
	
	public static void main(String[] args) {
		System.out.println(md5("qlq","111"));
		System.out.println(createID());
	}
}

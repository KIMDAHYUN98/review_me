package util;

public class StringUtil {

	// 1. String -> int
	public static int toInt(String s) {
		if(s == null) {
			return -1;
		}
		return Integer.parseInt(s);
	}
	
	// 2. int -> String
	public static String toStr(int i) {
		return Integer.toString(i);
	}
	
	// 3. String -> 확장자(String) : LastIndexOf, subString
	
	/**
	 * 파일명에서 확장자를 추출
	 * @param pathname
	 * 		  파일명
	 * @return 확장자
	 */
	
	public static String getExt(String s) {
		String result = "";
		int str = s.lastIndexOf(".");
		result = s.substring(str + 1, s.length());
		
		return result;
	}
	
	/**
	 * 파일명에서 확장자를 추출
	 * @param s 경로명 "c:/img/item/p01.jpg"
	 * @return 파일명 p01.jpg
	 */
	
	public static String getFileName(String s) {
		String result = "";
//		int str = s.lastIndexOf("/");
//		result = s.substring(str + 5, s.length());
		int str = s.lastIndexOf(".");
		result = s.substring(str + 1, s.length());
		return result;
	}
	
	/**
	 * 경로명에서 경로만 추출
	 * @param s 경로명 "c:/img/item/p01.jpg"
	 * @return 경로 c:/img/item
	 */
	
	public static String getPath(String s) {
		String result = "";
		int str = s.lastIndexOf("/");
		result = s.substring(0, str);
		return result;
	}
	

}

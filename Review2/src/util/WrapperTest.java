package util;

import java.util.Date;

public class WrapperTest {
	public static void main(String[] args) {
//		int result = StringUtil.toInt("1234");
//		System.out.println(result);
//		
//		String str = StringUtil.toStr(1234);
//		System.out.println(str);
//		
//		// 파일명에서 확장자만 추출
//		String ext = StringUtil.getExt("a.b.hwp");
//		System.out.println(ext);
//		
//		String ext2 = StringUtil.getFileName("c:/img/item/p01.jpg");
//		System.out.println(ext2);
//		
//		String ext3 = StringUtil.getPath("c:/img/item/p01.jpg");
//		System.out.println(ext3);
//		
		// Date
		
		Date date = DateUtil.toDate("2021-02");
		System.out.println(date);
		
//		String str = DateUtil.toStr(new Date());
//		System.out.println(str);
		
		String str = DateUtil.toStr2(new Date(), "yy-MM-dd");
		System.out.println(str);
	}
}

package util;

import java.io.File;

public class FileUtil {
	
	public static void main(String[] args) {
		// 폴더 생성
		File file = new File("C:\\doc/word");
		file.mkdir();
		
		// 폴더목록
		File dir = new File("C:\\Users\\mangg\\eclipse\\jee-2020-09\\eclipse");
		File[] list = dir.listFiles();
		for( File f : list) {
			System.out.println(f.getName() + " : " + f.isFile());
		}
	}

}

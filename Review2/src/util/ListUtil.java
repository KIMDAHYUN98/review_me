package util;

import java.util.ArrayList;

public class ListUtil {
	
	public static void main(String[] args) {
		
	
	ArrayList<String> list = new ArrayList<String>();
	
	// 추가
	
	list.add("애플망고");
	
	// 삽입(순서 상관X)
	
	list.add(0, "사과");
	
	// 수정
	
	list.set(1, "파인애플");
	
	// 삭제
	
	list.remove(1);
	
	// 한건 조회
	
	list.get(0);
	
	// 전체 조회
	
	System.out.println(list);
	
	}
}

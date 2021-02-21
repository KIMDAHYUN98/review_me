package util;

public class MapUtilTest {
	public static void main(String[] args) {
		
		MapUtil map = new MapUtil();
		
		map.addEmp(new Emp(1, "김다현", "개발"));
		map.addEmp(new Emp(2, "홍길동", "영업"));
		map.addEmp(new Emp(3, "박기자", "인사"));
		
		// 수정하기
		map.updEmp(1, new Emp(1, "rrr", "rrr"));
		
		// 해당 사원의 이름 조회
		String name = map.getName(2);
		System.out.println("사번 이름 : " + name);
		
		// 삭제
		map.delEmp(2);
		
		// 전체 조회
		//map.selectEmp();
		System.out.println(map.getMap());
		
	}
}

package util;

public class EmpListText {
	public static void main(String[] args) {
		
		EmpList empList = new EmpList();
		
		// 사원 추가
		empList.addEmp(new Emp(1, "김다현", "개발"));
		empList.addEmp(new Emp(2, "홍길동", "영업"));
		empList.addEmp(new Emp(3, "박기자", "인사"));
		
		// 2번 사원의 이름은 무엇입니까?
		System.out.println("2번 사원의 이름 : " + empList.getName(1));
		
		// 첫번째 사원 삭제
		empList.delEmp(1);
		empList.getNames();
		System.out.println(empList.getNameStr());
		
		// 전체 list  출력
		System.out.println(empList.getList());
	}
}

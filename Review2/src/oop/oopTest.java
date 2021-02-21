package oop;

import java.util.ArrayList;

/**
 * 다형성
 * 1. 부모타입의 참조변수가 자식 객체를 참조할 수 있다.
 * 2. 실행되는 메소드는 참조하는 객체의 메소드를 호출 한다.
 */

public class oopTest {

	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		// Member를 상속받는 모든 자식 객체들은 list에 담을 수 있다.
		
		Member member; // 부모타입의 참조변수
		
		member = new Prof(); // 자식객체를 참조 할 수 있다.
		member.setName("김유신");
//		member.print(); // Prof()의 print()
//		member.sal();
		list.add(member);
		
		member = new Emp();
		member.setName("홍길동");
//		member.print(); // Emp()의 print()
//		member.sal();
		list.add(member);
		
		// 기본 연산자 끼리 가능
		long a = 10;
		int b = (int)a;
		
		for(Member m : list) {
			m.sal();
			m.print();
			if(m instanceof Emp) {
				// 객체 간의 형변환은 부모-자식만 가능
				((Emp) m).meth(); // 다운 캐스팅(형변환)
			}
		}
		
//		for(int i=0; i < list.size(); i++) {
//			Member m = list.get(i);
//			m.sal();
//			m.print();
//		}

	}

}

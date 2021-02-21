package oop;


// 교수 클래스
public class Prof extends Member {
	
	String dept;

	@Override
	public void sal() {
		System.out.println("교수급여");
		
	}

	@Override
	public void print() {
		super.print();
		System.out.println("교수");
	}
}

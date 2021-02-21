package oop;

public abstract class Member { 
	
	// 캡슐화
	private String name;
	String id;
	
	// getter : reads
	// setter : writer

	public Member() {
		super();
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void sal();
	// 추상메소드, 클래스에 하나라도 추상메소드가 있으면 해당 클래스는 추상 클래스이다.
	// { ... } = body 부분

	public void print() {
		System.out.println(name);
		
	}

}
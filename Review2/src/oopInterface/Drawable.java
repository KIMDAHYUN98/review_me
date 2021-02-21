package oopInterface;

// 상수와 추상메소드만 다루는 것이 인터페이스
// 개발 표준 : 메서드(기능), 동작을 정의한다.
public interface Drawable {
	
	String color = "black";
	void draw(); // public abstract 생략 가능

}
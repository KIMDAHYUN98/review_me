package oopInterface;

public class Rect 
extends Shape // 속성, 메서드 (클래스는 단일 상속)
implements Drawable, Movable { // 메서드 동작, 기능들을 상속 받는다. (추상 메서드, 인터페이스는 다중 상속)
	
	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}

	@Override
	public void move() {
		System.out.println("사각형 이동");
		
	}

}

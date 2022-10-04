package co.edu.inherit.friend;

public class Cat extends Animal {
	
	// Animal 클래스의 추상 메소드 반드시 구현해줘야 함.
	@Override
	public void eat() {
		System.out.println("고양이가 먹이를 먹습니다.");
	}
	
	@Override
	public void speak() {
		System.out.println("야옹야옹.");
	}
}






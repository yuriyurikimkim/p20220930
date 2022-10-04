package co.edu.inherit;

public class Child extends Parent {
	String field1;
	
	Child() {
		super("args"); //부모클래스가 가지고 있는 생성자를 호출. super -> 부모를 가르킴.
		System.out.println("Child() call.");
	}
	
	void method1 () {
		System.out.println("method1() call.");
	}
	
	// 부모클래스의 메소드를 재정의. overriding. (반환값, 메소드의 이름, 매개값이 다 같아야함)
	@Override // 어노테이션 : 부모클래스의 method를 (반환값,메소드의이름,매개값) 체크
	void method() { //여기서 method는 부모클래스에서 정의되어있는 method
		System.out.println("Child method() call.");
	}
	
	@Override
	public String toString() {
		return "Child [field1=" + field1 + "]";
	}
	
}

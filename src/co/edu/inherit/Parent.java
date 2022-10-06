package co.edu.inherit;

public class Parent extends Object {//parent는 기본적으로 object를 상속받고 있음. (안 적어도 됨) object = 제일 최상위 클래스.
	String field;
	Parent() { 
		System.out.println("Parent() call.");
	} 
	Parent(String args) { //(string args) -> 매개값을 받는 생성자
		System.out.println("Parent(Stirng args) call.");
	}
	void method() {
		System.out.println("parent method() call.");
	}
	@Override
	public String toString() { //toString은 Object에 있는 메소드.
		return "Parent [field=" + field + "]";
	}
	
	
}

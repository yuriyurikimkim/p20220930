package co.edu.inherit;

public class MainApp {
	public static void main(String[] args) {
		Child child = new Child(); // field1, method1()
		child.method(); // Parent의 메소드.
		child.method1(); //Child의 메소드.
		
		Child2 child2 = new Child2();
		//child2.method(); -> child2는 parent 상속 받지 않음으로 method 쓸수없음
		child2.method2(); // Child2의 메소드.
		
		Parent c1 = new Parent(); // 오른쪽에 있는 값을 왼쪽에 할당하겠다는 할당연산자. 왼쪽과 오른쪽 타입이 같아야함.
		c1 = new Child();  // 부모 클래스의 변수에 자식 인스턴스를 대입가능.
		c1 = new Child2(); // 자동형변환(자식 클래스에 인스턴스가 부모클래스의 인스턴스로 자동적으로 형변환)
		
//		c1.method2(); // 부모 클래스의 멤버들만 호출가능.
		
		if(c1 instanceof Child2) { //c1이 child2의 인스턴스이면
			Child2 c2 = (Child2) c1; // 강제형변환(casting) 
			c2.method2();
		}
		
		Parent c3 = new Parent(); //
		if(c3 instanceof Child2) { //밑에 캐스팅작업 전에 if instanceof 구문 넣어주기
			Child2 c4 = (Child2) c3; //casting 작업
			c4.method2();
		}
	}
}

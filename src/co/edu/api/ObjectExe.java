package co.edu.api;

import java.util.HashSet;
import java.util.Set;

class Student {
	String name;
	int age;
	


	@Override
	public String toString() {
		return "학생의 이름은 " + name + ", 나이는 " + age + "입니다.";
	}
	
	// Set 컬렉션 : 동일한 인스턴스는 담아주지않는 컬렉션.
	@Override
	public int hashCode() { //객체가 가지고 있는 주소값, 독특한 값을 가지는 것을 16진수로 보여주는 값
		return age;
	}
	
	@Override
	public boolean equals(Object obj) { // 반환되는 타입이 boolean (return타입이 true/false)
		if (!(obj instanceof Student)) { // obj란 값이 Student의 인스턴스가 아니면. (앞에 ! 붙으면 not의 의미가 됨)
			return false;
		}
		Student str = (Student) obj;
//		return super.equals(obj); //super : 부모클래스
		if (this.name.equals(str.name) && this.age == str.age) // 이름,나이가 같으면 true로 반환하겠다.
			return true;

		return false;
	}
}

//모든 클래스의 최상위 Object.
public class ObjectExe {

	public static void main(String[] args) {

		Object obj = new Object();
		Object obj2 = new Object();

		System.out.println(obj.equals(obj2)); // obj == obj2

		Student s1 = new Student();
		s1.name = "Hong";
		s1.age = 10;
		Student s2 = new Student();
		s2.name = "Hong";
		s2.age = 10;
		String s3 = "Hong";

//		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode()); //s1만 적어주면 뒤에 toString 메소드가 실행된다.
		System.out.println(s2.hashCode()); //위에서 hashCode 리턴값을 age로 지정해놨기때문에 나이가 출력됨.
		
		// Set 컬렉션: 인터페이스 -> 구현 클래스를 통해서 인스턴스 생성 가능.
		// Set 컬렉션은 중복된 값을 받지않음.
		Set<Integer> set = new HashSet<Integer>(); //Integer타입만 담을수 있다.
		set.add(new Integer(100)); 
		set.add(new Integer(110)); 
		set.add(new Integer(100)); 
		
		//set 컬렉션을 썼기때문에 중복된 값 받지않아서 결과값 2.
		System.out.println("컬렉션의 크기 : " + set.size());
		
		
		// Set 컬렉션에 Student 인스턴스 저장시 논리적으로 동일한 인스턴스라고 판단.
		// HashCode(), equals() => 두개가 동일할때 기준.
		Set<Student> students = new HashSet<Student>();
		students.add(s1);
		students.add(s2);
		
		//s1,s2 age가 동일한 값이라서 결과값이 1이 나옴. (Hashcode = equals 같은값일때)
		System.out.println("컬렉션의 크기 : " + students.size());
	}
}

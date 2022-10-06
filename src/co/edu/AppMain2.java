package co.edu;

public class AppMain2 {
	public static void main(String[] args) {
		
		Student.staticMethod(); //정적 메소드.
		
		Math.random(); //정적 메소드 
		Math.round(.5); //정적 메소드
		
		//s1
		Student s1 = new Student();
//		s1.staticMethod(); // 노란 밑줄 : error는 아닌데 warning.
		
		s1.setStudentId("111-111");
		s1.setName("홍길동");
		s1.setMajor("컴퓨터공학");
		s1.setAge(20);
		
		System.out.println(s1.getStudentId()); // String = null 초기값 출력.
		System.out.println(s1.getAge()); // int = 0;
		System.out.println(s1.showInfo());
		
		System.out.println("여기=>>>" + s1);
		
		//s2
		Student s2 = new Student();
		
		s2.setStudentId("222-222");
		s2.setName("김민숙");
		s2.setMajor("경영학");
		System.out.println(s2.showInfo());
		
		String[] hob = {"독서", "자전거"};
		s1.setHobbies(hob);
		s1.addHobby("음악듣기");
		System.out.println(s1.getHobb());
		
		System.out.println(s2.getHobb());
		
		//s3
		Student s3 = new Student();
		System.out.println(s3.getName());
		
		//s4
		Student s4 = new Student("111-234", "김유리");
		System.out.println(s4.showInfo());
		
		Student s5 = new Student("222-223", "송지은", "역사학과");
		
	}
}

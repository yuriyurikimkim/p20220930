package co.edu;

// 하나의 실행클래스와 하나이상의 여러개의 라이브러리용 클래스가 필요함.
public class AppMain {
	public static void main(String[] args) {
		// Object -> Class(설계도) -> Instance(객체)
		Person kim = new Person();  // 인스턴스 생성.
		kim.name = "김민기";
		kim.age = 20;
		kim.sleep();
		kim.eat("떡볶이");
		
		Person lee = new Person();
		lee.name = "이순신";
		lee.age = 25;
		lee.sleep();
		lee.eat("고기");
		
		Student std1 = new Student();
//		std1.name = "최이름";
//		std1.studentId = "141105";
//		std1.major = "electric";
		std1.setName("김민기");
		std1.setStudentId("141105");
		std1.setMajor("electric");
		std1.sleep();
		std1.game("롤");
		
		Student std2 = new Student();
//		std2.name = "김현쥐";
//		std2.studentId = "150930";
//		std2.major = "electric";
		std2.setName("김현쥐");
		std2.setStudentId("150930");
		std2.setMajor("electric");
		std2.sleep();
		std2.game("모두의마블");
		
		Student std3 = new Student();
		
		Student[] students;
		students = new Student[] {std1, std2, std3};
		for(Student std : students) {
			System.out.println("학번 : " + std.getStudentId()+ ", 학생이름 : " + std.getName() + "입니다.");
		}
		
		// 상속.
		WorkMan wman = new WorkMan();
		wman.name = "직장인";
		wman.age = 30;
		
		StudentMan sman = new StudentMan();
		sman.school = "고등학교";
		sman.height = 164.3;
		
		
	}
}

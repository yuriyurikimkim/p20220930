package co.edu;

import java.util.Arrays;

//Object : 학생
// - 학번, 이름, 전공
// - 기능 : 공부한다, 게임을 한다, 잠을 잔다.

public class Student {
// 필드. 인스턴스 소속(static 없음)
	private String name;
	private String studentId;
	private String major;
	private int age; // 정수 값 23, 0, -12
	private String[] hobbies = new String[5];
	
	//정적 메소드. 클래스 소속(인스턴스 안만들어도 사용 가능)
	public static void staticMethod() {
		System.out.println("staticMethod call.");
	}
	
	
// 생성자 (필드의 값을 초기화) 생성자 오버로딩 (동일한 이름의 생성자를 여러번 정의)
	public Student() {
		// 매개값이 없는 생성자 => 기본 생성자.
		this.name = "기본값";
		this.studentId = "000-000";
		
	}
	public Student(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}
	public Student(String studentId, String name, String major) {
		this(studentId, name); //기본생성자 호출.
		this.major = major;
		
	}
	
	
// 메소드.(반드시 반환타입 정해줘야함. ex)void )
	//취미 set,get 
	void setHobbies(String[] hobbies) {
//		this.hobbies = hobbies;
		for(String hobby : hobbies) {
			for(int i=0; i<this.hobbies.length; i++) {
				if(this.hobbies[i]==null) {
					this.hobbies[i] = hobby;
					break;
				}
			}
		}
	}
	String[] getHobbies() {
		return this.hobbies;
	}
	
	String getHobb() {
		String str = "취미는 ";
		for(String hobby : hobbies) {
			if (hobby != null)
			str += hobby + " "; // str = str + hobby + " ";
		}
		str += "입니다.";
		return str;
	}
	
	// 또 다른 취미를 추가하고 싶을때.
	void addHobby(String hobby) {
		for(int i=0; i<hobbies.length; i++) {
			if(hobbies[i] == null) {
				hobbies[i] = hobby;
				break;
			}
		}
	}
	
	
	//학번 set, get
	void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	String getStudentId() {
		return this.studentId;
	}
	
	//학생 이름 set,get
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return this.name;
	}
	
	//전공 set, get
	void setMajor(String major) {
		this.major = major;
	}
	String getMajor() {
		return this.major;
	}
	
	void setAge(int age) {
		if(age < 0) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}
	
	//값을 불러오고 싶으면 getAge로 불러와야함.
	int getAge() {
		return this.age;
	}
	
	// showInfo() 
	public String showInfo() {
		return "이름은 " + this.name + "이고 학번은 " + this.studentId + "이고 전공은 " + this.major + " 입니다.";
	}
	
	
	void study() {
		System.out.println(name + "이 공부를 합니다.");
	}
	void game(String game) {
		System.out.println(name + "가 " + game + "을 합니다.");
	}
	void sleep() {
		System.out.println(name + "이 잠을 잡니다.");
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + ", major=" + major + ", age=" + age + ", hobbies="
				+ Arrays.toString(hobbies) + "]";
	}
	
	
}

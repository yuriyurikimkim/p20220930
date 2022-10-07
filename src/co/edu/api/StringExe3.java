package co.edu.api;

import java.util.ArrayList;
import java.util.List;

//내용물을 담기위한 Box라는 클래스 만들기.
class Box <T> { //T : type 타입 파라메터. 나중에 타입정하겠다는 뜻.
	T obj; 
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}

class Member {
	private String name;
	private String id;
	private int point;
	
	//Member 생성자
	public Member(String name, String id, int point) {
		super();
		this.name = name;
		this.id = id;
		this.point = point;
	}
	
	//get, set 메소드. // get: 가져오기 set:값을 지정.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}

class Employee {
	private String empName;
	private String empId;
	private int salary;
	
	//get,set 메소드.
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}



public class StringExe3 {
	public static void main(String[] args) {
		
		Box<String> box = new Box<String>(); //T로 쓰고나면 여기서 타입지정해주기.
		box.set("Hello");
//		box.set(200); //정수타입이라서 error.
		String result = box.get(); //문자열타입이면 casting 작업 해줘야함.
		System.out.println(result);
		
		String[] stAry; //문자열을 담을수 있는 배열.
		List<String> list = new ArrayList<String>(); 
		list.add("Hello java");
		System.out.println(list);
		
		List<Member> members = new ArrayList<Member>(); 
		members.add(new Member("홍길동", "hong", 10000)); //Member의 인스턴스만 담을수 있음.
		members.add(new Member("김민기", "kim", 20000));
		members.add(new Member("박인기", "park", 3000));
		
		//메소드 선언
		List<Employee> employees = changeType(members); //멤버라는 인스턴스를 담고있는 값(members)이 들어오면 => 
		//Employee 클래스타입으로 바꿔서 employee 인스턴스값으로 리턴해주는.
		for(Employee emp : employees) {
			System.out.println("name : "+ emp.getEmpName()+" , id : "+emp.getEmpId());
		}
	}
	
	//List<Member> = 매개변수 / List<Employee> = 반환값.
	public static List<Employee> changeType(List<Member> collect){
		// 3 -> 3개.
		//coding.
		
		List<Employee> empls = new ArrayList<Employee>();
		for(Member member : collect) { //멤버값 1건 1건 가져오기.
			Employee emp = new Employee();
			emp.setEmpId(member.getId());
			emp.setEmpName(member.getName());
			emp.setSalary(member.getPoint());
			
			empls.add(emp);
		}
		return empls;
		
		
	}
}

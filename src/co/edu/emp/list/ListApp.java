package co.edu.emp.list;

import java.util.ArrayList;

import co.edu.emp.Employee;

public class ListApp {
	public static void main(String[] args) {
		// 배열보다는 컬렉션(ArrayList, HashSet, HashMap)
		String[] strAry = new String[10]; //크기 지정.
		//Object <- 모든 클래스는 오브젝트타입의 자식.
		ArrayList<String> list = new ArrayList<String>(); //타입 지정 없으면 Object 타입으로 지정됨.
		list.add("Hello"); //위에서 <String> 해줬기 때문에 문자열만 담을수 있음.
		list.add("Employee");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));  //list가 가지고 있는 값 불러옴. 위에있는 hello, employee
		}
		
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(100); //<Integer> 선언 해줬으니 정수타입만 가능.
//		intList.add("100"); //불가능
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(100,"홍길동",1000)); //Employee 타입만 가능.
		empList.add(new Employee(200,"김민수",2000));
		empList.add(new Employee(300,"박인기",3000));
		empList.add(new Employee(400,"황석용",4000));
		
		String result = null;
		int salary = 0;
		for(int i=0; i<empList.size(); i++) {
			if(empList.get(i).getEmployeeId() == 200) {
				result = empList.get(i).getName();
				salary = empList.get(i).getSalary();
			}
		}
		System.out.println("이름은 " + result + "이고, 급여는 " + salary + "입니다.");	
	}
}

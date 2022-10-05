package co.edu.emp;

import java.util.ArrayList;
import java.util.Scanner;


//컬렉션을 활용해서 저장하는 기능
public class EmployeeArrayList implements EmployeeService {
	Scanner scn = new Scanner(System.in);
	ArrayList<Employee> list ;

	@Override
	public void init() {
		list = new ArrayList<Employee>(); //인스턴스를 할당해줘야 공간생김
		System.out.println("초기화 완료");
	}

	@Override
	public void input() {
		System.out.println("등록할 사원의 정보를 입력하시오");
		int eId=-1;
		while(true) {
			try {
				System.out.println("사번>> ");
				eId = Integer.parseInt(scn.nextLine());
				break;
			}catch(Exception e) {
				System.out.println(" [숫자를 입력하시오] ");
			}
		}
		
		System.out.println("이름>> ");
		String name = scn.nextLine();
		int deptId = -1;
		while(true) {
			try {
				System.out.println("부서번호(10,20,30)>> ");
				deptId = Integer.parseInt(scn.nextLine());
				if(deptId !=10 && deptId !=20 && deptId !=30) {
					System.out.println(" [부서번호는 10, 20, 30 중 하나입니다] ");
				}else {
					break;
				}
			}catch(Exception e){
				System.out.println(" [숫자를 입력하시오] ");
			}
		}
		int sal =-1;
		while(true) {
			try {
				System.out.println("급여>> ");
				sal = Integer.parseInt(scn.nextLine());
				break;
			}catch(NumberFormatException e) {
				System.out.println(" [숫자를 입력하시오] ");
			}
		}
		System.out.println("이메일>> ");
		String email = scn.nextLine();
		try {
			list.add(new Employee(eId, name, sal, deptId, email));
			System.out.println(eId + " - " + name + ", 부서번호: " + deptId + " 등록완료");
		}catch(NullPointerException e) {
			System.out.println(" [사원수 초기화(메뉴1)을 먼저 실행하시오] ");
		}
	}

	@Override
	public String search(int employeeId) {
		String result = null;
//		for (int i = 0; i < list.size(); i++) { // null체크안해두됨
//			if (list.get(i).getEmployeeId() == employeeId) {
//				result = list.get(i).getName();
//				break;
//			}
//		}
		for(Employee emp: list) {
			if (emp.getEmployeeId() == employeeId) {
				result = emp.getName();
				break;
			}
		}
		return result;
	}

	@Override
	public void print() {
		System.out.printf("%5s %8s %5s\n", "부서번호","이름","급여");
		System.out.println("========================");
		try {
			for(int i=0; i<list.size(); i++) {
				System.out.printf("%5d %10s %7d\n", //
						list.get(i).getEmployeeId(), //
						list.get(i).getName(), //
						list.get(i).getSalary()); //인트타입:d, 문자타입:s
			}
		}catch(NullPointerException e) {
			System.out.println("  입력된 사원정보가 없습니다  \n"//
					+ "  사원수 초기화를 진행하시오");
		}
		System.out.println("========================");
	}

	@Override
	public int searchSal(int employeeId) {
		int result = -1;
		for (Employee emp:list) { // null체크안해두됨
			try {
				if (emp.getEmployeeId() == employeeId) {
					result = emp.getSalary();
					break;}
			}catch(NullPointerException e1) {
				System.out.println(" [사원정보를 입력해주세요] ");
			}
		}
		return result;
	}
}

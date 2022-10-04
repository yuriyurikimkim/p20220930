package co.edu.emp;

import java.util.Scanner;

// 배열을 활용해서 정보를 저장.
public class EmployeeArray implements EmployeeService{

	//저장공간 생성.
	Employee[] list; 
	int idx; // 따로 선언 안하면 초기값이 0값임.
	Scanner scn = new Scanner(System.in);
	
	@Override
	public void init() {
		System.out.println("사원수를 입력 >> ");
		int cnt = Integer.parseInt(scn.nextLine());
		list = new Employee[cnt]; //5개 인스턴스를 저장할 수 있는 공간생성.
	}

	@Override
	public void input() {
		
		if(idx >= list.length) {
			System.out.println("더 이상 입력불가합니다.");
			return; // 메소드 종료.
		}
		
		System.out.print("사번을 입력 >> ");
		int eId = Integer.parseInt(scn.nextLine());
		System.out.print("이름을 입력 >> ");
		String name = scn.nextLine();
		System.out.print("부서를 입력 >> ");
		int deptId = Integer.parseInt(scn.nextLine());
		System.out.print("급여를 입력 >> ");
		int sal = Integer.parseInt(scn.nextLine());
		System.out.print("이메일 입력 >> ");
		String email = scn.nextLine();
		
		Employee emp = new Employee(eId, name, sal, deptId, email);
		list[idx++] = emp; //0부터 시작.
		
	}

	@Override
	public String search(int employeeId) {
	
		return null;
	}

	@Override
	public void print() {
		for(int i=0; i<idx; i++) {
			System.out.printf("%5d %10s %7d\n",  //printf -> 포맷 
					list[i].getEmployeeId(), 
					list[i].getName(), 
					list[i].getSalary()); 
			
		}
		
	}

}

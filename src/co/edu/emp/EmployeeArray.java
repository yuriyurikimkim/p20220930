package co.edu.emp;

import java.util.Scanner;

// 배열을 활용해서 정보를 저장.
public class EmployeeArray implements EmployeeService{

	//저장공간 생성.
	Employee[] list; 
	int idx = 0; // 따로 선언 안하면 초기값이 0값임.
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
		// 입력 된 값중에서 찾도록. 배열의 크기는 list[5] => idx 값(초기값 0, 한건 들어가면 1이됨)
		// 100,200,300
		String result = null;
		for (int i=0; i<idx; i++) {
			if(list[i].getEmployeeId() == employeeId) { //int타입이라서 == 가능, 문자열 타입이면 equals 써야함
				result = list[i].getName(); //result라는 변수에 값을 담아줌.
				break;
			}
		}
		return result;
	}

	@Override
	public void print() {
		for(int i=0; i<idx; i++) {
			System.out.printf("%5d %10s %7d\n",  //printf -> 포맷 d:int / s:string(문자열개수) 
					list[i].getEmployeeId(), 
					list[i].getName(), 
					list[i].getSalary()); 
			
		}
		
	}

	@Override
	public int searchSal(int employeeId) {
		//사번을 넣으면 급여를 반환하도록. (int 타입으로)
		int result = -1; //int타입은 null을 초기값으로 줄수없어서 -1으로 설정.
		for(int i=0; i<idx; i++) {
			if(list[i].getEmployeeId() == employeeId) { 
				result = list[i].getSalary(); //result라는 변수에 값을 담아줌.
				break;
			}
					
		}
		return result;
	}

}

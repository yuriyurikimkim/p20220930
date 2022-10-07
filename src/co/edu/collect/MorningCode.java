package co.edu.collect;

import java.util.ArrayList;
import java.util.Scanner;

//클래스
class Employ {
	int empId;
	String empName;
	int salary;

//생성자 만들기.
	public Employ(int empId, String empName, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
	public class MorningCode {
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			ArrayList<Employ> list = new ArrayList<>();

			System.out.println("입력 >> ex) 100 홍길동 2500");
			while (true) {
				String inputVal = scanner.nextLine(); // 키보드로 입력하는걸 저장시킨다.
				String[] inputs = inputVal.split(" ");

				// quit => 종료.
				if (inputs[0].equals("quit")) {
					break;
				}

				if (inputs.length != 3) {
					System.out.println("다시 입력 하세요!");
					continue; // 다시!
				}
				list.add(new Employ(Integer.parseInt(inputs[0]), inputs[1], Integer.parseInt(inputs[2])));
			}

			// 첫번째 값 => empId, 두번째 값 => empName, 세번째 값 => salary
			// Employee 클래스의 인스턴스를 생성.

			// ArrayList에 저장.

			// for(반복문) 출력.
			for(int i=0; i<list.size(); i++) {
				System.out.printf("사번은 %d, 이름은 %s, 급여는 %d\n",//
						list.get(i).getEmpId(), list.get(i).getEmpName(), list.get(i).getSalary());
			}	
			System.out.println("end of prog.");

		}
	}


package co.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee {
	int empId;
	String name;
	int salary;

	// 생성자
	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	// 동일한 객체를 판단하는 기준 : hashcode, equals.
	@Override
	public int hashCode() {
		return empId; // 기준 넣기
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee target = (Employee) obj; // casting작업. (강제 형변환)
			return (this.empId == target.empId // id, name, salary 다 같아야 동등한 객체로 보겠다는 조건
					&& this.name == target.name && this.salary == target.salary);

		} else {
			return false;
		}

	}

}

public class SetExample {
	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee(100, "우드스톡", 1000));
		employees.add(new Employee(200, "페퍼민트", 2000));
		employees.add(new Employee(300, "루시", 3000));
		employees.add(new Employee(100, "우드스톡", 4000));

		employees.remove(new Employee(100, "우드스톡", 4000));

		System.out.println(employees.size()); // 위에서 hashcode, equals 기준 넣어줬기 때문에 사이즈가 3이 나옴.

		Iterator<Employee> iter = employees.iterator();
		while (iter.hasNext()) {
			Employee emp = iter.next(); // 1건 가져오기
			System.out.printf("사번은 %d, 이름은 %s, 급여는 %d \n", emp.empId, emp.name, emp.salary);
		}

		Set<Integer> set = new HashSet<Integer>();

		// 중복허용X.
		while (set.size() < 7) { // size가 7가 될때까지 동안에
			set.add((int) (Math.random() * 45) + 1);
		}
		for(int n : set) {
			System.out.println(n);
		}
		
		
		
		
		// 중복저장 불가.
//		int[] lotto = new int[7];
//		for (int i = 0; i < lotto.length; i++) {
//			boolean exists = false;
//			int temp = (int) (Math.random() * 7) + 1;
//			System.out.println("lotto 숫자는 : " + lotto[i]);
//
//			// 현재 인덱스 값보다 적은 위치에 temp라는 변수랑 같은 값이 있는지 체크.
//
//			for (int j = 0; j < i; j++) {
//				// 같은 값이 있으면 ..
//				if (temp == lotto[j]) {
//
//				}
//				exists = true;
//
//			}
//			// continue;
//			if (exists) {
//				continue;
//			} else {
//				lotto[i] = temp;
//			}
//		}
//		for (int n : lotto) {
//			System.out.printf("%d ", n);
//		}

	}
}

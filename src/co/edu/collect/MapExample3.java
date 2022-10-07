package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
	String name;
	String score;

	public Student(String name, String score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student target = (Student) obj;
			return this.name.equals(target.name);
		} else {
			return false;
		}
	}

}

public class MapExample3 {
	public static void main(String[] args) {
		// 1.저장 2.조회 3.종료
		Map<String, Integer> students = new HashMap<>();

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("1.저장 2.조회 3.종료");
			System.out.print("선택 >> ");

			int menu = scn.nextInt();
			if (menu == 1) {
				// 저장
				System.out.println("학생 이름 입력하세요 >> ");
				String name = scn.nextLine();
				System.out.println("학생 점수 입력하세요 >> ");
				int score = scn.nextInt();
				
				// key, value값으로 저장하는거 만들기
				students.put(name, score);
				
			} else if (menu == 2) {
				// 조회
				System.out.println("조회할 학생 이름 입력하세요 >> ");
				String searchName = scn.nextLine();
				System.out.println("점수: " + students.get(searchName));
				
			} else if (menu == 3) {
				// 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		} // end of while
		System.out.println("프로그램이 종료되었습니다.");
	}
}

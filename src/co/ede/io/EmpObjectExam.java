package co.ede.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class Emp2 implements Serializable { // Serializable : 인터페이스.
	int id;
	String name;
	String dept;

	// 생성자
	public Emp2 (int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "사원id: " + id + ", 이름: " + name + ", 부서: " + dept;
	}
}

public class EmpObjectExam {
	
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		Scanner scn = new Scanner(System.in);
		ArrayList<Emp2> empList = new ArrayList();
		
		// C:/Temp/emp.dat 읽어들이는 기능 만들어주기.
		try {
		FileInputStream fis = new FileInputStream("C:/Temp/emp.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		empList = (ArrayList<Emp2>) ois.readObject();
		}catch(FileNotFoundException e){
			System.out.println("신규작성.");
		}
		while(true) {
			System.out.println("1.사원등록 2.목록출력 3.종료");
			System.out.print("선택 >> ");
			
			int menu = scn.nextInt();
			
			if(menu == 1) {
				System.out.println("등록할 사원의 이름을 입력하세요 >> ");
				String temp = scn.nextLine();
				System.out.println("사원 등록이 완료되었습니다.");
				
			} else if (menu == 2) {
				//전체 목록 출력
				
				System.out.println("목록 출력이 완료되었습니다.");
				
				
			} else if (menu == 3) {
				// 컬렉션에 있던 ObjectOutputStream을 활용해서 C:/Temp/emp.dat 저장.
				try (FileOutputStream fos = new FileOutputStream("C:/Temp/emp.dat");
						ObjectOutputStream oos = new ObjectOutputStream(fos); // 보조 스트림.
				) { 
					oos.writeObject(empList);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}
		}
	}
}

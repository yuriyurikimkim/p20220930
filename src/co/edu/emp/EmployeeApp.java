package co.edu.emp;

import java.util.Scanner;

//메인 클래쓰
public class EmployeeApp {
	public static void main(String[] args) {
		//1. 사원수(초기화) 2.사원정보입력 3.사원검색 4.사원리스트 9.종료
		Scanner scn = new Scanner(System.in);
		EmployeeService service = new EmployeeArrayList();
		
		while(true) {
			System.out.println(//
					"\n1.사원수(초기화) 2.사원정보입력 3.사원검색 4.사원리스트 "//
					+ "5.사원급여 9.종료");
			System.out.print("메뉴 선택 >>");
			try {
				int menu = Integer.parseInt(scn.nextLine());
				if(menu ==1) {
					service.init();
				}else if(menu == 2) {
					service.input();
				}else if(menu == 3) {
					while(true) {
						System.out.println("찾을 사원 번호 >> ");
						try {
							int eId = Integer.parseInt(scn.nextLine());
							String name = service.search(eId);
							if (name == null) {
								System.out.println("찾는 사원정보가 없습니다");
							}else {
								System.out.println("사원의 이름은 "+name);
							}
							break;
						}catch(NumberFormatException e) {
							System.out.println(" [숫자를 입력하시오] ");
						}catch(NullPointerException e1) {
							System.out.println(" [사원정보를 입력하세요] ");
						}
					}//menu3 while end
				}else if(menu == 4) {
					service.print();
				}else if(menu == 5) {//사번을 입력하면 급여정보 반환ㄱㄱ
					while(true) {
						System.out.println("사원 번호 >> ");
						try {
							int eId = Integer.parseInt(scn.nextLine());
							int sal = service.searchSal(eId);
							if (sal == -1) {
								System.out.println("찾는 사원정보가 없습니다");
							}else {
								System.out.println("사원의 급여는 "+sal+" 만원");
							}
							break;
						}catch(NumberFormatException e) {
							System.out.println(" [숫자를 입력하시오] ");
						}catch(NullPointerException e1) {
							System.out.println(" [사원정보를 입력하세요] ");
						}
					}//menu 5 while 끝
				}else if(menu == 9) {
					System.out.println("프로그램을 종료합니당");
					break;
				}else {
					System.out.println("잘못된 메뉴를 선택하셨습니다");
				}
				//예외처리, RuntimeException상속받아서 처리하는 예외클래스
			}catch(Exception e3) { 
				System.out.println(" [메뉴 번호를 다시 입력하세요] ");
			}
		}//end of while
		System.out.println("프로그램 종료");
	}//end of main()
}//end of class

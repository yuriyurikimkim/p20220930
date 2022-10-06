package co.edu.inherit.friend;

 

import java.util.ArrayList;

import java.util.Scanner;

 

public class FriendExe {

	Scanner scn = new Scanner(System.in);

	ArrayList friends = new ArrayList();

	//친구등록하긔 - 학교/회사/이름+연락처 구분해서 등록

//	Friend[] friends = new Friend[10]; ->배열형식 사용시

	

	public void exe() {

		boolean run = true;
		while(run) {

			System.out.println("1.친구 등록 2.친구 조회 3.종료");

			System.out.print("선택>>");

			int menu = scn.nextInt();
			scn.nextLine();

			if(menu ==1) {

				System.out.println("\n1.회사친구 2.학교친구 3.친구");
				int subMenu = scn.nextInt();
				scn.nextLine();

				if(subMenu ==1) {
					addComFriend();

				}else if(subMenu ==2) {
					addUnivFriend();

				}else if(subMenu ==3) {
					addFriend();

				}else {
					System.out.println("잘못된 메뉴번호를 입력했습니다.");
				}

			}else if(menu ==2) {
				searchFriend();
			
			}else if(menu ==3) {
				System.out.println("프로그램을 종료합니다");
				run = false;
				break;

			}else {
				System.out.println("잘못된 메뉴번호를 입력했습니다.");
			}
		}
	}//end of exe

	

//추가 메쏘오드

	public void addFriend() {

		System.out.println("3.친구");

		System.out.println("이름과 연락처를 입력하시오");

		System.out.print("이름>>");

		String name = scn.nextLine();

		System.out.println("연락처>>");

		String phone = scn.nextLine();

		

		Friend frnd = new Friend(name, phone);

 

		friends.add(frnd);

		System.out.println(name +", "+ phone +"정보가 등록완료되었습니다.");

//		for(int i=0; i<friends.length; i++) {

//			if(friends[i] == null) {

//				friends[i]= frnd;

//				System.out.println(name +", "+ phone +"정보가 등록완료되었습니다.");

//				break;

//			}

//		}

		

	}

	

	public void addUnivFriend() {

		System.out.println("2.학교친구");

		System.out.println("이름, 연락처, 학교명, 전공을 순서대로 입력하시오");

		System.out.println("이름>>");

		String name = scn.nextLine();

		System.out.println("연락처>>");

		String phone = scn.nextLine();

		System.out.println("학교명>>");

		String univ = scn.nextLine();

		System.out.println("전공>>");

		String major = scn.nextLine();

		UnivFriend univFrnd = new UnivFriend(name, phone, univ, major);

 

		friends.add(univFrnd);

		System.out.println("학교 친구 정보가 등록완료되었습니다.");

//		for(int i=0; i<friends.length; i++) {

//			if(friends[i] ==null) {

//				friends[i] = uniFrnd;

//				System.out.println("학교 친구 정보가 등록완료되었습니다.");

//				break;

//			}

//		}

	}

	

	public void addComFriend() {

		System.out.println("1.회사친구");

		System.out.println("이름, 연락처, 회사명, 부서명을 순서대로 입력하시오");

		System.out.print("이름>>");

		String name = scn.nextLine();

		System.out.print("연락처>>");

		String phone = scn.nextLine();

		System.out.print("회사명>>");

		String company = scn.nextLine();

		System.out.print("부서명>>");

		String dept = scn.nextLine();

		

		ComFriend comfrnd = new ComFriend(name, phone, company, dept);

		

		for(int i=0; i<friends.size(); i++) {

			if(friends.get(i) ==null) {

				friends.add(comfrnd);

				System.out.println("회사 친구 정보가 등록완료되었습니다.");

				break;

			}

		}

	}

//2.친구조회

	public void searchFriend() {

		System.out.println("조회할 이름을 입력하시오");

		String name = scn.nextLine();

		

		for(int i=0; i<friends.size(); i++) {//어떤 유형인지 체크 후 출력

//Friend 클래스의 상속을 사용, Friend, ComFriend, UnivFriend 인스턴스

			Object frd = friends.get(i);

			if (frd instanceof Friend) {

				Friend frnd= (Friend) frd;

				System.out.println(frnd.showInfo());

				

			}else if(frd instanceof ComFriend) {

				ComFriend frnd= (ComFriend) frd; 

				System.out.println(frnd.showInfo());

				

			}else if(frd instanceof UnivFriend) {

				UnivFriend frnd= (UnivFriend) frd;

				System.out.println(frnd.showInfo());

			}

		}

		

//		for(int i=0; i<friends.length(); i++) {

//			if(friends[i].getName().contains(name)){

//				System.out.println(friends[i].showInfo());

//			}

//		}

	}

}
package co.edu.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StringExe {
	public static void main(String[] args) {

		// Data.text 파일에서 자바 들어간 문자열만 출력해주기.

//		String fileName = "src/co/edu/api/Data.text";
//		File file = new File(fileName);
//		
//		String searchKey = "자 바"; //
//		searchKey = searchKey.replace(" ", ""); //공란을 지워주겠다는 뜻.
//		
//		Scanner scn = null;
//	
//		
//		try {
//			scn = new Scanner(file);
//			
//			while (true) {
//				String str = scn.nextLine();
//				
//				if (str == null) {
//					break;
//			}
//			if(str.indexOf(searchKey) != -1){
//				System.out.println(str);
//			} else {
//				
//			}
//		}
//		
//		
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (NoSuchElementException e1) {
//			System.out.println("end of prog.");
//		}

		String fileName = "src/co/edu/api/Birth.text";

		File file = new File(fileName);

		Scanner scn = null;

		try {

			scn = new Scanner(file);

			while (true) {

				String str = scn.nextLine();

				// 년월일 유효판별

				int Month = Integer.parseInt(str.substring(2, 4)); // 월 잘라와서 인트로 변환
				int Day = Integer.parseInt(str.substring(4, 6)); // 일 잘라와서 인트로 변환
				if (Month > 12 || Month < 1) {
					System.out.println("유효한 달이 아닙니다");
				} else if (Day > 31 || Day < 1) {
					System.out.println("유효한 일이 아닙니다");
				} else {

					// 성별판별
					String endstr = str.substring(str.length() - 7, str.length());// 뒤에서부터 잘라내기
					char num = endstr.charAt(0);

					if (str == null) {
						break;
					}

					if (num == '2' || num == '4') {
						System.out.println(str + "는 여자입니다");

					} else if (num == '1' || num == '3') {
						System.out.println(str + "는 남자입니다");

					} else {
						System.out.println("이세계 사람이 아닙니다");
					}
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e1) {

		} // end of try

		System.out.println("end of prog.");
	}// end of main

}// end of class
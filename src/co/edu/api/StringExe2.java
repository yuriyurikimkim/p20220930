package co.edu.api;

import java.util.Scanner;

public class StringExe2 {
//	public static void main(String[] args) {
//		System.out.println("abcDEF".toUpperCase());
//	while(true) {
//		try {
//			int bytes = System.in.read();
//			if (bytes == 122)
//				break;
//			
//			System.out.println("입력 값 : " + bytes);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//		System.out.println("end of prog.");
//	}


	//public static void changeCapital(String msg) {
		// 대문자 -> 소문자, 소문자-> 대문자 (두개의 값의 차가 32임)
		// aBcD => AbCd   97:65, 98:66     122
		// 소문자 : 97~122, 대문자: 65~90
	
	public static void main(String[] args){
		//대문자->소문자, 소문자->대문자
		//aBcD -> AbCd, 97~122 : 소문자, 65~90 : 대문자
		//소문자 바이트값 - 대문자 바이트값 = 32(아스키코드)
		System.out.println("알파벳을 입력하시오");
		Scanner scn = new Scanner(System.in);

		
		String origin = scn.nextLine();
		String newone ="";
		for(int i= 0; i<origin.length(); i++) {
			char x = origin.charAt(i);
			int bytes = x;
			if( bytes>=65 &&bytes<=90) {
				bytes += 32;

			}else if(bytes>=97 &&bytes<=122) {
				bytes -= 32;

			}else {
				System.out.println("알파벳을 입력하시오");
				break;
			}

			char y = (char) bytes;
			newone += y;
		}

		System.out.println(newone);

	}//end of main


	



}
package co.edu.api;

import java.io.IOException;

public class StringExe2 {
	public static void main(String[] args) {
//		System.out.println("abcDEF".toUpperCase());
	while(true) {
		try {
			int bytes = System.in.read();
			if (bytes == 122)
				break;
			
			System.out.println("입력 값 : " + bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		System.out.println("end of prog.");
	}


	public static void changeCapital(String msg) {
		// 대문자 -> 소문자, 소문자-> 대문자 (두개의 값의 차가 32임)
		// aBcD => AbCd   97:65, 98:66     122
		// 소문자 : 97~122, 대문자: 65~90
	}
}

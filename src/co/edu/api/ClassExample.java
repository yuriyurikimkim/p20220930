package co.edu.api;

import java.io.UnsupportedEncodingException;

public class ClassExample {
	public static void main(String[] args){
		//1번 예제
//		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
//		
//		String str1 = new String(bytes);
//		System.out.println(str1);
//		
//		String str2 = new String(bytes,6,4); //6: 74의 인덱스 위치 , 4:4개
//		System.out.println(str2);
		
		//2번 예제
//		byte[] bytes = new byte[100]; //읽은 바이트를 저장하기 위한 배열 생성
//		
//		System.out.println("입력 : ");
//		int readByteNo = System.in.read(bytes); //배열에 읽은 바이트를 저장하고 읽은 바이트 수를 리턴.
//		
//		String str = new String(bytes, 0, readByteNo-2); //배열을 문자열로 변환.
//		System.out.println(str);
		
		//3번 예제 (주민등록번호에서 남/여 구분)
//		String ssn = "010624-4230123";
//		char sex = ssn.charAt(7);
//		switch (sex) {
//		case '1' :
//		case '3' :
//			System.out.println("남자입니다.");
//			break;
//		
//		case '2' :
//		case '4' : 
//			System.out.println("여자입니다.");
//			break;
//		}	
	
		//4번 예제 (문자열 비교)
//		String strVar1 = new String("신민철");
//		String strVar2 = "신민철";
//		
//		if(strVar1 == strVar2) {
//			System.out.println("같은 String 객체를 참조");
//		} else {
//			System.out.println("다른 String 객체를 참조");
//		}
//	
//		if(strVar1.equals(strVar2)) { //문자열을 비교할때는 ==가 아닌 .equals를 사용해야 한다.
//			System.out.println("같은 문자열을 가짐");
//		} else {
//			System.out.println("다른 문자열을 가짐");
//		}
	
		//5번 예제(바이트 배열로 변환)
//		String str = "안녕하세요";
//		
//		byte[] bytes1 = str.getBytes();
//		System.out.println("bytes1.length: " + bytes1.length);
//		String str1 = new String(bytes1);
//		System.out.println("bytes1 -> String: " + str1);
//		
//		try {
//			byte[] bytes2 = str.getBytes("EUC-KR");
//			System.out.println("bytes2.length: "+ bytes2.length);
//			String str2 = new String(bytes2, "EUC-KR");
//			System.out.println("bytes2 -> String: " + str2);
//			
//			byte[] bytes3 = str.getBytes("UTF-8");
//			System.out.println("bytes3.length : "+bytes3.length);
//			String str3 = new String(bytes3, "UTF-8");
//			System.out.println("bytes3 -> String: " + str3);
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
		
		//6번 예제(문자열 포함 여부 조사)
//		String subject = "자바 프로그래밍";
//		
//		int location = subject.indexOf("프로그래밍");
//		System.out.println(location);
//		
//		if(subject.indexOf("자바") != -1) { //"자바"라는 문자열이 포함되어있으면.
//			System.out.println("자바와 관련된 책이군용");
//		} else {
//			System.out.println("자바와 관련없는 책이군용");
//		}
//	
		//7번 예제(문자열의 문자수 얻기)
//		String ssn = "9506202727272";
//		int length = ssn.length();
//		if (length == 13) {
//			System.out.println("주민번호 자리수가 맞습니당");
//		} else {
//			System.out.println("주민번호 자리수가 틀립니다. 다시 확인하세욤");
//		}
//				
	
		//8번 예제(문자열 대치하기)
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
	
	}
}

package co.edu.inherit.friend;

import java.util.ArrayList;

public class ArrayExam {
		public static void main(String[] args) {
			String[] flowers = new String[3];
			flowers[0] = "장미";
			flowers[1] = "해바라기";
			flowers[2] = "무궁화꽃";
//			flowers[3] = "목련";
			
			// flowers2 선언.
			String[] flowers2 = new String[6];
		
			
			for(String str : flowers2) {
				if(str != null) {
					System.out.println(str);
			}
		}
			
		// 배열의 크기가 정해지고 나면 고정 => 컬렉션(ArrayList);
		// 모든 요소를 다 담기위해 데이터 타입이 object 타입으로 저장할수 있게 해야함.
		// Object : 모든 클래스의 최상위 클래스.
			
		ArrayList flowers3 = new ArrayList(); //크기 지정 안하면 크기 10개 공간생성.
		flowers3.add("장미"); //첫번째 위치 장미저장.
		flowers3.add("해바라기"); //두번째 위치 (인덱스를 지정하지 않아도 자동으로 저장됨)
		flowers3.add("무궁화꽃");
//		flowers3.add(123);
		
//		for (Object str : flowers3) {
//			String result = (String) str;
//			System.out.println(result);
			
//		}
		
		// 컬렉션의 크기 : size();
		for(int i=0; i<flowers3.size(); i++) { //length가 아니라 size (배열이 아니라 size써야함)
			String result = (String) flowers3.get(i);
			System.out.println(result);
		}
	}
}

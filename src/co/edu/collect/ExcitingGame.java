package co.edu.collect;

import java.util.ArrayList;
import java.util.Scanner;

public class ExcitingGame {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		long gameStart = System.currentTimeMillis();
		long gameEnd;
		String target = "안녕하세요 지금은";
		
		String[] targetAry = target.split(" ");
		ArrayList game = new ArrayList();
		for(int i=0; i<targetAry.length; i++) {
			game.add(targetAry[i]);
		}
		
		
		while(true) {
			if(game.size() == 0) {
				gameEnd = System.currentTimeMillis();
				break;
			}
			System.out.println("\n단어 입력>> ");
			String word = scn.nextLine();
			for(int i=0; i<game.size(); i++) {
				if(game.get(i).equals(word)){
					game.remove(i);
				}
			}
			for(int i=0; i<game.size(); i++) {
				System.out.printf("%s ", game.get(i));
			}
		}
		
		
		
		long during = (gameEnd - gameStart); // 1*60*1000(1분) + 30*1000(30초) = 63000/60000(1분으로 나눈다)분, 63000%6000 초 => 
		
		long min = during /(60*1000);
		long sec = during /1000-min*60;
		long msec = during % 1000;
		
		System.out.println(min+"분 "+sec+"초 "+msec);
	}
}

//		if (targetAry[0].equals("안녕하세요")) {
//			targetAry[0] = null; //0번에 있는걸 null로 덮어쓰기.
//		}
//
//		for(String str : targetAry) {
//			if (str != null) {
//				System.out.printf("%s ",str);
//			}
//		}
		


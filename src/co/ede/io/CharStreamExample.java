package co.ede.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamExample {
	
	
	public static void main(String[] args) {
		read();	
	}
	
	
	public static void read() {
		
		try {
			FileReader reader = new FileReader("C:/Temp/addr.txt");
			
			while(true) {
				int bytes = reader.read(); //한 바이트씩 읽어들이겠다.
				if (bytes == -1) { // 읽어들일 값이 없으면 -1로 리턴.
					break;
				}
				System.out.print((char) bytes + " "); //정수타입을 char타입으로 바꿔서 출력.
			}
			reader.close(); // 사용이 끝나면 close.
			System.out.println("completed.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
		public static void write() {
		Scanner scn = new Scanner(System.in);
		
		// 문자기반의 스트림 생성. Reader / Writer (둘 다 젤 상위 스트림)
		try {
			FileWriter fw = new FileWriter("C:/Temp/addr.txt"); //출력 스트림
			
			while(true) {
				System.out.print(">> ");
				String temp = scn.nextLine(); //한 라인씩 읽어들이기. 읽어들인애를 temp에 담기
				if(temp.equals("quit"))
					break;
				
				fw.write(temp + "\n");
			}
			
			fw.close(); //작업끝났으면 close 해주기.
			scn.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println("complete.");
		
		}
	}


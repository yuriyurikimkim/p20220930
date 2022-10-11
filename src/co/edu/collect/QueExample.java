package co.edu.collect;

import java.util.LinkedList;
import java.util.Queue;

public class QueExample {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		// 추가.
		que.offer("Hong");
		que.offer("Park");
		que.offer("Choi");
		
		while(!que.isEmpty()) { //값이 있을동안에는 계속 출력하겠다.
			System.out.println(que.poll());
		}
		
	}
}

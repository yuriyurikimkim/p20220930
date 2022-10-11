package co.edu.collect;

import java.util.Stack;

class Coin {
	private int val;
	public Coin(int val) {
		this.val = val;
	}
	public int getVal() {
		return val;
	}
}

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		// 추가.
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(60));
		coinBox.push(new Coin(80));
		
		// 출력.
		while(!coinBox.isEmpty()) { //값이 있을동안에 계속 출력해달라는 뜻. (isEmpty가 false이면)
			Coin coin = coinBox.pop(); //마지막 인스턴스부터 출력.
			System.out.println(coin.getVal());
		}
		
	}
}

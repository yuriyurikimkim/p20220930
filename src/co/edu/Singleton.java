package co.edu;

public class Singleton {
	// private 정적 필드. (외부에서 직접접근 X )
	private static Singleton singleton = new Singleton();
	
	// private 생성자.
	private Singleton() {
		
	}
	
	// public getInstance(); 생성자를 만들 수 있음.
	public static Singleton getInstance() {
		return singleton;
	}
}

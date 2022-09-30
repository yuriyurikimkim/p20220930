package co.edu;

public class SingletonMain {
	public static void main(String[] args) {
		// 1) Student
		Student s1 = new Student();
		Student s2 = new Student();
		
		// 2) Singleton
		Singleton sg1 = Singleton.getInstance();
		Singleton sg2 = Singleton.getInstance();
		
		System.out.println(s1 == s2); //인스턴스가 만들때 마다 새로 생성되어서 false
		System.out.println(sg1 == sg2); //인스턴스가 만들어질때 동일한 주소값을 가지고 있어서 true
		
	}
	
}

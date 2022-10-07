package co.edu.collect;

import java.util.HashMap;
import java.util.Map;

class Book {
	String bookCode;
	String author;
	String publish;
	
	//생성자 만들기.
	public Book(String bookCode, String author, String publish) {
		this.bookCode = bookCode;
		this.author = author;
		this.publish = publish;
	}
	
	//hashCode, equals 메소드 동일한 값이면 논리적으로 동일한 객체라고 판단.
	@Override
	public int hashCode() {
		return bookCode.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book target = (Book) obj; //형변환 하겠다.
			return this.bookCode.equals(target.bookCode); //bookcode만 같으면 같은 값이라고 인식하겠다.
		} else {
			return false;
		}
	}
}

public class MapExample2 {
	public static void main(String[] args) {
		Map<Book, Integer> map = new HashMap<>(); //<> 내용 생략해주면 앞에꺼 적용됨.
		map.put(new Book("239208", "유리", "순수출판사"), 20000);
		map.put(new Book("wewew8", "혜리", "좋은출판사"), 35000);
		map.put(new Book("abcdef", "깜이", "짱귀출판사"), 60000);
		
		Integer val = map.get(new Book("239208", "유리", "순수출판사"));
		System.out.println("값 : " + val);
		
	}
}

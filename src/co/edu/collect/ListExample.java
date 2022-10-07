package co.edu.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListExample {
	public static void main(String[] args) {
		ArrayList<String> strs = new ArrayList<String>(); // new로 만들어진 애를 strs변수에 담겠다는 뜻
		// 추가.
		strs.add("스누피");
		strs.add("샐리브라운");
		strs.add("페퍼민트");

		// 삭제.
		strs.remove(0); // 첫번째를 지우겠다는뜻
		strs.remove("페퍼민트"); // 지정도 가능

		strs.add(0, "찰리브라운"); // 첫번째 위치에 추가하겠다. (원래 첫번째 위치에 있던게 뒤로 밀려남)

		System.out.println("collect 크기는 " + strs.size()); // 위에서 두개 삭제해서 결과값 1 나옴.

		for (String str : strs) { // 컬렉션에 들어있는 만큼만 반복하겠다는 뜻
			System.out.println(str);
		}
		for (int i = 0; i < strs.size(); i++) {
			System.out.printf("%d번째의 값은 %s \n", i, strs.get(i)); // 몇번째위치에 어떤게 있는지 출력
		}

		// 반복자를 생성.
		Iterator<String> itr = strs.iterator(); // 컬렉션에는 iterator가 존재함.
		while (itr.hasNext()) {
			String result = itr.next(); // 가지고온 애
			System.out.println(result);

		}

		// 10만건.
		ArrayList<Integer> inAry = new ArrayList<Integer>();
		long start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			inAry.add(0, i); // 첫번째 위치에 추가하겠다.
		}
		long end = System.nanoTime();
		System.out.println("ary: " + (end - start));

		LinkedList<Integer> InAry = new LinkedList<Integer>();
		start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			InAry.add(0, i); // 첫번째 위치에 추가하겠다.
		}
		end = System.nanoTime();
		System.out.println("link: " + (end - start));
		
	}
}

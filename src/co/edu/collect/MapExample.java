package co.edu.collect;



import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		//key : 키에 해당되는 제너릭타입타입이 선언 돼야 함. (Integer)
		//value : 밸류에 해당되는 제너릭타입타입이 선언 돼야 함. (String)
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "그로밋"); //map에서는 add가 아니라 put 사용.
		map.put(200, "월레스");
		map.put(300, "거대토끼");
		map.put(300, "그냥토끼");
		
		//삭제
		map.remove(200); 
		
		System.out.println("컬렉션의 크기 : " + map.size()); //동일한 key값이 2개라서 3개로 나옴.
		System.out.println("val : " + map.get(300)); //맨밑에 있는게 덮어씌워서 그냥토끼만 나옴.
		
		// 반복자 생성.
		Set<Integer> keySet = map.keySet(); // 키 값만 새로운 set컬렉션에 저장.
		for(Integer key : keySet) {
			System.out.println("키 : " + key + ", 값 : " + map.get(key));
		}
		
		Set<Entry<Integer, String>> entSet = map.entrySet();
		for(Entry<Integer, String> ent : entSet) {
			System.out.println("키: " + ent.getKey() + ", 값 : " + ent.getValue());
			
		}
		
	}
}

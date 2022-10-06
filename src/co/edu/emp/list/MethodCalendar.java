package co.edu.emp.list;

import java.util.Calendar;

public class MethodCalendar {
	private static MethodCalendar instance = new MethodCalendar(); //초기값 0
	private MethodCalendar() {}
	public static MethodCalendar getInstance() {
		return instance;
	}
	
	//days : 배열 / day : days를 담는 변수
	public void makeCal(int year,int month) {
		System.out.println("         >>>  " + month + " 월  <<<");
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		//요일 출력.
		for (String day : days) {
			System.out.printf("%4s", day);
		}
		System.out.println(); //줄바꿈
		
		//1일의 위치지정. 9월은 목요일부터 시작해서 i<4임.
		for(int i=0; i < getFirstDay(year,month); i++) {
			System.out.printf("%4s", " ");
		}
		
		//날짜 출력.
		for(int i=1; i<=getLastDate(year,month); i++) {
			System.out.printf("%4d", i); //숫자 타입이면 %4d -> d로 써줘야함.
			if((i+getFirstDay(year,month)) % 7 == 0) {
				System.out.println();
			}
		}
	} //end of makeCal()
	
	public int getFirstDay(int year,int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		return cal.get(Calendar.DAY_OF_WEEK)-1; //일요일 1부터 시작.
	} // end of getFirstDay()
	
	public int getLastDate(int year,int month) { //월 정보 넣어주기.
		//switch..case..구문
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		return cal.getActualMaximum(Calendar.DATE); //월말 정보.
	
	} //end of class.
}
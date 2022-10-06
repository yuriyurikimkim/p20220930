package co.edu.emp.list;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExe {
	//날짜, 시간
	public static void main(String[] args) {
		Date today = new Date(); //1970.1.1 2022.10.5 => 52(년)*12(월)*30(일)*24(시)*60(분)*1000(초)
//		today.setYear(2022);
//		today.setMonth(11);
		String ymd = "2022-10-05 13:14:15";
		
		//2022-10-05 형식의 포맷을 지정하는 클래스.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(today));
		
		try {
			today = sdf.parse(ymd); //ymd : 연월일.
			System.out.println(today);
		} catch (ParseException e) { //try에서 오류나면 catch에서 실행.
			e.printStackTrace();
		} 
		
		//날짜(LocalDate), 시간(LocalTime) => LocalDateTime
		LocalDateTime day = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh시mm분ss초");
//		day.format(dtf);
		day = LocalDateTime.of(2022, 10, 5, 10, 20, 30);
		System.out.println(day.format(dtf));
		
	}
}

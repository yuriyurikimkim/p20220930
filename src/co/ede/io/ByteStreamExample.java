package co.ede.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamExample {

	public static void main(String[] args) {
		try {
			fileCopy();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// byte 단위로 읽고 쓰기.
	public static void fileCopy() throws IOException {

		FileInputStream fis = new FileInputStream("C:/Temp/origin.jpg");
		FileOutputStream fos = new FileOutputStream("C:/Temp/copy.jpg"); // 읽어들인 origin을 copy로 변경해서 새로 저장하겠다.
		byte[] buf = new byte[100];

		// 시간 출력.
		long start = System.currentTimeMillis(); // 반복문 전에 현재시간 찍어놓기.

		while (true) { // 읽고 쓰는 작업.
			int bytes = fis.read(buf); // buf 배열 크기만큼의 바이트씩 읽기.

			if (bytes == -1)
				break;

			fos.write(buf); // 배열의 크기만큼 버퍼에 저장하고 한번에 저장.

		}
		// 작업이 끝나면 사용했던 파일들 close.
		fos.close();
		fis.close();

		long end = System.currentTimeMillis(); // 끝나는 시간.

		System.out.println(end - start);
		System.out.println("complete.");
	}

	public static void readBuf() throws IOException {
		InputStream is = new FileInputStream("C:/Temp/data2.dat");
		byte[] buf = new byte[2]; // buf의 크기만큼 읽어들이겠다. 2byte씩.

		while (true) {
			int bytes = is.read(buf); // 매개값으로 배열에 선언된 크기만큼 읽어들임. (2byte씩) 값을 읽어들일게 없으면 -1 리턴.
			if (bytes == -1) {
				break;
			}
			// 출력.
			for (int i = 0; i < bytes; i++) {
				System.out.print(buf[i] + " ");
			}
			System.out.println();
		}
		System.out.println("complete.");
		is.close();

	}

	public static void writeBuf() throws IOException { // 메인 메소드로 던지기. throws
		byte[] arr = new byte[] { 10, 20, 30 }; // byte를 담을수 있는 배열 만들기.
		OutputStream os = new FileOutputStream("C:/Temp/data2.dat");
		os.write(arr);
		os.close(); // 사용 끝나면 close하겠다.

		System.out.println("complete.");

	}

	public static void read() { // 값을 읽어들일때 read 메소드 쓰기.
		try {
			InputStream is = new FileInputStream("C:/Temp/data1.dat");

			while (true) {
				int bytes = is.read(); // byte를 읽고 더 이상 읽을 바이트 없으면
				if (bytes == -1) {
					break;
				}
				System.out.println(bytes); // C:/Temp/data1.dat 데이터를 읽어와서 출력함.
			}

			is.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("complete.");

	}
}

// 출력스트림(바이트)
//		try {
//			OutputStream os = new FileOutputStream("C:/Temp/data1.dat");
//			//write (byte b)
//			byte a = 10;
//			byte b = 20;
//			
//			// write 메소드 써서 작성.
//			os.write(a);
//			os.write(b);
//			
//			//resource 반환.
//			os.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("complete.");
//		
//}
//}
//		

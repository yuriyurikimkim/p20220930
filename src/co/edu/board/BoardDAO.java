package co.edu.board;

import java.util.Scanner;

// 기능만 담기.
public class BoardDAO {
	// Singleton 방식의 인스턴스 생성.
	private static BoardDAO instance = new BoardDAO();
	private BoardDAO() {}
	public static BoardDAO getInstance() {
		return instance;
	}

	
	Scanner scn = new Scanner(System.in);
	Board[] myBoards = new Board[100]; 
	
	// 1. 글등록
	public void addBoard() {
		System.out.println("글등록 기능입니다.");
		System.out.print("글번호 입력 >> ");
		int bNo = scn.nextInt();
		scn.nextLine();
		System.out.print("글제목 입력 >> ");
		String title = scn.nextLine();
		System.out.print("글내용 입력 >> ");
		String content = scn.nextLine();
		
		Board brd = new Board(bNo, title, content);
		// 배열 등록.
		for(int i=0; i<myBoards.length; i++) {
			if(myBoards[i] == null) {
				myBoards[i] = brd;
				break;  //입력했으면 빠져나오기.
			}
		}System.out.println("글 등록이 완료되었습니다.");
	}
	
	// 2. 글목록
	public void boardList() {
		System.out.println("글목록 기능입니다.");
		for (Board brd : myBoards) {
			if (brd != null) {
				System.out.println(brd.toString());
			}
		}
	}
	
	// 3. 글상세보기
	public void boardDetail() {
		System.out.println("글 상세보기 기능입니다.");
		System.out.println("상세보기 할 글 번호를 입력하세요 >>> ");
		int bNo = scn.nextInt();
		scn.nextLine();
		
		for(int i=0; i<myBoards.length; i++) {
			if(myBoards[i].getBoardNo() == bNo) {
				System.out.println(myBoards[i]);
				break;
			}
		}
	}
	
	// 4. 글삭제 (글번호 찾아서 번호 넣어주면 삭제됨.)
	
	public void delBoard() {
		System.out.println("글 삭제 기능입니다.");
		System.out.println("삭제할 글 번호를 입력하세요 >>> ");
		int bNo = scn.nextInt();
		scn.nextLine();
		
		for(int i=0; i<myBoards.length; i++) {
			if(myBoards[i].getBoardNo() == bNo) {
				myBoards[i] = null;
				break;
			}
		} System.out.println("삭제 완료입니다.");
	}
	
	// 5. 전체 메뉴 (return 타입 없음) 
	public void exe() {
		
		boolean run = true;
		while(run) {
			System.out.println("1.글등록 2.글목록 3.글상세보기 4.글삭제 9.종료");
			System.out.print("선택 >> ");
			
			int menu = scn.nextInt();
			switch(menu) {
			case 1:
				addBoard(); 
				break;
			case 2: 
				boardList();
				break;
			case 3: 
				boardDetail();
				break;
			case 4:
				delBoard();
				break;
			case 9:
				run = false;
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
			
		} // end of while
		System.out.println("프로그램 종료되었습니다.");
	} // end of exe()
	
}

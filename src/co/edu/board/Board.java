package co.edu.board;

public class Board {
	private int boardNo;
	private String title;
	private String content;
	
	public Board() {
		
	} // 매개변수가 없는 기본 생성자.
	
	//마우스 오른쪽 => source -> generate constructor using fields
	public Board(int boardNo, String title, String content) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
	}

	// source -> generate getters and setters
	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	//generate toString() 데이터를 확인하기 위한 메소드.
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", title=" + title + ", content=" + content + "]";
	}
	
	
	
}

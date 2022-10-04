package co.edu.emp;

// CRUD처리. (등록 조회 삭제 등)
public interface EmployeeService {
	// 초기화(init)
	public void init();
	
	// 추가
	public void input();
	public String search(int employeeId); // 사원아이디에 해당되는 이름 반환해주는 메소드.
	public void print(); //전체 사원정보 출력.
	
}

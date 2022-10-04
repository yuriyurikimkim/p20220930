package co.edu.inherit.interfaces;

public class DeptServiceImpl implements DaoService{

	@Override
	public void insert() {
		System.out.println("부서 저장.");
	}

	@Override
	public void search() {
		System.out.println("부서 조회.");
	}

	@Override
	public void delete() {
		System.out.println("부서 삭제.");	
	}

}

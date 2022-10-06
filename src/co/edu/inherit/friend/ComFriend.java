package co.edu.inherit.friend;

public class ComFriend extends Friend {
	private String company;
	private String dept;
	
	public ComFriend() {
		super();
	}
	public ComFriend(String name, String phone, String company, String dept) {
		super(name, phone); //부모 클래스의 생성자 호출.
		this.company = company;
		this.dept = dept;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCompany() {
		return this.company;
	}
	public String getDept() {
		return this.dept;
	}
	@Override
	public String showInfo() {
		// 회사친구의 정보.
		return "회사친구의 이름은 " + getName() //this.생략 , name은 쓸수 없음. private 걸려있어서 getName으로 사용
		+ ", 연락처는 " + getPhone() 
		+ ", 회사명은 " + this.company 
		+ ", 부서는 " + this.dept + "입니다.";
	}
}

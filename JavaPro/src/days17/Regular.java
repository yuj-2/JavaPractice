package days17;

// 정규직 사원클래스
public class Regular extends Employee{
	
	// 필드 - name, addr, tel, hiredate
	// 메서드 - dispEmpInfo() , getter, setter
	// 생성자 상속 X  생성자 2개 추가, 
	//              getPay() 추가
	
	// 필드
	private int basePay;  // 기본급

	// getter, setter
	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}
	
	// 생성자 
	public Regular() {
		super(); 
		System.out.println("> Regular 디폴트 생성자 호출됨.");
	}

	public Regular(String name, String addr, String tel, String hiredate, int basePay) {
		super(name, addr, tel, hiredate);
		this.basePay = basePay;
		System.out.println("> Regular 5 생성자 호출됨.");
	}

	// 사원이 하는 일 중에 가장 중요한 일 - 월급받는 일
	public int getPay() {
		return this.basePay; // 정규직은 기본급.
	}

	@Override
	public void dispEmpInfo() {
		super.dispEmpInfo();
		System.out.printf("급여:%,d원\n", this.basePay);
	}

}

package factorymethod.after2;

public abstract class Customer {
	
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;

	Customer(String customerName){
		this.customerName = customerName;
	}
	
	public abstract String getCustomerGrade();
	
	public abstract int calPrice(int price);
	
	public abstract int calBonusPoint(int price);
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String toString() {
		return customerName + "님의 멤버십 등급은 " + getCustomerGrade() + "입니다.";
	}
}

package typecodewithsubclass.after;

public class SilverCustomer extends Customer {
	
	
	SilverCustomer(String customerName) {
		super(customerName);
		// TODO Auto-generated constructor stub
	}

	public String getCustomerGrade() {
		return "SILVER";
	}
	
	public int calPrice(int price) {
		return price = price - (int)(price * 0.05);
	}
	
	public int calBonusPoint(int price) {
		return bonusPoint += (price * 0.05);
	}

}

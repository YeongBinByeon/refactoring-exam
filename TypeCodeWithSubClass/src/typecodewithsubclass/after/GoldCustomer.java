package typecodewithsubclass.after;

public class GoldCustomer extends Customer {
	
	GoldCustomer(String customerName) {
		super(customerName);
		// TODO Auto-generated constructor stub
	}

	public String getCustomerGrade() {
		return "GOLD";
	}
	
	public int calPrice(int price) {
		return price - (int)(price * 0.1);
	}
	
	public int calBonusPoint(int price) {
		return bonusPoint += (price * 0.1);
	}

}

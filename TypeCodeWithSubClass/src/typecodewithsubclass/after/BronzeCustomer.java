package typecodewithsubclass.after;

public class BronzeCustomer extends Customer {
	
	
	BronzeCustomer(String customerName) {
		super(customerName);
		// TODO Auto-generated constructor stub
	}

	public String getCustomerGrade() {
		return "BRONZE";
	}
	
	public int calPrice(int price) {
		return price;
	}
	
	public int calBonusPoint(int price) {
		return bonusPoint += (price * 0.01);
	}

}

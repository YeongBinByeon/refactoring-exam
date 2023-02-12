package factorymethod.after2;

public class GoldCustomer extends Customer {
	
	private GoldCustomer(String customerName) {
		super(customerName);
		// TODO Auto-generated constructor stub
	}
	
	public static GoldCustomer create(String customerName) {
		return new GoldCustomer(customerName);
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

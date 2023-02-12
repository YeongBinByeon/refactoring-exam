package factorymethod.after2;

public class BronzeCustomer extends Customer {
	
	
	private BronzeCustomer(String customerName) {
		super(customerName);
		// TODO Auto-generated constructor stub
	}
	
	public static BronzeCustomer create(String customerName) {
		return new BronzeCustomer(customerName);
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

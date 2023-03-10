package factorymethod.after;

public class Customer {
	
	private int customerType;
	private String customerName;
	private String customerGrade;
	private int bonusPoint;
	
	public static final int BRONZE_CUSTOMER = 1;
	public static final int SILVER_CUSTOMER = 2;
	public static final int GOLD_CUSTOMER = 3;
	
	private Customer(int customerType, String customerName) {
		this.customerType = customerType;
		this.customerName = customerName;
	}
	
	public static Customer create (int customerType, String customerName) {
		return new Customer(customerType, customerName);
	}
	
	public String getCustomerGrade() {
		
		switch(customerType) {
			case BRONZE_CUSTOMER: return "BRONZE";
			case SILVER_CUSTOMER: return "SILVER";
			case GOLD_CUSTOMER: return "GOLD";
			default : return null;
		}
	}
	
	public int calPrice(int price) {
		switch(customerType) {
			case BRONZE_CUSTOMER:
				return price;
			case SILVER_CUSTOMER:
				price = price - (int)(price * 0.05);
				return price;
			case GOLD_CUSTOMER:
				price = price - (int)(price * 0.1);
				return price;
			default : return price;
		}
	}
	
	public int calBonusPoint(int price) {
		switch(customerType) {
			case BRONZE_CUSTOMER:
				return bonusPoint += (price * 0.01);
			case SILVER_CUSTOMER:
				return bonusPoint += (price * 0.05);
			case GOLD_CUSTOMER:
				return bonusPoint += (price * 0.1);
			default : return price;
		}
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String toString() {
		return customerName + "???? ?????? ?????? " + getCustomerGrade() + "?Դϴ?.";
	}
}

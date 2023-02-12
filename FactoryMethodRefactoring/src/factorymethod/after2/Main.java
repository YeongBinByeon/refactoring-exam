package factorymethod.after2;

public class Main {

	public static void main(String[] args) {
		
		Customer bronzeCustomer = BronzeCustomer.create("Tomas");
		Customer silverCustomer = SilverCustomer.create("Alice");
		Customer goldCustomer = GoldCustomer.create("Edward");
	
		int price = 10000;
		
		System.out.println(bronzeCustomer);
		System.out.println(bronzeCustomer.getCustomerName() + ": price : " + bronzeCustomer.calPrice(price)
		+ " bonusPoint: " + bronzeCustomer.calBonusPoint(price));
		
		System.out.println(silverCustomer);
		System.out.println(silverCustomer.getCustomerName() + ": price : " + silverCustomer.calPrice(price)
		+ " bonusPoint: " + silverCustomer.calBonusPoint(price));
		
		System.out.println(goldCustomer);
		System.out.println(goldCustomer.getCustomerName() + ": price : " + goldCustomer.calPrice(price)
		+ " bonusPoint: " + goldCustomer.calBonusPoint(price));
	
	}
	
}

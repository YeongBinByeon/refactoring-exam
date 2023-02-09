package typecodewithsubclass.after;

public class Main {

	public static void main(String[] args) {
		
		Customer bronzeCustomer = new BronzeCustomer("Tomas");
		Customer silverCustomer = new SilverCustomer("Alice");
		Customer goldCustomer = new GoldCustomer("Edward");
	
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

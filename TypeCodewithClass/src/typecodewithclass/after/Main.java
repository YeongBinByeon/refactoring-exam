package typecodewithclass.after;

public class Main {

	public static void main(String[] args) {
		Item bookItem = new Item(ItemType.BOOK, "����", 10000);
		Item dvdItem = new Item(ItemType.DVD, "�ٶ��� �Բ� �������", 20000);
		Item softwareItem = new Item(ItemType.SOFTWARE, "Window", 30000);

		System.out.println(bookItem);
		System.out.println(dvdItem);
		System.out.println(softwareItem);
	}

}

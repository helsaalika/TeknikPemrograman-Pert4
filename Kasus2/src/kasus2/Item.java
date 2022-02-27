package kasus2;

public class Item {
	private String name;
	
	private Item() {
		name = "Ipin";
	}

	public Item(String name) {
		/* 
		 * Membuat objek baru yaitu Item() pada pada konstruktor ini 
		 * lalu mengambil state name yang ada pada Item() 
		 */
		this.name = new Item().name;  //mengambil state name "Ipin"
		System.out.println(this.name);  //mengoutputkan
	}
}

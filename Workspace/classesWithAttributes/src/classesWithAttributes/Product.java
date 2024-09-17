package classesWithAttributes;

public class Product {
	
	public Product(int id, String name, String description, double price, int stackAmount, String renk) {
		System.out.println("Yapıcı blok çalıştı");
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount=stackAmount;
		this.renk=renk;
	}
	//parametreli constuctor yaparsak bu class'ı çağırmak için
	//parametreleri eksiksiz girmek gerekir.
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String get_name() {
		return name;
	}
	public void set_name(String name) {
		this.name = name;
	}
	public String get_description() {
		return description;
	}
	public void set_description(String description) {
		this.description = description;
	}
	public double get_price() {
		return price;
	}
	public void set_price(double price) {
		this.price = price;
	}
	public int get_stockAmount() {
		return stockAmount;
	}
	public void set_stockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String get_renk() {
		return renk;
	}
	public void set_renk(String renk) {
		this.renk = renk;
	}
	public String get_kod() {
		return name.substring(0,1) + id;
	}
	public void set_kod(String kod) {
		this.kod = kod;
	}

	
	

}

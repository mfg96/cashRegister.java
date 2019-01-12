package lab2;


/**
 * item class
 * @author mfarazsohail
 * stores items
 */
public class Item {

	private String name;
	private int qty;
	private double price;
	double total;
	
	/**
	 * constructor
	 */
	public Item(){
		
		name="missing";
		qty=0;
		price=0;
	}
	
	/**
	 * overloaded constructor
	 * @param name
	 * @param qty
	 * @param price
	 */
	public Item(String name, int qty, double price){
		
		this();
		setName(name);
		setQty(qty);
		setPrice(price);
		
	}
	
	public Item(Item I){
		
		name=I.getName();
		qty=I.getQty();
		price=I.getPrice();
	}
	
	/**
	 * getters and setters
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		//if ((name.trim()).length() > 0)
			this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		
		if (qty > 0)
			this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		if (price > 0)
			this.price = price;
	}
	
	public double getTotal() {
		
		return price*qty;
	}
	
	/**
	 * tostring to print all
	 */
	public String toString() {
		
		if(name=="missing")
			return "Missing Item";
		else
			return name+"\t\t"+qty+"\t\t"+price+"\t\t"+getTotal()+"\n";
				
	}
}

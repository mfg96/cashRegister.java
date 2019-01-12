package lab2;

import java.util.Scanner;

/**
 * invoice class
 * @author mfarazsohail
 * stores values
 */
public class Invoice {

	private int numItems;
	Scanner sc=new Scanner(System.in);
	private Item[] itemList;
	int c=0;
	
	/**
	 * constructor
	 */
	public Invoice() {
		
		numItems=0;
	}
	
	/**
	 * overloader
	 * @param numItems
	 */
	public Invoice(int numItems) {
		
		this();
		itemList=new Item[numItems];
		setNumItems(numItems);
	}
	
	public int getNumItems() {
		return numItems;
	}
	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}
	
	public void setItem(Item item) {
		
		itemList[c]=item;
		c++;
	}
	
	public Item getItem(int index) {
		
		return itemList[index];
	}
}

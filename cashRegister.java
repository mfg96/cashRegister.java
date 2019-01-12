package lab2;
import java.util.*;
//import java.math.*;

/**
 * class register class
 * @author mfarazsohail
 * it does the main work
 */
public class cashRegister {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//ArrayList myArray = new ArrayList();
		
		System.out.println("Enter the number of items:");
		int quantity = sc.nextInt();
		//Item[] myItem = new Item[quantity];
		Item myItem = new Item();
		Invoice invoice=new Invoice(quantity);
		double total=0;
		
		for (int i=0; i<quantity; i++) {
			
			//Item myItem = new Item();
			System.out.println("Input name of Item "+(i+1)+":");
			myItem.setName(sc.next());
			System.out.println("Input Quantity of Item "+(i+1)+":");
			myItem.setQty(sc.nextInt());
			System.out.println("Input Price of Item "+(i+1)+":");
			myItem.setPrice(sc.nextInt());
			
			invoice.setItem(myItem);
			myItem=new Item();
			
			//myArray.add(myItem);
		}
		
		
		System.out.println("Your bill:");
		System.out.println("Item\t\tQuantity\tPrice\t\tTotal");
		
		
		//Invoice No =new Invoice();
		//No.setNumItems(quantity);
				
		for(int i=0;i<quantity;i++)
		{
			
			System.out.print(invoice.getItem(i).toString());
			total+=invoice.getItem(i).getTotal();
			
		}
		
		System.out.println("Subtotal\t\t\t\t\t"+total);
		System.out.println("6.25% sales tax\t\t\t\t\t"+(total*(6.25/100)));
		System.out.println("Total \t\t\t\t\t\t"+(total+(total*(6.25/100))));
sc.close();
}
	
}
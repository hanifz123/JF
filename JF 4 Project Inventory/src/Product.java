
public class Product {

	//4 task 5: add private instance fields using data types identified on task 2
	//4 task 6: add comment "Instance field declarations"
	protected int itemNumber;
	protected int qtyStock;
	protected String itemName;
	protected double itemPrice;
	protected boolean active;

	/*4 task 7a: create default constructor non parameter. initialize field to 
	 *their default values
	 */
	public Product() {
		itemNumber = 0;
		qtyStock = 0;
		itemName = "";
		itemPrice = 0.0;
	//5 task 4a Add a Boolean instance field 
		active = true;
	}
	
	/*4 task 7b: Overload the default constructor by creating a constructor 
	 * with parameters for all four of the class’ instance
	 */
	public Product(int itemNumber, int qtyStock, String itemName, double 
			itemPrice, boolean active) {
		this.itemNumber = itemNumber;
		this.qtyStock = qtyStock;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.active = active;
		
	}
	
	public void addToInventory(int qtyStock) {
		if(getActive()==false) {
			System.out.println("\n\ncannot add to discontinued!\n");
		}
		else if(getActive()==true){
		this.qtyStock += qtyStock;
		}
	}
	
	public void deductFromInventory(int qtyStock) {
		this.qtyStock -= qtyStock;
	}
	
	/*4 task 8: Write getter/accessor and setter/mutator methods for each of 
	 * the four instance variables. 
	 */
	public int getItemNumber() {
		return this.itemNumber; //itemNumber accessor
	}
	public void setItemNumber(int newItemNumber) {
		this.itemNumber = newItemNumber; //itemNumber mutator
	}
	
	public int getQtyStock() {
		return this.qtyStock; //qtyStock accessor
	}
	public void setQtyStock(int newQtyStock) {
		this.qtyStock = newQtyStock; //qtyStock mutator
	}
	
	public String getItemName() {
		return this.itemName; //itemName accessor
	}
	public void setItemName(String newItemName) {
		this.itemName = newItemName; //itemName mutator
	}
	
	public double getItemPrice() {
		return this.itemPrice; //itemPrice accessor
	}
	public void setItemPrice(double newItemPrice) {
		this.itemPrice = newItemPrice; //itemPrice mutator
	}
	
	//5 task 4b Create getter/setter methods for active field 
	public boolean getActive() {
		return this.active; //active accessor
	}
	public void setActive(boolean newActive) {
		this.active = newActive; //itemPrice mutator
	}
	
	//5 task 7 Create a method in the Product class that will 
	//return the inventory value for each item
	public double getInventory() {
		return itemPrice*qtyStock;
	}
	
	
	/*4 task 9: Override the toString() method from the object class to show a description of each Product object that includes
	 *the instance field values in the following format: 
	 */
	public String toString() {
		
		String detil = (active==true) ? 
				"\nItem Number \t: "+getItemNumber()+
				"\nName \t\t: "+getItemName()+
				"\nQuantity \t: "+getQtyStock()+
				"\nPrice \t\t: "+getItemPrice()+
				"\nStock Value \t: "+getInventory()+
				"\nProduct Status "+"\t: "+"Active\n"
								: 
				"\nItem Number \t: "+getItemNumber()+
				"\nName \t\t: "+getItemName()+
				"\nQuantity \t: "+getQtyStock()+
				"\nPrice \t\t: "+getItemPrice()+
				"\nStock Value \t: "+getInventory()+
				"\nProduct Status \t: "	+"Discontinued\n";	
		return detil;
	}
	
	
}

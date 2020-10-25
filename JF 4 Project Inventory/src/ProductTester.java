import java.util.*;

public class ProductTester {
	
	static int menuChoice; static int productChoice; static int updateValue = -1;
	
	private static final  Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		int maxSize; //menuChoice;
		do { maxSize = getNumProducts(scanner);
			if (maxSize < 0) 
				System.out.println("Incorrect Value entered\n"); 
			if(maxSize==0) {
				System.out.println("No products required!");
			}
			else {
				Product[] productArray = new Product[maxSize];
				addToInventory(productArray, scanner);
				do {
					menuChoice = getMenuOption(scanner);
					executeMenuChoice(menuChoice, productArray, scanner);
					//executeMenuChoice(menuChoice,productArray,scanner);
				}while(menuChoice!=0);
			}
		
		}
		while(maxSize<0);
		scanner.nextLine();	
	}
	

	public static void executeMenuChoice(int menuChoice,Product[] arrayProduct, Scanner scanner) {
		int menuKlik = menuChoice;
		switch(menuKlik) 
		{case 1:
			displayInventory(arrayProduct); //View Product List
			break;
		case 2:
			addInventory(arrayProduct, scanner); //Add Stock
			break;
		case 3:
			deductInventory(arrayProduct, scanner); //Deduct stock
			break;
		case 4:
			discontinueInventory(arrayProduct, scanner); //discontinue stock
			break;
			default:
				getMenuOption(scanner);
			break;
		}					
	}

	public static int getMenuOption(Scanner scanner) {
		System.out.println(	"1. View Inventory\n" + 
							"2. Add Stock\n" + 
							"3. Deduct Stock\n" + 
							"4. Discontinue Product\n" + 
							"0. Exit\n" + 
							"Please enter a menu option:");
		do {
			menuChoice = scanner.nextInt();
			if (menuChoice < 0) {
				System.out.println("Number should be higher than 0");
				menuChoice = scanner.nextInt();
			}
			else if (menuChoice > 4) {
				System.out.println("Number should be lower than 4");		
			}
			else {
				return menuChoice;
			}
		}while(menuChoice<=4||menuChoice>=0);
		return menuChoice;
	}
	 
	public static int getProductNumber(Product[] arrayNumber, Scanner scanner) {		
		System.out.println("Enter product number from catalog: ");
		for(int i = 0; i<arrayNumber.length;i++) {
			System.out.println("No. "+i+arrayNumber[i]);
		}		
		int productChoice = -1;
		
		do{	productChoice = scanner.nextInt();				
				if (productChoice < 0) {
					System.out.println("Number should be higher than 0");
				}
				else if (productChoice<arrayNumber.length-1) {
					System.out.println("Number is higher than Catalog length");
				}else {
					return productChoice;
				}									
		}while(productChoice<=arrayNumber.length||productChoice>0);
		return productChoice;
	}
	
	public static void addInventory(Product[] arrayNumber, Scanner scanner) {
		
		int stockChoice;
		productChoice = getProductNumber(arrayNumber, scanner);
		System.out.println("\n\n1: CD\n"
							+ "2: DVD\n"
							+ "Please enter the product type: \n");
		do{		
			stockChoice = scanner.nextInt();
			if ((stockChoice<1)||(stockChoice>2)) {
				System.out.println("\nOnly numbers 1 or 2 allowed!\n");
			}
			else {				
				int currentStock = arrayNumber[productChoice].getQtyStock();
				arrayNumber[productChoice].setQtyStock(currentStock+updateValue); 
				System.out.println("\nThe "+arrayNumber[productChoice].getItemName()+" is now: "+(currentStock+updateValue)+"\n\n");
			}
		}while(stockChoice<=0);
		if (stockChoice == 1) {
			CD cd = new CD();
			addCDToInventory(cd,scanner);
		}
		else if (stockChoice == 2) {
			 DVD dvd = new DVD();
			 addDVDToInventory(dvd,scanner);
		}

	}
	
	public static void deductInventory(Product[] arrayNumber, Scanner scanner) {
		int productChoice;
		int updateValue = -1;
		productChoice = getProductNumber(arrayNumber, scanner);
		System.out.println("How many products do you want to\n" + 
							"deduct?");
		do{		
			updateValue = scanner.nextInt();
			if (updateValue <=0) {
				System.out.println("Number should be higher than 0");
			}
			else {				
				int currentStock = arrayNumber[productChoice].getQtyStock();
				arrayNumber[productChoice].setQtyStock(currentStock-updateValue);
				System.out.println("\nThe "+arrayNumber[productChoice].getItemName()+" is now: "+(currentStock-updateValue)+"\n\n");
			}
		}while(updateValue<=0);
		
	}
	
	public static void discontinueInventory(Product[] arrayDiscontinue, Scanner scanner) {	
		int productChoice;
		productChoice = getProductNumber(arrayDiscontinue, scanner);		
		arrayDiscontinue[productChoice].setActive(false);
		boolean productStat = arrayDiscontinue[productChoice].getActive();; 
		System.out.println("\nThe product is now "+productStat);

	}
	
	public static void displayInventory(Product[] arrayDisplay) {
		System.out.println(Arrays.toString(arrayDisplay));
	}
	
	public static void addToInventory(Product[] arrayDisplay, Scanner scanner) {
		int tempNumber; String tempName; int tempQty; double tempPrice; boolean tempStatus;
		for(int i=0;i<arrayDisplay.length;i++) {
			System.out.println("Input the Item Number");
			tempNumber = scanner.nextInt();
							
			System.out.println("Input the Product Name");
			tempName = scanner.next();
						
			System.out.println("Input the Quantity");
			tempQty = scanner.nextInt();		
			
			System.out.println("Input the Item Price");
			tempPrice = scanner.nextDouble();			
			
			System.out.println("Input the Item Status");
			tempStatus = scanner.nextBoolean();			
			
			arrayDisplay[i] = new Product(tempNumber,tempQty,tempName,tempPrice,tempStatus);
			//arrayDisplay[i] = new Product(p.getItemNumber(),p.getQtyStock(),p.getItemName(),p.getItemPrice(),p.getActive());
			arrayDisplay.toString();
			
			displayInventory(arrayDisplay);			
		}
	}
	
	public static void addCDToInventory(CD arrayDisplay, Scanner scanner) {
		int tempNumber; String tempName; int tempQty; double tempPrice; boolean tempStatus;
		String tempArtist; int tempNumSong; String tempLabel;
		System.out.println("Input the Item Number");
		tempNumber = scanner.nextInt();

		System.out.println("Input the CD Name");
		tempName = scanner.next();

		System.out.println("Input the artist Name");
		tempArtist = scanner.next();

		System.out.println("Input the record label Name");
		tempLabel = scanner.next();

		System.out.println("Input the number of songs");
		tempNumSong = scanner.nextInt();

		System.out.println("Input the Quantity");
		tempQty = scanner.nextInt();		

		System.out.println("Input the Item Price");
		tempPrice = scanner.nextDouble();			

		System.out.println("Input the Item Status");
		tempStatus = scanner.nextBoolean();			

		arrayDisplay = new CD(tempNumber, tempQty,tempName,tempPrice,tempStatus, tempArtist, tempNumSong, tempLabel);
		//arrayDisplay[i] = new Product(p.getItemNumber(),p.getQtyStock(),p.getItemName(),p.getItemPrice(),p.getActive());
		arrayDisplay.toString();

	}
	
	public static void addDVDToInventory(DVD arrayDisplay, Scanner scanner) {
		int tempNumber; String tempName; int tempQty; double tempPrice; boolean tempStatus;
		int movieLength;int ageRating;String filmStudio;
		System.out.println("Input the Item Number");
		tempNumber = scanner.nextInt();

		System.out.println("Input the DVD Name");
		tempName = scanner.next();

		System.out.println("Input the Film Studio Name");
		filmStudio = scanner.next();

		System.out.println("Input the Age Rating");
		ageRating = scanner.nextInt();

		System.out.println("Input the Movie Length");
		movieLength = scanner.nextInt();

		System.out.println("Input the Quantity");
		tempQty = scanner.nextInt();		

		System.out.println("Input the Item Price");
		tempPrice = scanner.nextDouble();			

		System.out.println("Input the Item Status");
		tempStatus = scanner.nextBoolean();			

		arrayDisplay = new DVD(tempNumber, tempQty,tempName,tempPrice,tempStatus, movieLength, ageRating, filmStudio);
		//arrayDisplay[i] = new Product(p.getItemNumber(),p.getQtyStock(),p.getItemName(),p.getItemPrice(),p.getActive());
		arrayDisplay.toString();

	}
	
	public static int getNumProducts(Scanner scanner) {
		int maxSize;
		System.out.println("Enter the number of products you would like to add\n" + 
						   " Enter 0 (zero) if you do not wish to add products:");
		maxSize = scanner.nextInt();
		return maxSize;
	}
}

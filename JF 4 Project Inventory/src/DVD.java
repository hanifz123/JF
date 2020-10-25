
public class DVD extends Product {
	private int movieLength;
	private int ageRating;
	private String filmStudio;
	
	public DVD() {
		super();
		movieLength = 0;
		ageRating = 0;
		filmStudio = "";
	}
	
	public DVD(int itemNumber, int qtyStock, String itemName, double 
			itemPrice, boolean active, int movieLength, int ageRating, String filmStudio) {
		super(itemNumber, qtyStock, itemName,itemPrice, active);
		this.movieLength = movieLength;
		this.ageRating = ageRating;
		this.filmStudio = filmStudio;		
	}
	
	public void setMovieLength(int newMovieLength) {
		this.movieLength = newMovieLength;
	}
	
	public int getMovieLength() {
		return movieLength;
	}
	
	public void setAgeRating(int newAgeRating) {
		this.ageRating = newAgeRating;
	}
	
	public int getAgeRating() {
		return ageRating;
	}
	
	public void setFilmStudio(String newFilmStudio) {
		this.filmStudio = newFilmStudio;
	}
	
	public String getFilmStudio() {
		return filmStudio;
	}
	
	@Override
	public double getInventory() {
		return (itemPrice+(5/100))*qtyStock;
	}
	
	@Override
	public String toString() {
		
		String detil = (active==true) ? 
				"\n\nItem Number \t: "+getItemNumber()+
				"\nName \t\t: "+getItemName()+
				"\nMovie Length \t: "+getMovieLength()+
				"\nAge Rating \t: "+getAgeRating()+
				"\nFilm Studio \t: "+getFilmStudio()+
				"\nQuantity \t: "+getQtyStock()+
				"\nPrice \t\t: "+getItemPrice()+
				"\nStock Value \t: "+getInventory()+
				"\nProduct Status "+"\t: "+"Active\n"
								: 
				"\n\nItem Number \t: "+getItemNumber()+
				"\nName \t\t: "+getItemName()+
				"\nMovie Length \t: "+getMovieLength()+
				"\nAge Rating \t: "+getAgeRating()+
				"\nFilm Studio \t: "+getFilmStudio()+
				"\nQuantity \t: "+getQtyStock()+
				"\nPrice \t\t: "+getItemPrice()+
				"\nStock Value \t: "+getInventory()+
				"\nProduct Status \t: "	+"Discontinued\n";	
		return detil;
	}
}

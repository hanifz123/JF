
public class CD extends Product{
	private String artist;
	private int numSong;
	private String label;
	
	public CD() {
		super();
		artist = "";
		numSong = 0;
		label = "";
	}
	
	public CD(int itemNumber, int qtyStock, String itemName, double 
			itemPrice, boolean active, String artist, int numSong, String label) {
		super(itemNumber, qtyStock, itemName,itemPrice, active);
		this.artist = artist;
		this.numSong = numSong;
		this.label = label;		
	}
	
	public void setArtist(String newArtist) {
		this.artist = newArtist;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setNumSong(int newNumSong) {
		this.numSong = newNumSong;
	}
	
	public int getNumSong() {
		return numSong;
	}
	
	public void setLabel(String newLabel) {
		this.label = newLabel;
	}
	
	public String getLabel() {
		return label;
	}
	
public String toString() {
		
		String detil = (active==true) ? 
				"\n\nItem Number \t: "+getItemNumber()+
				"\nName \t\t: "+getItemName()+
				"\nArtist \t\t: "+getArtist()+
				"\n Songs on Album \t: "+getNumSong()+
				"\nRecord Label \t: "+getLabel()+
				"\nQuantity \t: "+getQtyStock()+
				"\nPrice \t\t: "+getItemPrice()+
				"\nStock Value \t: "+getInventory()+
				"\nProduct Status "+"\t: "+"Active\n"
								: 
				"\n\nItem Number \t: "+getItemNumber()+
				"\nName \t\t: "+getItemName()+
				"\nArtist \t\t: "+getArtist()+
				"\n Songs on Album \t: "+getNumSong()+
				"\nRecord Label \t: "+getLabel()+
				"\nQuantity \t: "+getQtyStock()+
				"\nPrice \t\t: "+getItemPrice()+
				"\nStock Value \t: "+getInventory()+
				"\nProduct Status \t: "	+"Discontinued\n";	
		return detil;
	}
}

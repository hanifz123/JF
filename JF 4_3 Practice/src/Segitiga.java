
public class Segitiga {
	private int base;
	private int height;
	private int area;
	
	public Segitiga() { //constructor
		this.base = 0;
		this.height = 0;
		this.area = 0;
	}

	public Segitiga(int base, int height) { //constructor
		this.base = base;
		this.height = height;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getBase() {
		return this.base;
	}
	
	public int getArea() {
		return this.area;
	}
	
	public int calculateArea(int base, int height) {
		int area = base*height/2;
			return area;
	}
}

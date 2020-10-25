package weekSatu;

public class Person {

	//Declare variabel person name
	private String pName;
	//Declare variabel person age
	private int pAge;
	public Person() { //include parameter for name n age
		//create constructor initialize name and age variabel
		this.pName = "";
		this.pAge = 0;
	}
	public Person(String pName, int pAge) {
		this.pName = pName;
		this.pAge = pAge;
	}
	
	
	//create method getName(), return person name
	public String getName() {
		return this.pName = pName;		
	}
	
	
	//create method getAge(), return person age
	public int getAge() {
		return this.pAge = pAge;
	}
	
	
	//create method setAge(), modify person age
	public void setAge(int newpAge) {
		this.pAge = newpAge;
		}
}

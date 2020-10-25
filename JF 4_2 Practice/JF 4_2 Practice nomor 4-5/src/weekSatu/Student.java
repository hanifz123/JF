package weekSatu;
import java.util.*;

public class Student {
	
	private String fName;
	private String lName;
	private String stuId;
	private String stuStatus;
	
		public Student() { //constructor
			this.fName = "";
			this.lName = "";
			this.stuId = "";
			this.stuStatus = "";
		}

		public Student(String fName, String lName, String stuId, String stuStatus) {
			//nomor 5, buat code driver class untuk print informasi
			this.fName = fName;
			this.lName = lName;
			this.stuId = stuId;
			this.stuStatus = stuStatus;
		}
		
		public static void hello() {
			System.out.println("Hello!");
		}
		
		///firstName
		
		public String getFirstName() {
			return this.fName;
		}
		
		public void setFirstName(String newfName) {
			this.fName = newfName;
		}
		
		///lastName
		
		public String getLastName() {
			return this.lName;
		}
		
		public void setLastName(String newlName) {
			this.lName = newlName;
		}
		
		///stuId
		
		public String getstuId() {
			return this.stuId;
		}
		
		public void setstuId(String newstuId) {
			this.stuId = newstuId;
		}
		
		///stuStatus
		
		public i getstuStatus() {
			return this.stuStatus;
		}
		
		public void setstuStatus(String newstuStatus) {
			this.stuStatus = newstuStatus;
		}
		
		public String toString() {
			String s1 = "";
			s1 = "Student Name:  " +getFirstName()+" "+getLastName()+
					" |  ID:  "+getstuId()+
					" |  Status:  "+getstuStatus();
			return s1;
		}
	}

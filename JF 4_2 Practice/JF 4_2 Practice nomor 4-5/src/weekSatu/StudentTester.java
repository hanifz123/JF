package weekSatu;
import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {
		
		Student.hello();
		Student studentOne = new Student("Lisa","Palombo","123456789","Active");
		Student studentDefault = new Student();
		//System.out.println(studentOne.getFirstName());
		//System.out.println(studentOne.getLastName());
		//System.out.println(studentOne.getstuId());
		//System.out.println(studentOne.getstuStatus());
		System.out.println(studentOne.toString());
		String name1 = "mya", name2 = name1;
				if (name1==name2) {
					System.out.println(true);
				
				}
}
}
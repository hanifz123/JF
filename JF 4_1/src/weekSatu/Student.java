package weekSatu;

public class Student {
	private int studentId;
	private String name;
	private double gpa;

	//object class 4_2
	public Student(int studentId, String name, double gpa) { //constructor
		System.out.println("Instansiasi");
		this studentId = studentId;
		this.name = name;
		this.gpa = gpa;
	}
	public static void hello() {
		System.out.println("Hello!");
	}
	public int getStudentId() {
		return this.studentId;
	}
}

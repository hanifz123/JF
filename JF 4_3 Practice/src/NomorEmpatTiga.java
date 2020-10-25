
public class NomorEmpatTiga {
	private String s1 = "ABC";
	private String s2 = new String ("DEF");
	private String s3 = "AB"+"C";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABC";
		String s2 = new String ("DEF");
		String s3 = "AB"+"C";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3==s1);
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.equals(s1));
	}
	

	

}

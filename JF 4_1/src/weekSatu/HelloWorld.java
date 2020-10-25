package weekSatu;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		
		// 1 gallon  = 3.785 liter
		// membuat scanner untuk meminta input user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Berapa US Gallon?");
		// simpan input dalam sebuah variabel
		int usGallon = scanner.nextInt();
		// nilai yang ada di variabel dikonversikan ke liter
		// dikalikan dengan 3.785
		double gallonToLiter = usGallon * 3.785;
		// hasilnya ditampilkan
		System.out.println("Hasil konversi ke liter adalah "+gallonToLiter);
		
		
	}

}

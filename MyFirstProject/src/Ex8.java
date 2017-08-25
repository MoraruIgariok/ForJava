import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Dati un numar(a=) " );
		float a = scn.nextFloat();
		System.out.print("Dati alt numar(b=) " );
		float b = scn.nextFloat();
		
		float Media = (a + b)/2;
		System.out.print("Media acestor numere este (=) " + Media );
		
		scn.close();
	}

}

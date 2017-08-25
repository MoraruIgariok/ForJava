import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Dati valoare pentru a: ");
		float a = scn.nextFloat();
		System.out.print("Dati valoare pentru b: ");
		float b = scn.nextFloat();
		 
		float S = a * b;
		System.out.print("Aria este = " + S);
		System.out.println();
		float P = 2*(a + b);
		System.out.print("Perimetrul este = " + P);
		scn.close();
	}

}

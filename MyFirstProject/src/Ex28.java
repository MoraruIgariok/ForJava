import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
	
		System.out.println("Dati o valoare intreaga lui A:");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		float a2 = a * a;
		System.out.println("A^2(A * A) = " + a2);
		float a3 = a2 * a;
		System.out.println("A^3(A^2 * A) = " + a3);
		float a5 = a3 * a2;
		System.out.println("A^5(A^3 * A^2) = " + a5);
		float a10 = a5 * a5;
		System.out.println("A^10(A^5 * A^5) = " + a10);
		float a15 = a10 * a5;
		System.out.println("A^15(A^10 * A^5) = " + a15);
		
		scn.close();

	}

}

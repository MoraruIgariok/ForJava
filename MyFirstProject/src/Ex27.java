import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("dati o valoare pentru A:");
		int a = scn.nextInt();
		double a2 = Math.pow(a,2);
		System.out.print("A^2 = " + a2);
		double a4 = a2 * a2;
		System.out.print("\nA^4 = " + a4);
		double a8 = a4 * a4;
		System.out.println("\nA^8 = " + a8);
		
		
		scn.close();

	}

}

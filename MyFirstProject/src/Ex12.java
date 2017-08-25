import java.util.Scanner;

public class Ex12 {
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Dati cateta a:");
		float a = scn.nextFloat();
		System.out.print("Dati cateta b:");
		float b = scn.nextFloat();
		
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.format("Ipotenuza este:  %.3f%n", c);
		double p = a + b + c;
		System.out.format("Preimetru este:  %.3f%n", p);
		
		scn.close();
	}

}

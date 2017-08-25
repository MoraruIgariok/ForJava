import java.util.Scanner;

public class Ex13 {
	
	public static final float pi = 3.14f;

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Dati R1:");
		int R1 = scn.nextInt();
		System.out.print("Dati R2 unde R1 > R2:");
		int R2 = scn.nextInt();
		
			double S1 = pi * Math.pow(R1, 2);
			double S2 = pi * Math.pow(R2, 2);
			double S3 = S1 - S2;
			
			System.out.format("S1 = %.2f%n", S1);
			System.out.format("\nS2 = %.2f%n", S2);
			System.out.format("\nS3 = %.2f%n", S3);
					
			
	
		
			
		
		
		
		scn.close();
		
		
	}
}

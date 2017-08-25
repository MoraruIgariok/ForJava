import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		System.out.println("Dati marimea segmentelor A , B cu conditia A > B");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		double f = a/b; 
		System.out.println("Segmentul B se contine in A de " + (int)f + " ori");
		scn.close();
	
		
		
	}
}
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		System.out.print("Dati marimea segmentelor A, B cu conditia A > B: ");
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int B = scn.nextInt();
		int F = A - B;
		System.out.print("marimea segmentului deutilizata este: " + (int)F);
		scn.close();
	}

}

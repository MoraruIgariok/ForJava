import java.util.Scanner;

public class Ex6 {

	public static void main(String arg[]) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Dati lungimea: \n L = ");
		float L = scn.nextFloat();
		System.out.print("Dati latimea: \n l = ");
		float l = scn.nextFloat();
		System.out.print("Dati inaltimea: \n h = ");
		float h = scn.nextFloat();
		
		float V = L * l * h;
		System.out.println("Volumul este(V=): " + V);
		float S = 2 * ( l* L + h * l + L * h );
		System.out.print("Suprafata este(S=) " + S);
		scn.close();
	}
}

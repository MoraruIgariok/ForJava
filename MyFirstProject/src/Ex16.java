import java.util.Scanner;

public class Ex16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			System.out.print("Dati coordonata x1: " );
			Scanner scn = new Scanner(System.in);
			int x1 = scn.nextInt();
			System.out.print("Dati coordonata x2: ");
			int x2 = scn.nextInt();
			
			System.out.println("Valoarea absoluta este " + Math.abs(x2-x1));
			scn.close();

	}

}

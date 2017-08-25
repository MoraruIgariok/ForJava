import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		System.out.print("Dati un numar de 2 cifre: ");
		Scanner scn = new Scanner(System.in);
		int ab = scn.nextInt();
		float a = ab/10.f;
		float b = (a - (int)a) *10;
		System.out.println("Numarul zecilor este " + (int)a + " numarul unitatilor " + (int)b);
		scn.close();
	}

}

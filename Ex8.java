import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		System.out.println("Da-ti un numar de 2 cifre ");
		Scanner scn = new Scanner(System.in);
		int ab = scn.nextInt();
		float a = ab/10f;
		float b = Math.round(10 * (a - (int)a));
		int ba = (int)b * 10 + (int)a;
		System.out.println("Numarul lui " + ab + " are inversul " + ba);
		
		
		scn.close();
		
		
	}

}

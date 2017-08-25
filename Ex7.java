import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		System.out.print("Dati un numar de 2 cifre ");
		Scanner scn = new Scanner(System.in);
		int ab = scn.nextInt();
		float a  = ab/10f;
		float b = (a - (int)a)*10;
		int b1 = Math.round(b);
		int sum = (int)a + b1;
		int pro = (int)a * b1;
		
		System.out.println(ab + " suma cifrelor acestui numar este  "  +sum+"\n iar produsul este " + pro);
		
		
		
		scn.close();
		
	}

}

import java.util.Scanner;


public class Ex5 {

	public static void main(String[] args) {
		
		System.out.println("Indicati dimensiunea cubului: ");
		System.out.print("a = ");
		Scanner scn = new Scanner(System.in);
		float a = scn.nextFloat();
		float V = a * a * a;
		System.out.println("Volumul Cubului \n V = " + V);
		float S = 6 * V/a;
		System.out.println("Aria cubului este \n S =" + S);
		float s = 6 * a * a;
		System.out.println("Aria cubului este \n s =" + s);
		scn.close();
	}

}

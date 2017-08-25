import java.util.Scanner;



public class Ex2 {
	public static void main(String arg[]) {
		
	System.out.print("Dati valoare parametrului a: ");
	Scanner scn = new Scanner(System.in);
	float a = scn.nextFloat();
	float S = a * a;
	
	System.out.print("Rezultatul este S = " + S);
	
	scn.close();
	}
}

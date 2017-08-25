import java.util.Scanner;
public class ex1 {

	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Dati valoare parametrului a:");
		float a = scn.nextFloat();
		float p = 4 * a;
		 
		System.out.print("P = " + p);
		
	}

}

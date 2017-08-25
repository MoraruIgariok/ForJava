import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		System.out.println("Inticati temperatura atmosferii in Celsius");
		Scanner scn = new Scanner(System.in);
		int T_c = scn.nextInt();
		double T_f = 9/5 * (T_c + 32);
		System.out.print("Momentan temperatura este de " + T_c +"grade celsius ("+T_f+"far)");
		
		scn.close();
	}

}

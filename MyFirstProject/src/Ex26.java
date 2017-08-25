import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("DAti o valoare pentru x:");
		int x = scn.nextInt();
		int y = x - 3;
		double Fx = 4 * Math.pow(y, 6) - 7 * Math.pow(y, 3) + 2;
		System.out.print("Rezultatul Functie pentru x(" + x +") = " + Fx);
		
		
		scn.close();
	}

}

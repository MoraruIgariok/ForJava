import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		double Fx;
		System.out.println("Dati o valoare pentru x");
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		Fx = 3 * Math.pow(x, 6) - 6 * Math.pow(x, 2) - 7;
		System.out.println("Rezultatul " + Fx);
		scn.close();
	}

}

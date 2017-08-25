import java.util.Scanner;

public class Ex14 {

	public static final float pi = 3.14f;
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Raza cercului (R=) ");
		float R = scn.nextFloat();
		float L = 2 * pi * R;
		double S = pi * Math.pow(R,2);
		
		System.out.println();
		System.out.format("Raza cerculu: %.2f%n", S);
		System.out.format("\nLungimea cercului: %.2f%n", L);
		
		
		
		scn.close();
		

	}

}

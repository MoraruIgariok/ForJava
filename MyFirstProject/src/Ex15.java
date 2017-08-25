import java.util.Scanner;


public class Ex15 {
	public static final float pi = 3.14f;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Indicati diametru cercului (d) ");
		float D = scn.nextFloat();
		float L = pi * D;
		System.out.format("Lungimea cercului este %.4f%n", L);
		float S = pi * (D * D)/4;
		System.out.format("\nAria cercului reprezentata prin diametru: %.4f%n" , S);
		
		
		
		
		scn.close();

	}

}

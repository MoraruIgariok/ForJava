import java.util.Scanner;

public class Ex7 {
	
	public static final float pi = 3.14f;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Indicati raza cercului \n r = ");
		float r = scn.nextFloat();
		float A = pi * r * r;
		float L = 2 * pi * r;
		System.out.println("Aria cercului(A=) este: " + A);
		System.out.println("Lungimea cercului (L=) este: " + L);
		
		scn.close();

	}

}

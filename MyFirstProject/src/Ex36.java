import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce-ti viteza primului Autoturism (A1)");
		float A1 = scn.nextFloat();
		System.out.println("Introduce-ti viteza pentru al doilea Autoturism (A2)");
		float A2 = scn.nextFloat();
		System.out.println("Indicati peste cit timp doriti sa calculati distanta dintre ele(s)");
		float t = scn.nextFloat();
		float A1_d_A2 = Math.abs((A2-A1) * t);
		System.out.println("Dupa " + t + " secunde distanta dintre A1 si A2 va fi " + A1_d_A2 + " metri");
		scn.close();
		
		

	}

}

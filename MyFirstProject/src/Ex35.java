import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Indicati viteza corabiei(m/s): ");
		float v = scn.nextFloat();
		System.out.println("Indicati viteza fluviului(m/s): ");
		float u = scn.nextFloat();
		System.out.println("Dati timpul deplasari pe directia riului:(s):" );
		float t1 = scn.nextFloat();
		System.out.println("Dati timpul de deplasare impotriva riului(s)");
		float t2 = scn.nextFloat();
		float S = (v + u) * (t1 - t2);
		System.out.print("Corabia a parcurt distanta de " + S/1000 + " (Km) pe directia riului in " + t1 + "sec");
		
		
		
		
		scn.close();
	}

}

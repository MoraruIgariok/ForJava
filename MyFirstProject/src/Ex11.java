import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Dati numarul a nenegativ:");
		float a = scn.nextFloat();
		System.out.print("Dati numarul b nenegativ:");
		float b = scn.nextFloat();
		
		float sum = a + b;
		float dif = a - b;
		float pro = a * b;
		float div = a / b;
		float mod = a % b;
		float abs = Math.abs(a);
		System.out.println("Rezultatele sunt :");
		System.out.print("sum = " + sum );
		System.out.print("\ndif = " + dif);
		System.out.print("\npro = " + pro);
		System.out.print("\ndiv = " + div);
		System.out.print("\nmod = " + mod);
		System.out.print("\nabs = " + abs);
		
		
		scn.close();
	}

}

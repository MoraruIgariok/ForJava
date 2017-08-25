import java.util.Scanner;


public class Ex9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Dati numarul a nenegativ:");
		float a = scn.nextFloat();
		System.out.print("Dati numarul b nenegativ:");
		float b = scn.nextFloat();
		double rez = a * b;
		double Rez = Math.sqrt(rez);
		System.out.println("Rez = " + Rez);
		scn.close();
		
		

	}


}

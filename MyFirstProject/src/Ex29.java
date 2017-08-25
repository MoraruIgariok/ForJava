import java.util.Scanner;

public class Ex29 {

	public static final float pi = 3.14f;
	
	public static void main(String[] args) {
		
	System.out.println("Dati marimea unghiului ß");
	Scanner scn = new Scanner(System.in);
	int beta = scn.nextInt();
	float Radiani = (pi * beta) / 180;
	System.out.println("Unghiul de " + beta + "˜ grade = " + Radiani + " rad");
	
	scn.close();
	}
}

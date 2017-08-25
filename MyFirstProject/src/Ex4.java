import java.util.Scanner;

public class Ex4 {

	public static final float pi = 3.14f;
	
	public static void main(String[] args) {
		
		 
		 System.out.print("Dati diametru d: ");
		
		 Scanner scn = new Scanner(System.in);
		 float d = scn.nextFloat();
		 
		 float L = pi * d;
		 System.out.print("Lungimea cercului este L =  " + L);
		 
		 scn.close();
	}

}

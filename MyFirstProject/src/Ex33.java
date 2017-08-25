import java.util.Scanner;

public class Ex33 {

	public static void main(String args[]) {
	
		Scanner scn = new Scanner(System.in);
		System.out.print("indicati masa produsului: ");
		float x = scn.nextFloat();
		System.out.print("inticati pretul pentru masa data: ");
		float a = scn.nextFloat();
	    System.out.print("cit va costa ");
	    float y =scn.nextFloat();
	    float kg1 = a/x;
	    float sum  = y * kg1 ;
	    System.out.print(String.format("Un kg costa %.2f"	,kg1)); 
	    	System.out.print(String.format("\nunde, " + y +" costa %.2f",sum));
	    		
	    scn.close();
	}
}

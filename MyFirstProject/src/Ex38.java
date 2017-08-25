import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Dati coeficientru a (a<>0) si coeficintul b\n");
		float a = scn.nextFloat();
		float b = scn.nextFloat();
		
		System.out.print("Am optinut ecuatia " + a + "x +" + b + " = " + 0);
		float x = -(b/a);
		System.out.print("Rexultatul este: x = -(" + b+":"+ a+") = " + x);
		
		
		scn.close();

	}

}

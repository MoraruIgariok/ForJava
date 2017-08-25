import java.util.Scanner;

public class Ex39 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Pentru ecuatia de forma'ax^2 + bx + c = 0' \nDati coeficientru a (a<>0), b si coeficintul c\n");
		float a = scn.nextFloat();
		float b = scn.nextFloat();
		float c = scn.nextFloat();
		
		System.out.print("Am optinut ecuatia " + (int)a + "x^2 + " + (int)b + "x " + " + "+ (int)c +" = "+ 0);
		float D = b * b - 4 * a * c;
		if(D>=0) {
		double x1 = (-b + Math.sqrt(D))/(2*a);
		double x2 = (-b - Math.sqrt(D))/(2*a);
		
		System.out.println(String.format("\nRexultatul este: x1 = %.2f",x1));
		System.out.print(String.format("\nRexultatul este: x2 = %.2f",x2));
		}else {
			System.out.println("\n"+(int)D+"\nDeterminantul este negativ si in multimea R nu are solutii");
		
		}
		scn.close();
	}

}

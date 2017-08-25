import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Dati coeficientru a , b , c \n ");
		float a = scn.nextFloat();
		float b = scn.nextFloat();
		float c = scn.nextFloat();
		System.out.print("Dati coeficientru a1 , b1 , c1 \n ");
		float a1 = scn.nextFloat();
		float b1 = scn.nextFloat();
		float c1 = scn.nextFloat();
		System.out.println("Optinem ecuatia:");
		System.out.println((int)a + "x + " + (int)b + "y = " + (int)c);
		System.out.println((int)a1 + "x + " + (int)b1 + "y = " + (int)c1);
		System.out.println("Folosim metoda reducerii la care se inmulteste I sau a II cu un numara care la scadere sa se reduca o necunoscuta (a1)");
		System.out.print("aa1a + ba1y = ca1\na1ax + b1ay = c1a1 ");
		System.out.println("\nRezolvam sistemul:");
		float b2= b*a1 -b1*a;
		float c2=c*a1 - c1*a;
		System.out.println((int)a*(int)a1 + "x + " + (int)b *(int)a1 + "y = " + (int)c * (int)a1);
		System.out.println((int)a1*(int)a + "x + " + (int)b1*(int)a + "y = " + (int)c1*(int)a);
		System.out.print("Optinem: " +b2+"y"+" = "+c2);
		float y = c2/b2;
		System.out.print("\ny = "+y);
		float x = (c1 - b1 * y)/a1;
		System.out.print("\nx = "+x);
		float z1 = a*x + b*y;
		float z2 = a1*x + b1*y;
		if(z1 == c && z2 ==c1) {
			System.out.println("\nLa verificare Solutiile: \nx=" + x + "\ny=" + y+ "\n Sunt acceptate!");
		}else{
			System.out.println("Solutiile nu sunt acceptate");
		}
		
		
		scn.close();
	}

}

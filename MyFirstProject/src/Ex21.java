import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Da-ti x1 = ");
		int x1 = scn.nextInt();
		System.out.println("da-ti y1 = ");
		int y1 = scn.nextInt();
		System.out.println("Da-ti x2 = ");
		int x2 =scn.nextInt();
		System.out.println("Da-ti y2 = ");
		int y2 = scn.nextInt();
		System.out.println("Da-ti x3 = ");
		int x3 =scn.nextInt();
		System.out.println("Da-ti y3 = ");
		int y3 = scn.nextInt();
		//a
		double a1 = Math.pow((x2 - x1),2);
		double a2 = Math.pow((y2 - y1),2);
		double a = Math.pow((a1 + a2), 1/2);
		//b
		double b1 = Math.pow((x3 - x1),2);
		double b2 = Math.pow((y3 - y1),2);
		double b = Math.pow((b1 + b2), 1/2);
		//c
		double c1 = Math.pow((x3 - x2),2);
		double c2 = Math.pow((y3 - y2),2);
		double c = Math.pow((c1 + c2), 1/2);
		System.out.print("rezultatul este : \na =" + a);
		System.out.print("\nrezultatul este : \nb =" + b);
		System.out.print("\nrezultatul este : \nc =" + c);
		double p = (a + b + c)/2;
		System.out.print("\nPerimetru: " + p);
		double S = Math.pow((p * (p-a)*(p-b)*(p-c)),1/2);
		System.out.print("\nAria : " + S);
		scn.close();
	}

}

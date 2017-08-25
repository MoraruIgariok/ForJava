import java.util.Scanner;

public class Ex20 {

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
		double a = Math.pow((x2 - x1),2);
		double b = Math.pow((y2 - y1),2);
		double rezult = Math.sqrt(a+b);
				//Math.pow((Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2)),1/2);
		System.out.print("rezultatul este : " + rezult);
		scn.close();

	}

}

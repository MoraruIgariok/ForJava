import java.util.Scanner;

public class Ex19 {

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
		int L = Math.abs(x2 - x1);
		System.out.print("Lungimea drept = " + L);
		int l = Math.abs(y2 - y1);
		System.out.print("\nlatimea drept = " + l);
		System.out.print("\nperimetrul este = " + 2 * (L+l) );
		System.out.print("\naria este = " + L * l );
		scn.close();
	}

}

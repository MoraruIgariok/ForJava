import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("Indicati lungimea in centimetri: ");
		Scanner scn = new Scanner(System.in);
		int L_cm = scn.nextInt();
		double L_m = L_cm * 0.01;
		if(L_m % 2 == 0) {
			System.out.print(L_cm + " cm = " + (int)L_m + " m");
		}else {
			System.out.println(L_cm + " cm = " + (int)L_m + " m si " + (int)((L_m - (int)L_m) * 100) + " cm");
			
		}
		scn.close();
		
	}
}

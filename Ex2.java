import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		System.out.print("Indicati ce masa in Kg: ");
		Scanner scn = new Scanner(System.in);
		int kg = scn.nextInt();
		double ton = kg * 0.001;
		if(ton % 2 == 0) {
			System.out.print(kg + " kg = " + ton + " tone");
		}else if((ton -(int)ton) * 10 == 0){
			System.out.print(kg + " kg =" + (int)ton + " tone si "+ (int)((ton -(int)ton) * 100) + " kg");
		}else {
			System.out.print(kg + " kg =" + (int)ton + " tone si "+ (int)((ton -(int)ton) * 1000) + " kg");
		}
		scn.close();
	}

}

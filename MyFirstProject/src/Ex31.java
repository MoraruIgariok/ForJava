import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		System.out.print("Indicati temperatura in Faradi ");
		Scanner scn = new Scanner(System.in);
		int T_f = scn.nextInt();
		double T_c = (T_f - 32) * 5/9;
		System.out.print(T_f + " grade faradei in celsius este " + T_c);
		
		
		scn.close();

	}

}

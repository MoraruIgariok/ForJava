import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("dati un numar de trei cifre _ _ _");
		int abc = scn.nextInt();	
		int a = abc/100;
		int b = abc/10 - a*10;
		int c = abc - (a*10 + b)*10;
		System.out.print(a + "\n"+b+"\n"+c);
		
		
		scn.close();
	}

}

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		System.out.println("Introduceti un numar de 3 cifre ___");
		Scanner sc = new Scanner(System.in);
		int sum,prod;
		int abc = sc.nextInt();
		int a = abc/100;
		int b = abc/10 - a*10;
		int c = abc %10;
		sum = a+b+c;
		prod = a*b*c;
		System.out.println("Suma cifrelor este: " + sum + " produsul cifrelor este: " + prod);
		sc.close();

	}

}

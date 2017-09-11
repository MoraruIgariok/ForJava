import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dati un numar de trei cifre: ");
		int[] abc = new int[3];
		for (int i =0; i < 3; i++) {
				abc[i] = sc.nextInt();
		}
		
		System.out.println("Numarul este:");
		
		for(int i1 =0; i1 < 3; i1++) {
		
			System.out.print(abc[i1]);
		}
		
		System.out.println();
		
		for(int j = 2; j>= 0; j--) {
			
			System.out.println("numarul cu indexul["+j+"] este " + abc[j]);
		}
		
		
		sc.close();
		

	}

}

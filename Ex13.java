import java.util.Scanner;

public class Ex13 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduceti numaarul de 3 cifre ___");
		int n = 3;
		int abc[] = new int[n] ;
		
		for(int i =0; i< n; i++) {
			abc[i] = sc.nextInt();
			
		}
		System.out.print("Numarul este: ");
		for(int i =0; i< n; i++) {
			System.out.print(abc[i]);
		}
		System.out.println();
		for(int j = 0; j < 2;j ++){
			int temp = abc[j];
			abc[j] = abc[j+1];
			abc[j+1] = temp;		
			
		}
		System.out.println("numarul finl este:");
		for(int j = 0; j < n;j ++){		
			System.out.print(abc[j]);
		}
		
		
		 
	}
}

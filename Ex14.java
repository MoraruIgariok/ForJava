import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
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
		for(int j = n-1; j >=1;j --){
			int temp = abc[j];
			abc[j] = abc[j-1];
			abc[j-1] = temp;		
			
		}
		System.out.print("numarul finl este: ");
		for(int j = 0; j < n;j ++){		
			System.out.print(abc[j]);
		}
		sc.close();
		
	}

}

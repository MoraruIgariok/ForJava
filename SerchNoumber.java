import java.util.Scanner;

public class SerchNoumber {

	public static void main(String[] args) {
		System.out.println("We try Serch noumber x to array\nGive leangth to array");
		Scanner sc = new Scanner(System.in);
		int n ,count = 0;
		n = sc.nextInt();
		int vector[] = new int[n];
		if(n > 0) {
		System.out.println("Dati valori pentru acest array:");
		for(int i = 0; i < n; i++) {
			System.out.println("vector[ "+(i+1)+" ] = ");
			vector[i] = sc.nextInt();
		} 
     	System.out.println("Avem vectorul cu " + n + " elemente ");
		for(int i =0; i<n;i++) {
			System.out.print(vector[i] + " ");
		}
		
		System.out.print("\nWhat nuomber do you searsh ");
		int Searche = sc.nextInt();
		for(int i =0;i<n; i++) {
			if(vector[i] == Searche) {
				count++;
				System.out.println(Searche + " is to position vector["+(i+1)+"]");
			}
		}
		System.out.print("This number belong in vector " + count + " or");
		}else {
			System.out.print("This nuomber didn't is leangth!");
		}
		
		sc.close();

	}

}

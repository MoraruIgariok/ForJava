import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		System.out.print("indicati marimea fisierului:");
		Scanner scn = new Scanner(System.in);
		int size_b = scn.nextInt();
		int k = 1024;
		double size_k = size_b/k; 
		if(size_b % 2 == 0) {
			System.out.print(size_b + " bits = " + (int)size_k + " Kilobits");
		}else if((size_k -(int)size_k) * 10 == 0){
			System.out.print(size_b + " bits =" + (int)size_k + " kilobits si "+ (int)((size_k -(int)size_k) * 100) + " bits");
		}else {
			System.out.print(size_b + " bits =" + (int)size_k + " kilobits si "+ (int)((size_k -(int)size_k) * 1000) + " bits");
		}
		
		scn.close();

	}

}
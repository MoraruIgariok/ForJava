import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		System.out.println("selectati unu din unul din cazuti(1/2)");
		Scanner sc = new Scanner(System.in);
		int caz = sc.nextInt();
		int[] abc = new int[3];
	switch(caz) {
	case 1:
		System.out.println("A-ti selectat varianta a-1 de calcul\n Introduce-ti un numar de 3 cifre");
				for(int i = 0; i< 3; i++) {
					 abc[i]=sc.nextInt();	
				}
						
				for(int j=0;j<3;j++) {
			
					System.out.print(abc[j]);
				}
				
				System.out.println();
				
				for(int j = 2; j > 0; j--) {
					
					System.out.println("last number is " + abc[j] + "middle number is " + abc[j]);
				}
				break;
	case 2: 
		System.out.println("A-ti selectat varianta a-2 de calcul\n Da-ti un numar de 3 cifre");
				int abc1 = sc.nextInt();
				int a = abc1%10;
				int b = (abc1%100)/10;
				System.out.println("last number is " + a + " and middle number is " + b);
		break;
	
	}
	sc.close();
	}

}

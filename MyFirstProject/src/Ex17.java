import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		System.out.println("Selectati tipul axei ABC/ACB/CBA/CAB");
		Scanner scn = new Scanner(System.in);
		String A = scn.next();
		switch(A) {
			case "ABC":{
				System.out.println("Avem axa:\n A.------------.B------------------------.C");
				String AB ="AB";
				String BC ="BC";
				System.out.println("AC = " + AB + " + " + BC);
				System.out.println("BC = " + AB + " - " + BC);
				break;
			}
			case "ACB":{
				System.out.println("Avem axa:\n A.------------.C------------------------.B");
				String AB ="AC";
				String BC ="CB";
				System.out.println("AC = " + AB + " + " + BC);
				System.out.println("BC = " + AB + " - " + BC);
				break;
			}
			case "CBA":{
				System.out.println("Avem axa:\n C.------------.B------------------------.A");
				String AB ="CB";
				String BC ="BA";
				System.out.println("AC = " + AB + " + " + BC);
				System.out.println("BC = " + AB + " - " + BC);
				break;
			}
			case "CAB":{
				System.out.println("Avem axa:\n B.------------.C------------------------.A");
			    String AB ="CA";
				String BC ="AC";
				System.out.println("AC = " + AB + " + " + BC);
				System.out.println("BC = " + AB + " - " + BC);
				break;
			}
			default:{
				System.out.println("Nu avem asa axa!");
			}
		
		}
		System.out.println("Sa se calculeze: \nAC-?\nBC-?");
		scn.close();
		
	}

}

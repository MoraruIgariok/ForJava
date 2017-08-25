
public class Ex24 {

	public static void main(String[] args) {
		
		int A =1,B=3,C=24;
		int D;
		System.out.println("I Stage");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		System.out.println("C = " + C);
		D = A;
		
		
		A = C;
		C = B;
		B = D;
		System.out.println("II Stage");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		System.out.println("C = " + C);

	}

}

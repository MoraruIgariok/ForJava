import java.util.Scanner;

public class Ex30 {

	public static final float pi =3.14f;
	public static void main(String[] args) {
		
		System.out.println("dati unghiul in radian: ");
		Scanner scn = new Scanner(System.in);
		float rad = scn.nextFloat();
		float unghi = (rad * 180)/pi;
		int rezul =  (int)Math.round(unghi);/*convertire din float in int*/
		System.out.println("Pentru " + rad + " radiani unghiul are " + rezul+ "* grade");
		scn.close();
		

	}

}

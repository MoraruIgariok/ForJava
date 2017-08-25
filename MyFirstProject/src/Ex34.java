import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Dati cantitatea de ciocolata si de Zahar");
		float X = scn.nextFloat();
		float Y = scn.nextFloat();
		System.out.println("Indicati pretul achitat pentru ciocalata si zahar");
		float A = scn.nextFloat();
		float B =scn.nextFloat();
		scn.close();
		float Pret_X = A/X;
		float Pret_Y = B/Y;
		System.out.println(String.format("1 kg de Ciocolata costa = %.2f", Pret_X) + "euro" + String.format("\n1 Kg Zaharul costa = %.2f", Pret_Y)+"euro");
		float max = Pret_X - Pret_Y;
		
		if(max > 0){
			System.out.print(String.format("Ciocolate este cu %.2f", max) + " euro mai scumpa");
			
			}else if(max < 0) {
				float Min = Math.abs(max);
				System.out.print(String.format("Ciocolate este cu %.2f", Min) + " euro mai eftina");
			}else {
				System.out.print("Ciocolate este este la acelasi pret cu zaharul");
			}
		}
	}



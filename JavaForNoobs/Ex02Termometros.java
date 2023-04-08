package JavaForNoobs;
import java.util.Scanner;

public class Ex02Termometros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		double C;
		double F;
		double K;
		double Re;
		double Ra;
		
		System.out.print("Digite o valor em graus celsius: ");
		C = input.nextInt();
		
		F = (C * 1.8) + 32;
		K = C + 273.15;
		Re = C * 0.8;
		Ra = (C * 1.8) + 32 + 459.67;
		

		System.out.println("");
		System.out.printf("Valor em Fahrenheit: %.2f\n", F);
		System.out.printf("Valor em Kelvin: %.2f\n", K);
		System.out.printf("Valor em Re: %.2f\n", Re);
		System.out.printf("Valor em Ra: %.2f\n", Ra);

        input.close();
    }
}

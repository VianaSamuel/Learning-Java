package JavaForNoobs;

import java.util.Scanner;

public class Ex14ContaMaiores {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
		int idade = 0;
		int controlador = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite a idade " + i + ": ");
			idade = input.nextInt();

			if (idade >= 18) {
				controlador++;
			}
		}

        System.out.println();

		System.out.println("Na lista ha " + controlador + " maiores de idade.");

        input.close();
    }
}

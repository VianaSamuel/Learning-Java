package A99Avulsos;

import java.util.Scanner;

public class Ex13SomaIdades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		int idade = 0;
		int soma = 0;
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.printf("Digite a idade " + i + ": ");
			idade = input.nextInt();
			soma += idade;
		}

        System.out.println();
		
		System.out.println("A soma das idades é " + soma + ".");

        input.close();
    }
}

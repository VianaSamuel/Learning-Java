package L99ExerciciosAvulsos;

import java.util.Scanner;

public class Ex15SomaProdutos {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.printf("Informe a quantidade de produtos: ");
			int produtos = input.nextInt();
			float soma = 0;
			float preço = 0;
			int i = 2;
			
			if (produtos < 2) {
			    System.out.println();
				System.out.println("A quantidade mínima necessária de produtos é 2.");
			} else {
				System.out.println();
					
			    for (i = 1; i <= produtos; i++) {
			    	System.out.printf("Digite o preço do produto " + i + ": ");
			    	preço = input.nextFloat();
			    	soma += preço;
			    }

			    System.out.println();
			    System.out.println("A soma do preço dos produtos é de " + soma + ".");
			}
				
			input.close();
		}
    }
}

package JavaForNoobs;

import java.util.Scanner;

public class Ex15SomaProdutos {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.printf("Informe a quantidade de produtos: ");
			int produtos = input.nextInt();
			float soma = 0;
			float preco = 0;
			int i = 2;
			
			if (produtos < 2) {
			    System.out.println();
				System.out.println("A quantidade minima necessaria de produtos eh 2.");
			} else {
				System.out.println();
					
			    for (i = 1; i <= produtos; i++) {
			    	System.out.printf("Digite o preco do produto " + i + ": ");
			    	preco = input.nextFloat();
			    	soma += preco;
			    }

			    System.out.println();
			    System.out.println("A soma do preco dos produtos eh de " + soma + ".");
			}
				
			input.close();
		}
    }
}

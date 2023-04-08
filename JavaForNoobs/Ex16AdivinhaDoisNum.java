package JavaForNoobs;

import java.util.Random;
import java.util.Scanner;

public class Ex16AdivinhaDoisNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int num = random.nextInt(10);
		System.out.println(num);
		int tentativas = 0;
		
		System.out.printf("Tente adivinhar o numero gerado: ");
		int chute = input.nextInt();

		if (chute > num) {
			System.out.println("O seu chute eh maior do que o numero gerado.");
			System.out.println();
			tentativas++;
		}
		
		if (chute < num) {
			System.out.println("O seu chute eh menor do que o numero gerado.");
			System.out.println();
			tentativas++;
		}
		
		while (chute != num) {
		    	System.out.printf("Tente adivinhar o numero gerado: ");
		    	chute = input.nextInt();
            
		    if (chute > num) {
		    	System.out.println("O seu chute eh maior do que o numero gerado.");
		    	System.out.println();
		    	tentativas++;
		    }
        
		    if (chute < num) {
		    	System.out.println("O seu chute eh menor do que o numero gerado.");
		    	System.out.println();
		    	tentativas++;
		    }
	    }
		
		if (chute == num) {
			System.out.println("Apos " + tentativas + " tentativas, voce acertou o numero gerado (" + num+ ").");
		}

        input.close();
    }
}

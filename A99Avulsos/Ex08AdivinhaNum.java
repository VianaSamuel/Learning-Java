package A99Avulsos;
import java.util.Scanner;
import java.util.Random;

public class Ex08AdivinhaNum {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int num = random.nextInt(10) + 1;
		
		System.out.printf("Tente adivinhar o numero gerado (1 a 10): ");
		int chute = input.nextInt();
		
		if (chute == num) {
			System.out.println("Voce acertou. O numero gerado foi " + num + ".");
		} else {
			System.out.println("Voce errou. O numero gerado foi " + num + ".");	
		}

        input.close();
    }
}
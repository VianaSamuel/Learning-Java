package ExerciciosAvulsos;
import java.util.Scanner;
import java.util.Random;

public class Ex08AdivinhaNum {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int num = random.nextInt(10) + 1;
		
		System.out.printf("Tente adivinhar o número gerado (1 a 10): ");
		int chute = input.nextInt();
		
		if (chute == num) {
			System.out.println("Você acertou. O número gerado foi " + num + ".");
		} else {
			System.out.println("Você errou. O número gerado foi " + num + ".");	
		}

        input.close();
    }
}
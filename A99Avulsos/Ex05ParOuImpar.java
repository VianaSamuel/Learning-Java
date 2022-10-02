package A99Avulsos;
import java.util.Scanner;

public class Ex05ParOuImpar {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Digite o número: ");
		int x = input.nextInt();
		
        System.out.println("");
        
		if (x%2 == 0) {
			System.out.println("O número é par.");
		}
		
		else {
			System.out.println("O número é ímpar.");
		}

		input.close();
    }
}
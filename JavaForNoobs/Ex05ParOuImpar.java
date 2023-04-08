package JavaForNoobs;
import java.util.Scanner;

public class Ex05ParOuImpar {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Digite o numero: ");
		int x = input.nextInt();
		
        System.out.println("");
        
		if (x%2 == 0) {
			System.out.println("O numero eh par.");
		}
		
		else {
			System.out.println("O numero eh impar.");
		}

		input.close();
    }
}
package JavaForNoobs;
import java.util.Scanner;

public class Ex04ComparaNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int n1 = input.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		int n2 = input.nextInt();
		
		System.out.print("Digite o terceiro numero: ");
		int n3 = input.nextInt();
		
        System.out.println("");
        
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " eh o maior numero.");
			
			if (n2 > n3) {
				System.out.println(n3 + " eh o menor numero.");
			}
			
			if (n2 < n3) {
				System.out.println(n2 + " eh o menor numero.");
			}
		}
		
		else if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " eh o maior numero.");
			
			if (n1 > n3) {
				System.out.println(n3 + " eh o menor numero.");
			}
			
			if (n1 < n3) {
				System.out.println(n1 + " eh o menor numero.");
			}
		}
		
		else if (n3 > n1 && n3 > n2) {
			System.out.println(n3 + " eh o maior numero.");
			
			if (n1 > n2) {
				System.out.println(n2 + " eh o menor numero.");
			}
			
			if (n1 < n2) {
				System.out.println(n1 + " eh o menor numero.");
			}
		}

        input.close();
    }
}

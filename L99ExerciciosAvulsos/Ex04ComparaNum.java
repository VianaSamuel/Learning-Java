package L99ExerciciosAvulsos;
import java.util.Scanner;

public class Ex04ComparaNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int n1 = input.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int n2 = input.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		int n3 = input.nextInt();
		
        System.out.println("");
        
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " é o maior número.");
			
			if (n2 > n3) {
				System.out.println(n3 + " é o menor número.");
			}
			
			if (n2 < n3) {
				System.out.println(n2 + " é o menor número.");
			}
		}
		
		else if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " é o maior número.");
			
			if (n1 > n3) {
				System.out.println(n3 + " é o menor número.");
			}
			
			if (n1 < n3) {
				System.out.println(n1 + " é o menor número.");
			}
		}
		
		else if (n3 > n1 && n3 > n2) {
			System.out.println(n3 + " é o maior número.");
			
			if (n1 > n2) {
				System.out.println(n2 + " é o menor número.");
			}
			
			if (n1 < n2) {
				System.out.println(n1 + " é o menor número.");
			}
		}

        input.close();
    }
}

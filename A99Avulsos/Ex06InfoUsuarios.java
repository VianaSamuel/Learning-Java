package A99Avulsos;
import java.util.Scanner;

public class Ex06InfoUsuarios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.printf("Digite o nome do usuario 1: ");
		String n1 = input.next();
		
		System.out.printf("Digite a idade do usuario 1: ");
		int i1 = input.nextInt();
		
		System.out.printf("\nDigite o nome do usuario 2: ");
		String n2 = input.next();
		
		System.out.printf("Digite a idade do usuario 2: ");
		int i2 = input.nextInt();
		
		System.out.println();
		
		System.out.println("Usuario 1:");
		System.out.println(n1 + ", " + i1);
		
		System.out.println();
		
		System.out.println("Usuario 2:");
		System.out.println(n2 + ", " + i2);

        input.close();
    }
}

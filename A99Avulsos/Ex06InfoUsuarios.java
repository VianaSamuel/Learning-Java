package A99Avulsos;
import java.util.Scanner;

public class Ex06InfoUsuarios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.printf("Digite o nome do usuário 1: ");
		String n1 = input.next();
		
		System.out.printf("Digite a idade do usuário 1: ");
		int i1 = input.nextInt();
		
		System.out.printf("\nDigite o nome do usuário 2: ");
		String n2 = input.next();
		
		System.out.printf("Digite a idade do usuário 2: ");
		int i2 = input.nextInt();
		
		System.out.println();
		
		System.out.println("Usuário 1:");
		System.out.println(n1 + ", " + i1);
		
		System.out.println();
		
		System.out.println("Usuário 2:");
		System.out.println(n2 + ", " + i2);

        input.close();
    }
}

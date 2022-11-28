package A99Avulsos;
import java.util.Scanner;

public class Ex12MediaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.printf("Digite a quantidade de alunos: ");
		int alunos = input.nextInt();
        System.out.println();
		
		int soma = 0;		
		for (int i = 1; i <= alunos; i++) {
			System.out.printf("Digite a nota " + i + ": ");
			int nota = input.nextInt();
			soma += nota;
		}
		int media = (soma/alunos);

		System.out.println();
		System.out.println("A media aritmetica das notas eh " + media + ".");

        input.close();
    }
}

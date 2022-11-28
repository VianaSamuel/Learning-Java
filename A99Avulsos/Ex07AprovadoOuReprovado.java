package A99Avulsos;
import java.util.Scanner;

public class Ex07AprovadoOuReprovado {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Digite sua nota: ");
		float nota = input.nextFloat();
		
		if (nota >= 7) {
			System.out.println("Voce foi aprovado.");
		} else if (nota >= 5 && nota < 7) {
			System.out.println("Voce foi reprovado, porem tem direito a fazer a recuperacao.");
		} else {
			System.out.println("Voce foi reprovado.");
		}

        input.close();
    }
}

package A99Avulsos;
import java.util.Scanner;

public class Ex07AprovadoOuReprovado {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Digite sua nota: ");
		float nota = input.nextFloat();
		
		if (nota >= 7) {
			System.out.println("Você foi aprovado.");
		} else if (nota >= 5 && nota < 7) {
			System.out.println("Você foi reprovado, porém tem direito a fazer a recuperação.");
		} else {
			System.out.println("Você foi reprovado.");
		}

        input.close();
    }
}

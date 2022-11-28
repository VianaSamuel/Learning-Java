package A99Avulsos;
import java.util.Scanner;

public class Ex11ParesEImpares {
    public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);
		System.out.printf("Digite o numero: ");
		int numero = input.nextInt();
		System.out.println();
		
		if (numero <= 0) {
			System.out.println("O numero deve ser igual ou maior a 1.");
		} else {
            System.out.println("--------------");
			System.out.println("Numeros pares:");
			System.out.println("--------------");
			for (int i = 1; i <= numero; i++) {
				if (i%2 == 0) {
					System.out.println(i);
				}
			}

            System.out.println();
			
            System.out.println("----------------");
			System.out.println("Numeros impares:");
            System.out.println("----------------");
			
			for (int i = 1; i <= numero; i++) {
				if (i%2 != 0) {
					System.out.println(i);
				}
			}
		}
        input.close();
    }
}

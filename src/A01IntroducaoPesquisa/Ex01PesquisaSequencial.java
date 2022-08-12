package A01IntroducaoPesquisa;
import java.util.Scanner;

public class Ex01PesquisaSequencial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {5, 2, 7, 22, 154, 202, 1, 8, 4, 66};

        System.out.println("Vetor: {5, 2, 7, 22, 154, 202, 1, 8, 4, 66}");
        System.out.printf("Digite um número para ser procurado: ");
        int x = input.nextInt();

        System.out.println();
        isX(array, x);
        
        input.close();
    }
    
    public static void isX(int[] array, int x) {
        boolean result = false;
        int i = 0;

        while (!result && i < array.length) {
            if (array[i] == x) {
                result = true;
                System.out.println("Valor encontrado!");
                System.out.println("Posição no vetor: " + i);
            } else {
                i++;
            }
        }
        if (!result) System.out.println("Valor não encontrado.");
    }
}

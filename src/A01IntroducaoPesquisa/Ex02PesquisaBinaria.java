package A01IntroducaoPesquisa;
import java.util.Scanner;

public class Ex02PesquisaBinaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 5, 8, 81, 151, 200, 561, 814, 999};

        System.out.println("Vetor: {1, 5, 8, 81, 151, 200, 561, 814, 999}");
        System.out.printf("Digite um número para ser procurado: ");
        int x = input.nextInt();

        System.out.println();
        isX(array, x);
        
        input.close();
    }

    public static void isX(int[] array, int x) {
        boolean result = false;
        int posicao = 0;
        int dir = array.length - 1;
        int esq = 0;
        int meio;
        while (esq <= dir){
            meio = (esq + dir) / 2;
            if (x == array[meio]) {
                result = true;
                posicao = meio;
                esq = array.length;
            } else if (x > array[meio]) {
                esq = meio + 1;

            } else {
                dir = meio - 1;
            }
        }
        
        if (!result) {
            System.out.println("Valor não encontrado.");
        } else {
            System.out.println("Valor encontrado!");
            System.out.println("Posição no vetor: " + posicao);
        }
    }
}
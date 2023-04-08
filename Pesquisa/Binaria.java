package Pesquisa;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Binaria {
    public static void main(String[] args) {
        System.out.println("\n#==================#");
        System.out.println("| PESQUISA BINARIA |");
        System.out.println("#==================#\n");

        // inicializa o scanner
        Scanner input = new Scanner(System.in);
        
        // criacao do array
        int[] array = new int[10];
        
        // preenchimento do array com numeros aleatorios de 10 a 99
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (new Random().nextInt(90) + 10);
        }

        // ordena o vetor (necessario para a pesquisa binaria)
        Arrays.sort(array);

        // imprime o vetor
        System.out.println("Vetor:");
        System.out.println("*-------------------------------------------------*");
        for (int i = 0; i < array.length; i++){
            System.out.print("| " + array[i] + " ");
        }
        System.out.println("|");
        System.out.println("*-------------------------------------------------*\n");

        // recebe o numero a ser procurado e chama o metodo
        System.out.printf("Digite o numero a ser procurado: ");
        int x = input.nextInt();
        binarySearch(array, x);
        
        // fecha o scanner
        input.close();
    }

    public static void binarySearch(int[] array, int x) {
        // variaveis auxiliares
        boolean result = false;
        int posicao = 0;
        int dir = array.length - 1;
        int esq = 0;
        int meio;

        // enquanto os extremos nao se atravessam
        while (esq <= dir){
            // define o meio
            meio = (esq + dir) / 2;

            // se o numero procurado estiver no meio do array
            if (x == array[meio]) {
                result = true;
                posicao = meio;
                esq = array.length; // flag pra parar o loop
            }
            // ignora DIREITA se o numero procurado for MENOR do que o MEIO do array
            else if (x < array[meio]) {
                dir = meio - 1;
            }
            // ignora ESQUERDA se o numero procurado for MAIOR do que o MEIO do array
            else if (x > array[meio]) {
                esq = meio + 1;
            }
        }
        
        // imprime o resultado
        if (!result) {
            System.out.println("\n*-----------------------*");
            System.out.println("| Valor nao encontrado. |");
            System.out.println("*-----------------------*\n");
        } else {
            System.out.println("\n*-----------------------*");
            System.out.println("| Valor encontrado!     |");
            System.out.println("| Posicao no vetor: " + posicao + "   |");
            System.out.println("*-----------------------*\n");
        }
    }
}
package A01Pesquisa;
import java.util.Random;
import java.util.Scanner;

public class Sequencial {
    public static void main(String[] args) {
        System.out.println("\n#=====================#");
        System.out.println("| PESQUISA SEQUENCIAL |");
        System.out.println("#=====================#\n");

        // inicializa o scanner
        Scanner input = new Scanner(System.in);
        
        // criação do array   
        int[] array = new int[10];
        
        // preenchimento do array com números aleatórios de 10 a 99
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (new Random().nextInt(90) + 10);
        }

        // imprime o vetor
        System.out.println("Vetor:");
        System.out.println("*-------------------------------------------------*");
        for (int i = 0; i < array.length; i++){
            System.out.print("| " + array[i] + " ");
        }
        System.out.println("|");
        System.out.println("*-------------------------------------------------*\n");

        // recebe o número a ser procurado e chama o método
        System.out.printf("Digite o número a ser procurado: ");
        int x = input.nextInt();
        linearSearch(array, x);
        
        // fecha o scanner
        input.close();
    }
    
    public static void linearSearch(int[] array, int x) {
        // variáveis auxiliares
        int i = 0;
        boolean result = false;

        // percorre o array enquanto o número não for achado e o percurso não ter sido finalizado
        while (!result && i < array.length) {
            if (array[i] == x) {
                result = true;
            } else {
                i++;
            }
        }
        
        // imprime o resultado
        if (!result) {
            System.out.println("\n*-----------------------*");
            System.out.println("| Valor não encontrado. |");
            System.out.println("*-----------------------*\n");
        } else {
            System.out.println("\n*-----------------------*");
            System.out.println("| Valor encontrado!     |");
            System.out.println("| Posição no vetor: " + i + "   |");
            System.out.println("*-----------------------*\n");
        }
    }
}

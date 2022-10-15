package A02Sorting;
import java.util.Random;

public class Bubble {
    public static void main(String[] args) {     
        System.out.println("\n#-------------#");
        System.out.println("| BUBBLE SORT |");
        System.out.println("#-------------#");
        
        // criação do array   
        int[] array = new int[10];
    
        // preenchimento do array com números aleatórios de 1 a 100
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (new Random().nextInt(100) + 1);
        }

        // imprime vetor desordenado
        System.out.println("Vetor desordenado:");
        for (int i = 0; i < array.length; i++){
            System.out.print("| " + array[i] + " ");
        }
        System.out.println("|\n");

        //=====BUBBLE SORT=====
            // controlador
            for (int i = array.length; i > 1; i--){
                // comparador
                for (int j = 0; j < i-1; j++){
                    // se o elemento à direita for menor, realiza o swap
                    if (array[j] > array[j+1]){
                        int aux = array[j];
                        array[j] = array[j+1];
                        array[j+1] = aux;
                    }
                }
            }
        //=====BUBBLE SORT=====

        // imprime vetor ordenado
        System.out.println("#------------------------#");
        System.out.println("| BUBBLE SORT REALIZADO! |");
        System.out.println("#------------------------#");
        System.out.println("Vetor ordenado:");
        for (int i = 0; i < array.length; i++){
            System.out.print("| " + array[i] + " ");
        }
        System.out.println("|\n");
    }
}
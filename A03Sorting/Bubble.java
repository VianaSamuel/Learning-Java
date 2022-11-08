package A03Sorting;
import java.util.Random;

public class Bubble {
    public static void main(String[] args) {     
        System.out.println("\n#=============#");
        System.out.println("| BUBBLE SORT |");
        System.out.println("#=============#\n");
        
        // criação do array   
        int[] array = new int[10];
    
        // preenchimento do array com números aleatórios de 10 a 99
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (new Random().nextInt(90) + 10);
        }

        // imprime o vetor desordenado
        System.out.println("Vetor desordenado:");
        System.out.println("*-------------------------------------------------*");
        for (int i = 0; i < array.length; i++){
            System.out.print("| " + array[i] + " ");
        }
        System.out.println("|");
        System.out.println("*-------------------------------------------------*\n");

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

        // imprime o vetor ordenado
        System.out.println("Vetor ordenado após o sort:");
        System.out.println("*-------------------------------------------------*");
        for (int i = 0; i < array.length; i++){
            System.out.print("| " + array[i] + " ");
        }
        System.out.println("|");
        System.out.println("*-------------------------------------------------*\n");
    }
}
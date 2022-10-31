package A02Sorting;
import java.util.Random;

public class Selection {
    public static void main(String[] args) {     
        System.out.println("\n#================#");
        System.out.println("| SELECTION SORT |");
        System.out.println("#================#\n");
        
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

        //=====SELECTION SORT=====
            // variáveis auxiliares
            int min_idx;

            // controlador
            for (int i = 0; i < array.length-1; i++){
                // define a esquerda do vetor como o menor elemento
                min_idx = i;

                // comparador
                for (int j = i+1; j < array.length; j++){
                    // se o elemento j for menor do que o menor elemento, realiza a troca
                    if (array[j] < array[min_idx]) min_idx = j;
                }

                // função swap
                int aux = array[i];
                array[i] = array[min_idx];
                array[min_idx] = aux;
            }
        //=====SELECTION SORT=====
        
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
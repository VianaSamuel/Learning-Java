package A02Sorting;
import java.util.Random;

public class Insertion {
    public static void main(String[] args) {     
        System.out.println("\n#----------------#");
        System.out.println("| INSERTION SORT |");
        System.out.println("#----------------#");
        
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

        //=====INSERTION SORT=====
            // variáveis auxiliares
            int j;

            // controlador
            for (int i = 1; i < array.length; i++){
                // define j como elemento à esquerda do controlador
                j = i-1;

                // comparador (roda SE e ENQUANTO achar um elemento menor à direita)
                while((j >= 0) && (array[j] > array[j+1])){
                    // função swap (reordena a parte à esquerda do comparador)
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                    j--;
                }
            }
        //=====INSERTION SORT=====

        // imprime vetor ordenado
        System.out.println("#---------------------------#");
        System.out.println("| INSERTION SORT REALIZADO! |");
        System.out.println("#---------------------------#");
        System.out.println("Vetor ordenado:");
        for (int i = 0; i < array.length; i++){
            System.out.print("| " + array[i] + " ");
        }
        System.out.println("|\n");
    }
}
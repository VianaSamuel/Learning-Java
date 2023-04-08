//==============//
//INSERTION SORT//
//==============//

package Sorting;
import java.util.Random;

public class Insertion {
    public static void main(String[] args) {     
        System.out.println("\n#================#");
        System.out.println("| INSERTION SORT |");
        System.out.println("#================#\n");
        
        // criacao do array   
        int[] array = new int[10];
    
        // preenchimento do array com numeros aleatorios de 10 a 99
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

        //=====INSERTION SORT=====//
            // variaveis auxiliares
            int j;

            // controlador
            for (int i = 1; i < array.length; i++){
                // define j como elemento a esquerda do controlador
                j = i-1;

                // comparador (roda SE e ENQUANTO achar um elemento menor a direita)
                while((j >= 0) && (array[j] > array[j+1])){
                    // funcao swap (reordena a parte a esquerda do comparador)
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                    j--;
                }
            }
        //=====INSERTION SORT=====//

        // imprime o vetor ordenado
        System.out.println("Vetor ordenado apos o sort:");
        System.out.println("*-------------------------------------------------*");
        for (int i = 0; i < array.length; i++){
            System.out.print("| " + array[i] + " ");
        }
        System.out.println("|");
        System.out.println("*-------------------------------------------------*\n");
    }
}
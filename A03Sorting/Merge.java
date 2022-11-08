package A03Sorting;
import java.util.Random;

public class Merge {
    public static void main(String[] args) {     
        System.out.println("\n#===========#");
        System.out.println("| MERGESORT |");
        System.out.println("#===========#\n");
        
        // criação dos arrays 
        int[] array = new int[10];
        int[] temp = new int[array.length];
        
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
        
        //=====MERGESORT=====
            // variáveis auxiliares
            int beg = 0;
            int end = array.length-1;

            // chama método
            mergesort(array, temp, beg, end);
        //=====MERGESORT=====
        
        // imprime o vetor ordenado
        System.out.println("Vetor ordenado após o sort:");
        System.out.println("*-------------------------------------------------*");
        for (int i = 0; i < array.length; i++){
            System.out.print("| " + array[i] + " ");
        }
        System.out.println("|");
        System.out.println("*-------------------------------------------------*\n");
    }
    
    public static void mergesort(int[] array, int[] temp, int beg, int end){
        // define limite de ordenação pra cada chamada
        if (beg < end){
            // variáveis auxiliares
            int mid = (int) (beg+end)/2;

            // recursivamente ordena a primeira metade
            mergesort(array, temp, beg, mid);
            // recursivamente ordena a segunda metade
            mergesort(array, temp, mid+1, end);

            // intercala as metades ordenadas
            merge(array, temp, beg, mid, end);
        }
    }

    public static void merge(int[] array, int[]temp, int beg, int mid, int end){
        // variáveis auxiliares
        int i = beg;
        int j = mid+1;

        // cria cópia do vetor original
        for (int k = beg; k <= end; k++){
            temp[k] = array[k];
        }
        
        // intercalação
        for (int k = beg; k <= end; k++){
            // se acabou de ordenar a primeira metade, copia direita do vetor
            if (i > mid){
                array[k] = temp[j];
                j++;
            }

            // se acabou de ordenar a segunda metade, copia esquerda do vetor
            else if (j > end){
                array[k] = temp[i];
                i++;
            }

            // se ainda há de ser ordenado e o elemento da metade esquerda é menor do que o da metade direita, ordena
            else if (temp[i] < temp[j]){
                array[k] = temp[i];
                i++;
            }

            // se o menor elemento já for o da metade direita, prossegue
            else{
                array[k] = temp[j];
                j++;
            }
        }
    }
}
//==========//
//QUICK SORT//
//==========//

package A02Sorting;
import java.util.Random;

public class Quick {
    public static void main(String[] args) {     
        System.out.println("\n#===========#");
        System.out.println("| QUICKSORT |");
        System.out.println("#===========#\n");
        
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
        
        //=====QUICKSORT=====
            // variaveis auxiliares
            int beg = 0;
            int end = array.length-1;

            // chama metodo
            quicksort(array, beg, end);
        //=====QUICKSORT=====
        
        // imprime o vetor ordenado
        System.out.println("Vetor ordenado apos o sort:");
        System.out.println("*-------------------------------------------------*");
        for (int i = 0; i < array.length; i++){
            System.out.print("| " + array[i] + " ");
        }
        System.out.println("|");
        System.out.println("*-------------------------------------------------*\n");
    }
    
    public static void quicksort(int[] array, int beg, int end){
        // variaveis auxiliares
        int i = beg;
        int j = end;
        int mid = (int) (beg+end)/2;
        int pivot = array[mid];

        // realiza quicksort enquanto os opostos NAO se atravessam
        while (i <= j){
            // i++ enquanto NAO achar elemento MAIOR que o pivô a ESQUERDA
            while (array[i] < pivot) i++;
            // j-- enquanto NAO achar elemento MENOR que o pivô a DIREITA
            while (array[j] > pivot) j--;

            // confere novamente se os opostos ainda nao se atravessaram
            if (i <= j){
                // realiza swap
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                
                // acrescimo e decremento
                i++;
                j--;
            }
        }

        // confere se lado ESQUERDO do pivô esta ORDENADO, caso NAO, chama o metodo recursivamente
        if (j > beg) quicksort(array, beg, j);
        // confere se lado DIREITO do pivô esta ordenado, caso NAO, chama o metodo recursivamente
        if (end > i) quicksort(array, i, end);
    }
}
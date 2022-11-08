package A03Sorting;
import java.util.Random;

public class Quick {
    public static void main(String[] args) {     
        System.out.println("\n#===========#");
        System.out.println("| QUICKSORT |");
        System.out.println("#===========#\n");
        
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
        
        //=====QUICKSORT=====
            // variáveis auxiliares
            int beg = 0;
            int end = array.length-1;

            // chama método
            quicksort(array, beg, end);
        //=====QUICKSORT=====
        
        // imprime o vetor ordenado
        System.out.println("Vetor ordenado após o sort:");
        System.out.println("*-------------------------------------------------*");
        for (int i = 0; i < array.length; i++){
            System.out.print("| " + array[i] + " ");
        }
        System.out.println("|");
        System.out.println("*-------------------------------------------------*\n");
    }
    
    public static void quicksort(int[] array, int beg, int end){
        // variáveis auxiliares
        int i = beg;
        int j = end;
        int mid = (int) (beg+end)/2;
        int pivot = array[mid];

        // realiza quicksort enquanto os opostos NÃO se atravessam
        while (i <= j){
            // i++ enquanto NÃO achar elemento MAIOR que o pivô À ESQUERDA
            while (array[i] < pivot) i++;
            // j-- enquanto NÃO achar elemento MENOR que o pivô À DIREITA
            while (array[j] > pivot) j--;

            // confere novamente se os opostos ainda não se atravessaram
            if (i <= j){
                // realiza swap
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                
                // acréscimo e decremento
                i++;
                j--;
            }
        }

        // confere se lado ESQUERDO do pivô está ORDENADO, caso NÃO, chama o método recursivamente
        if (j > beg) quicksort(array, beg, j);
        // confere se lado DIREITO do pivô está ordenado, caso NÃO, chama o método recursivamente
        if (end > i) quicksort(array, i, end);
    }
}
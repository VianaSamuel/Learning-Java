package A03Sorting;
import java.util.Random;

public class Heap {
    public static void main(String[] args) {     
        System.out.println("\n#==========#");
        System.out.println("| HEAPSORT |");
        System.out.println("#==========#\n");
        
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
        
        //=====HEAPSORT=====
            // variáveis auxiliares
            int n = array.length;
            
            // PRIMEIRO HEAPIFY
            for (int i = (n/2)-1; i >= 0; i--){
                heapify(array, n, i);
            }
            
            // imprime primeira ordenação
            System.out.println("Vetor quase ordenado (primeira ordenação):");
            System.out.println("*-------------------------------------------------*");
            for (int i = 0; i < array.length; i++){
                System.out.print("| " + array[i] + " ");
            }
            System.out.println("|");
            System.out.println("*-------------------------------------------------*\n");

            // SEGUNDO HEAPIFY
            for (int i = n-1; i > 0; i--){
                int aux = array[0];
                array[0] = array[i];
                array[i] = aux;

                heapify(array, i, 0);
            }
        //=====HEAPSORT=====
        
        // imprime o vetor ordenado
        System.out.println("Vetor ordenado após o sort:");
        System.out.println("*-------------------------------------------------*");
        for (int i = 0; i < array.length; i++){
            System.out.print("| " + array[i] + " ");
        }
        System.out.println("|");
        System.out.println("*-------------------------------------------------*\n");
    }
    
    public static void heapify(int[] array, int n, int i){
        // define raíz, esquerda e direita dos nós
        int root = i;
        int left = (2*i) + 1;
        int right = (2*i) + 2;

        // se nó esquerdo é maior do que a raíz, então os troca
        if ((left < n) && (array[left] > array[root])) root = left;
        // se nó direito é maior do que a raíz, então os troca
        if ((right < n) && (array[right] > array[root])) root = right;

        // se houve trocas, então realiza o swap e chama o método recursivo 
        if (root != i){
            // função swap
            int aux = array[root];
            array[root] = array[i];
            array[i] = aux;

            // método recursivo com NOVA RAÍZ (trocada)
            heapify(array, n, root);
        }
    }
}
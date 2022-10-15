package A02Sorting;
import java.util.Random;

public class Heap {
    public static void main(String[] args) {     
        System.out.println("\n#----------#");
        System.out.println("| HEAPSORT |");
        System.out.println("#----------#");
        
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
        
        //=====HEAPSORT=====
            // variáveis auxiliares
            int n = array.length;
            
            // PRIMEIRO HEAPIFY
            for (int i = (n/2)-1; i >= 0; i--){
                heapify(array, n, i);
            }
            
            // imprime primeira ordenação
            System.out.println("#-----------------------#");
            System.out.println("| PRIMEIRA ORDENAÇÃO... |");
            System.out.println("#-----------------------#");
            System.out.println("Vetor quase ordenado:");
            for (int i = 0; i < array.length; i++){
                System.out.print("| " + array[i] + " ");
            }
            System.out.println("|\n");

            // SEGUNDO HEAPIFY
            for (int i = n-1; i > 0; i--){
                int aux = array[0];
                array[0] = array[i];
                array[i] = aux;

                heapify(array, i, 0);
            }
        //=====HEAPSORT=====
        
        // imprime vetor ordenado
        System.out.println("#---------------------#");
        System.out.println("| HEAPSORT REALIZADO! |");
        System.out.println("#---------------------#");
        System.out.println("Vetor ordenado:");
        for (int i = 0; i < array.length; i++){
            System.out.print("| " + array[i] + " ");
        }
        System.out.println("|\n");
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
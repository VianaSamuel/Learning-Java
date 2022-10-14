package A02Sorting;
import java.util.Random;

public class Selection {
    public static void main(String[] args) {     
        System.out.println("\n#----------------#");
        System.out.println("| SELECTION SORT |");
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

        //=====SELECTION SORT=====
            // variáveis auxiliares
            int min_idx, aux;

            // controlador
            for (int i = 0; i < array.length-1; i++){
                // define esquerda como mínimo
                min_idx = i;

                // comparador
                for (int j = i+1; j < array.length; j++){
                    if (array[j] < array[min_idx]) min_idx = j;
                }

                // função swap (troca a esquerda com o novo menor número)
                aux = array[i];
                array[i] = array[min_idx];
                array[min_idx] = aux;
            }
        //=====SELECTION SORT=====
        
        // imprime vetor ordenado
        System.out.println("#---------------------------#");
        System.out.println("| SELECTION SORT REALIZADO! |");
        System.out.println("#---------------------------#");
        System.out.println("Vetor ordenado:");
        for (int i = 0; i < array.length; i++){
            System.out.print("| " + array[i] + " ");
        }
        System.out.println("|\n");
    }
}
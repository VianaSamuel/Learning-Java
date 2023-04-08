//=======================//
//INSERCAO POR REFERENCIA//
//=======================//
package ArvoresBinarias.Arvore;
import java.util.Random;

public class Run {
    public static void main(String[] args) {
        int[] array = new int[12];
        Random random = new Random();
        Arvore tree = new Arvore();
        
        for (int i: array){
            array[i] = random.nextInt(90) + 10;
            tree.insert(array[i]);
        }

        tree.printTree();
        tree.printPreOrder();
        tree.printPostOrder();
        tree.printInOrder();
    }
}
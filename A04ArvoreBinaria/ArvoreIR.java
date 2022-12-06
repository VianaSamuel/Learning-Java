//=======================//
//INSERCAO POR REFERENCIA//
//=======================//
package A04ArvoreBinaria;
import java.util.Random;

public class ArvoreIR extends Arvore{
    public static void main(String[] args) {
        int[] array = new int[12];
        Random random = new Random();
        ArvoreIP tree = new ArvoreIP();
        
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

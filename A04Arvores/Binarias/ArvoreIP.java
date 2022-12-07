//============================//
//INSERCAO POR PASSAGEM DE PAI//
//============================//
package A04Arvores.Binarias;
import java.util.Random;

public class ArvoreIP extends Arvore{
    public static void main(String[] args) {
        int[] array = new int[12];
        Random random = new Random();
        ArvoreIP tree = new ArvoreIP();
        
        for (int i: array){
            array[i] = random.nextInt(90) + 10;
            tree.insertFather(array[i]);
        }

        tree.printTree();
        tree.printPreOrder();
        tree.printPostOrder();
        tree.printInOrder();
    }
}

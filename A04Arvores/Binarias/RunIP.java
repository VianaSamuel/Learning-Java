//============================//
//INSERCAO POR PASSAGEM DE PAI//
//============================//
package A04Arvores.Binarias;
import java.util.Random;

public class RunIP extends ArvoreIP{
    public static void main(String[] args) {
        int[] array = new int[12];
        Random random = new Random();
        RunIP tree = new RunIP();
        
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
//============================//
//INSERCAO POR PASSAGEM DE PAI//
//============================//
package ArvoresBinarias.Arvore;
import java.util.Random;

public class RunIP {
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
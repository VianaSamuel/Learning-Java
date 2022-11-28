//============================//
//INSERCAO POR PASSAGEM DE PAI//
//============================//
package A04ArvoreBinaria;
import java.util.Random;

public class ArvoreIP extends Arvore{
    //=====INSERCAO POR PASSAGEM DE PAI=====
        public void insert(int value){
            if (root == null){
                root = new Node(value);
            } else if (value < root.value){
                insert(value, root.left, root);
            } else if (value > root.value){
                insert(value, root.right, root);
            }
        }

        public void insert(int value, Node side, Node parent){
            if (side == null){
                if (value < parent.value){
                    parent.left = new Node(value);
                } else if (value > parent.value){
                    parent.right = new Node(value);
                }
            }
            else if (value < side.value){
                insert(value, side.left, side);
            }
            else if (value > side.value){
                insert(value, side.right, side);
            }
        }
    //=====INSERCAO POR PASSAGEM DE PAI=====

    public static void main(String[] args) {
        Random random = new Random();
        ArvoreIP tree = new ArvoreIP();
        
        for (int i = 0; i < 12; i++){
            tree.insert(random.nextInt(90) + 10);
        }

        tree.printTree();
        tree.printSorted();
    }
}

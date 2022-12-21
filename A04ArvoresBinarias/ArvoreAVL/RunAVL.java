//================//
//AVL (balanceada)//
//================//
package A04ArvoresBinarias.ArvoreAVL;

public class RunAVL {
    public static void main(String[] args) {
        ArvoreAVL tree = new ArvoreAVL();
        int array[] = {4,35,10,13,3,30,15,12,7,40,20};

        for(int i: array){
            System.out.println("==============");
            System.out.println("INSERINDO (" + i + ")");
            System.out.println("==============");
            tree.insertAVL(i);
            tree.AVLOrder();
            System.out.println();
        }

        tree.printTree();
        tree.printPreOrder();
        tree.printPostOrder();
        tree.printInOrder();
    }
}

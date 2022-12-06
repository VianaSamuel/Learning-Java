package A04ArvoreBinaria;

public class ArvoreAVL extends Arvore {
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
    }
}

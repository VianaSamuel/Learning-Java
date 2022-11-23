//=====================//
//ÁRVORE & MÉTODO PRINT//
//=====================//

package A04ArvoreBinaria;

public class Arvore {
    // cria o node raíz
    Node root;
    
    // quando a árvore for criada, inicializa a raíz como nula
    public Arvore(){
        this.root = null;
    }

    //=====PRINTA ELEMENTOS ORDENADOS=====//
        public String printSorted(){
            return "[" + printSorted(root) + "]";
        }

        public String printSorted(Node node){
            // cria string de retorno
            String temp = "";

            // se node for nulo, não retorna nada
            if (node == null) return "";

            // CAMINHAMENTO CENTRAL
            temp += printSorted(node.left);
            temp += " " + node.value + " ";
            temp += printSorted(node.right);

            return temp;
        }
    //=====PRINTA ELEMENTOS ORDENADOS=====//

    //=====PRINTA ÁRVORE=====//
        public void printTree(){
            System.out.println("      │");
            printTree(root, 0);
        }

        public void printTree(Node node, int height){
            // se node for nulo, interrompe
            if (node == null) return;

            // printa o nível e espaço
            System.out.print("(" + height + ")" + "   ");

            // printa o elemento
            System.out.print("├");
            for (int i = 0; i < height; i++){
                System.out.print("*─");
            }
            System.out.println(node.value);

            // printa o espaçamento extra
            System.out.println("      │");

            // CAMINHAMENTO
            printTree(node.right, height+1);
            printTree(node.left, height+1);
        }
    //=====PRINTA ÁRVORE=====//
}
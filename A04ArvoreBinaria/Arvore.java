//================//
//ARVORE & METODOS//
//================//
package A04ArvoreBinaria;

public class Arvore {
    // cria o node raiz
    Node root;
    
    // quando a arvore for criada, inicializa a raiz como nula
    public Arvore(){
        this.root = null;
    }

    //=====PESQUISA=====//
        boolean search(int x){
            return search(x, root);
        }

        boolean search(int x, Node node){
            // inicializa o resultado
            boolean result = false;

            // se o NODE estiver VAZIO, retorna FALSE
            if (node == null) result = false;
            // senão, se o PROCURADO for IGUAL o node, retorna TRUE
            else if (x == node.value) result = true;

            // senão, se o PROCURADO for MENOR que o node, chama PESQUISA a ESQUERDA
            else if (x < node.value) result = search(x, node.left);
            // senão, se o PROCURADO for MAIOR que o node, chama PESQUISA a DIREITA
            else if (x > node.value) result = search(x, node.right);

            // retorna o resultado
            return result;
        }
    //=====PESQUISA=====//
    
    //=====PRINTA ARVORE=====//
        public void printTree(){
            System.out.println("#--------#");
            System.out.println("| ARVORE |");
            System.out.println("#--------#");
            System.out.println("│        │");
            printTree(root, 0);
            System.out.println("#--------#");
        }

        public void printTree(Node node, int height){
            // se node for nulo, interrompe
            if (node == null) return;

            // printa o nivel e espaco
            System.out.print("│   (" + height + ")" + "  ");

            // printa o elemento
            System.out.print("├");
            for (int i = 0; i < height; i++){
                System.out.print("*─");
            }
            System.out.println(node.value);

            // printa o espacamento extra
            System.out.println("│        │");

            // CAMINHAMENTO
            printTree(node.right, height+1);
            printTree(node.left, height+1);
        }
    //=====PRINTA ARVORE=====//

    //=====PRINTA ELEMENTOS ORDENADOS=====//
        public void printSorted(){
            String sorted = printSortedString();
            System.out.println("#----------------------#");
            System.out.println("| ELEMENTOS ORDENADOS: |    " + sorted);
            System.out.println("#----------------------#");
        }

        public String printSortedString(){
            return "[" + printSortedString(root) + "]";
        }

        public String printSortedString(Node node){
            // cria string de retorno
            String temp = "";

            // se node for nulo, nao retorna nada
            if (node == null) return "";

            // CAMINHAMENTO CENTRAL
            temp += printSortedString(node.left);
            temp += " " + node.value + " ";
            temp += printSortedString(node.right);
            return temp;
        }
    //=====PRINTA ELEMENTOS ORDENADOS=====//
}
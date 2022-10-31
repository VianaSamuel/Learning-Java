package A03ArvoreBinaria;
import java.util.Random;

// INSERÇÃO POR REFERÊNCIA
public class ArvoreIR {
    // cria o nó raíz
    Node root;
    
    // quando a árvore for criada, inicializa a raíz como nula
    public ArvoreIR(){
        this.root = null;
    }

    //=====INSERIR POR REFERÊNCIA=====
        // inicializa o percurso da árvore utilizando a raíz
        public void insert(int value){
            root = insert(value, root);
        }

        // percorre toda a árvore, adiciona a última folha, e depois volta toda a árvore
        public Node insert(int value, Node parent){
            // se nó estiver vazio, adiciona a folha
            if (parent == null){
                parent = new Node(value);
            }
            
            // se o valor for menor do que o pai, chama método à esquerda
            else if (value < parent.value){
                parent.left = insert(value, parent.left);
            }
            // se o valor for maior do que o pai, chama método à direita
            else if (value > parent.value){
                parent.right = insert(value, parent.right);
            }

            // retorna o pai
            return parent;
        }
    //=====INSERIR POR REFERÊNCIA=====

    // imprime árvore
    public String printSorted(){
        return "[" + printSorted(root) + "]";
    }
    private String printSorted(Node node){
        String temp = "";

        if (node == null) return "";

        temp += printSorted(node.left);
        temp += " " + node.value + " ";
        temp += printSorted(node.right);

        return temp;
    }

    public void printTree(){
        printTree(root, 0);
    }
    private void printTree(Node node, int height){
        if (node == null) return;
        
        System.out.print("├");
        for (int i = 0; i < height; i++){
            System.out.print("*─");
        }
        System.out.println(node.value);
        
        printTree(node.right, height+1);
        printTree(node.left, height+1);
    }

    public static void main(String[] args) {
        ArvoreIR tree = new ArvoreIR();

        Random random = new Random();
        
        for (int i = 0; i < 12; i++){
            tree.insert(random.nextInt(89) + 10);
        }

        tree.printTree();
    }
}

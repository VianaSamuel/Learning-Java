//=======================//
//INSERÇÃO POR REFERÊNCIA//
//=======================//

package A04ArvoreBinaria;
import java.util.Random;

public class ArvoreIR extends Arvore{
    
    //=====INSERÇÃO POR REFERÊNCIA=====
        // inicializa o percurso da árvore utilizando a raíz
        public void insert(int value){
            root = insert(value, root);
        }

        // percorre toda a árvore, adiciona a última folha, e depois volta toda a árvore
        public Node insert(int value, Node parent){
            // se node estiver vazio, adiciona a folha
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
    //=====INSERÇÃO POR REFERÊNCIA=====

    public static void main(String[] args) {
        Random random = new Random();
        ArvoreIR tree = new ArvoreIR();
        
        for (int i = 0; i < 12; i++){
            tree.insert(random.nextInt(89) + 10);
        }

        tree.printSorted();
        tree.printTree();
    }
}

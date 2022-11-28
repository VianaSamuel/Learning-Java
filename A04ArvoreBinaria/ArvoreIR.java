//=======================//
//INSERCAO POR REFERENCIA//
//=======================//
package A04ArvoreBinaria;
import java.util.Random;

public class ArvoreIR extends Arvore{
    //=====INSERCAO POR REFERENCIA=====
        // inicializa o percurso da arvore utilizando a raiz
        public void insert(int value){
            root = insert(value, root);
        }

        // percorre toda a arvore, adiciona a ultima folha, e depois volta toda a arvore
        public Node insert(int value, Node parent){
            // se node estiver vazio, adiciona a folha
            if (parent == null){
                parent = new Node(value);
            }
            
            // se o valor for menor do que o pai, chama metodo a esquerda
            else if (value < parent.value){
                parent.left = insert(value, parent.left);
            }
            // se o valor for maior do que o pai, chama metodo a direita
            else if (value > parent.value){
                parent.right = insert(value, parent.right);
            }

            // retorna o pai
            return parent;
        }
    //=====INSERCAO POR REFERENCIA=====

    public static void main(String[] args) {
        Random random = new Random();
        ArvoreIR tree = new ArvoreIR();
        
        for (int i = 0; i < 12; i++){
            tree.insert(random.nextInt(90) + 10);
        }

        tree.printTree();
        tree.printSorted();
    }
}

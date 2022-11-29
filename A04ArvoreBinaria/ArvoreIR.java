//=======================//
//INSERCAO POR REFERENCIA//
//=======================//
package A04ArvoreBinaria;
import java.util.Random;

public class ArvoreIR extends Arvore{
    //=====INSERCAO POR REFERENCIA=====
        // inicializa o percurso da arvore
        public void insert(int value){
            root = insert(value, root);
        }

        // PERCORRE toda a arvore -> ADICIONA a ultima folha -> VOLTA toda a arvore
        public Node insert(int value, Node node){
            // se NODE estiver VAZIO, ADICIONA a folha
            if (node == null){
                node = new Node(value);
            }
            
            // senão, se o valor for MENOR do que o PAI, chama METODO a ESQUERDA
            else if (value < node.value){
                node.left = insert(value, node.left);
            }
            // senão, se o valor for MAIOR do que o PAI, chama METODO a DIREITA
            else if (value > node.value){
                node.right = insert(value, node.right);
            }

            // retorna o ENDEREÇO
            return node;
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

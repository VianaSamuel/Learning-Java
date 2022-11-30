//=======================//
//INSERCAO POR REFERENCIA//
//=======================//
package A04ArvoreBinaria;
import java.util.Random;

public class ArvoreIR extends Arvore{
    //=====INSERCAO POR REFERENCIA=====
        public void insert(int value){
            root = insert(value, root);
        }

        // PERCORRE toda a arvore -> ADICIONA a ultima folha -> VOLTA toda a arvore
        public Node insert(int value, Node node){
            // se NODE estiver VAZIO, ADICIONA a folha
            if (node == null) node = new Node(value);
            
            // senão, se o valor for MENOR do que o PAI, caminha pra ESQUERDA
            else if (value < node.value) node.left = insert(value, node.left);
            // senão, se o valor for MAIOR do que o PAI, caminha pra DIREITA
            else if (value > node.value) node.right = insert(value, node.right);

            // retorna o ENDEREÇO
            return node;
        }
    //=====INSERCAO POR REFERENCIA=====

    public static void main(String[] args) {
        int[] num = new int[12];
        Random random = new Random();
        ArvoreIP tree = new ArvoreIP();
        
        for (int i = 0; i < 12; i++){
            num[i] = random.nextInt(90) + 10;
            tree.insert(num[i]);
        }

        tree.printTree();
        tree.printInOrder();
    }
}

package ArvoresBinarias.Arvore;
import ArvoresBinarias.Node;

public class ArvoreIP extends Arvore {
    //=====INSERCAO POR PASSAGEM DE PAI=====//
        public void insertFather(int value){
            // se RAIZ estiver VAZIA, ADICIONA o elemento
            if (root == null) root = new Node(value);

            // senao, se o valor for MENOR do que a RAIZ, caminha pra ESQUERDA
            else if (value < root.value) insertFather(value, root, root.left);
            // senao, se o valor for MAIOR do que a RAIZ, caminha pra DIREITA
            else if (value > root.value) insertFather(value, root, root.right);
        }
        
        public void insertFather(int value, Node parent, Node son){
            // se o FILHO estiver VAZIO
            if (son == null){
                // se o valor for MENOR do que o PAI, ADICIONA a ESQUERDA
                if (value < parent.value) parent.left = new Node(value);
                // se o valor for MAIOR do que o PAI, ADICIONA a DIREITA
                else if (value > parent.value) parent.right = new Node(value);
            }
            
            // senao, se o valor for MENOR do que o FILHO, caminha pra ESQUERDA
            else if (value < son.value) insertFather(value, son, son.left);
            // senao, se o valor for MAIOR do que o FILHO, caminha pra DIREITA
            else if (value > son.value) insertFather(value, son, son.right);
        }
    //=====INSERCAO POR PASSAGEM DE PAI=====//
}

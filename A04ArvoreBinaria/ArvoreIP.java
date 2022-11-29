//============================//
//INSERCAO POR PASSAGEM DE PAI//
//============================//
package A04ArvoreBinaria;
import java.util.Random;

public class ArvoreIP extends Arvore{
    //=====INSERCAO POR PASSAGEM DE PAI=====
        public void insert(int value){
            // se RAIZ estiver NULA, ADICIONA o elemento
            if (root == null){
                root = new Node(value);
            }
            
            // senão, se o valor for MENOR do que a RAIZ, chama METODO a ESQUERDA
            else if (value < root.value){
                insert(value, root, root.left);
            }
            // senão, se o valor for MAIOR do que a RAIZ, chama METODO a DIREITA
            else if (value > root.value){
                insert(value, root, root.right);
            }
        }

        public void insert(int value, Node parent, Node son){
            // se o FILHO estiver VAZIO
            if (son == null){
                // se o valor for MENOR do que o FILHO, ADICIONA a ESQUERDA
                if (value < parent.value){
                    parent.left = new Node(value);
                }
                // se o valor for MAIOR do que o FILHO, ADICIONA a DIREITA
                else if (value > parent.value){
                    parent.right = new Node(value);
                }
            }

            // senão, se o valor for MENOR do que o FILHO, chama METODO a ESQUERDA
            else if (value < son.value){
                insert(value, son, son.left);
            }
            // senão, se o valor for MAIOR do que o FILHO, chama METODO a DIREITA
            else if (value > son.value){
                insert(value, son, son.right);
            }
        }
    //=====INSERCAO POR PASSAGEM DE PAI=====

    public static void main(String[] args) {
        Random random = new Random();
        ArvoreIP tree = new ArvoreIP();
        
        for (int i = 0; i < 12; i++){
            tree.insert(random.nextInt(90) + 10);
        }

        tree.printTree();
        tree.printSorted();
    }
}

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
            
            // senão, se o valor for MENOR do que a RAIZ, chama INSERT a ESQUERDA
            else if (value < root.value){
                insert(value, root, root.left);
            }
            // senão, se o valor for MAIOR do que a RAIZ, chama INSERT a DIREITA
            else if (value > root.value){
                insert(value, root, root.right);
            }
        }

        public void insert(int value, Node parent, Node son){
            // se o FILHO estiver VAZIO
            if (son == null){
                // se o valor for MENOR do que o PAI, ADICIONA a ESQUERDA
                if (value < parent.value){
                    parent.left = new Node(value);
                }
                // se o valor for MAIOR do que o PAI, ADICIONA a DIREITA
                else if (value > parent.value){
                    parent.right = new Node(value);
                }
            }

            // senão, se o valor for MENOR do que o FILHO, chama INSERT a ESQUERDA
            else if (value < son.value){
                insert(value, son, son.left);
            }
            // senão, se o valor for MAIOR do que o FILHO, chama INSERT a DIREITA
            else if (value > son.value){
                insert(value, son, son.right);
            }
        }
    //=====INSERCAO POR PASSAGEM DE PAI=====

    public static void main(String[] args) {
        int[] num = new int[12];
        Random random = new Random();
        ArvoreIP tree = new ArvoreIP();
        
        for (int i = 0; i < 12; i++){
            num[i] = random.nextInt(90) + 10;
            tree.insert(num[i]);
        }

        tree.printTree();
        tree.printSorted();
    }
}

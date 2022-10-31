package A03ArvoreBinaria;

// INSERÇÃO POR PASSAGEM DE PAI
public class ArvoreIP {
    // cria o nó raíz-base
    Node root;
    
    // quando a árvore for criada, inicializa a raíz-base como nula
    public ArvoreIP(){
        this.root = null;
    }

    //=====INSERIR POR PASSAGEM DE PAI=====
        public void insertParent(int value){
            if (root == null){
                root = new Node(value);
            } else if (value < root.value){
                insertParent(value, root.left, root);
            } else if (value > root.value){
                insertParent(value, root.right, root);
            }
        }

        public void insertParent(int value, Node side, Node parent){
            if (side == null){
                if (value < parent.value){
                    parent.left = new Node(value);
                } else if (value > parent.value){
                    parent.right = new Node(value);
                }
            }
            else if (value < side.value){
                insertParent(value, side.left, side);
            }
            else if (value > side.value){
                insertParent(value, side.right, side);
            }
        }
    //=====INSERIR POR PASSAGEM DE PAI=====

    public static void main(String[] args) {
        System.out.println("");
    }
}
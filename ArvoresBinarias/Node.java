//====//
//NODE//
//====//
package ArvoresBinarias;

public class Node{
    public int value;          // elemento
    public int level;          // altura
    public Node left, right;   // filhos

    public Node(int value){
        this(value, 1, null, null);
    }
    public Node(int value, int level, Node left, Node right){
        this.value = value;
        this.level = level;
        this.left = left;
        this.right = right;
    }

    //=====ALTURA=====//
        public void setLevel(){
            // recalcula o numero de niveis
            this.level = 1 + Math.max(getLevel(left), getLevel(right));
        }

        public static int getLevel(Node node){
            // se node for nulo, retorna 0
            // caso contrário, retorna o nivel do node
            return (node == null) ? 0 : node.level;
        }
    //=====ALTURA=====//
}
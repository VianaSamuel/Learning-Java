//====//
//NODE//
//====//
package A04Arvores.Binarias;

class Node{
    // cria elemento e laterais
    int value;
    int level;
    Node left, right;

    // CONSTRUTOR: se recebe APENAS valor, inicializa laterais como NULAS
    Node(int value){
        this(value, 1, null, null);
    }
    // CONSTRUTOR: se recebe valor E laterais, inicializa laterais recebidas
    Node(int value, int level, Node left, Node right){
        this.value = value;
        this.level = level;
        this.left = left;
        this.right = right;
    }

    public void setLevel(){
        // recalcula numero de niveis
        this.level = 1 + Math.max(getLevel(left), getLevel(right));
    }
    public static int getLevel(Node node){
        // se node for nulo, retorna 0
        // caso contrário, retorna o nivel do node
        return (node == null) ? 0 : node.level;
    }
}
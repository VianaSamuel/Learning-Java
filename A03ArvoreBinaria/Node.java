package A03ArvoreBinaria;

class Node{
    // cria elemento e laterais
    int value;
    Node left;
    Node right;

    // se recebe APENAS valor, inicializa laterais como NULAS
    Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
    // se recebe valor E laterais, inicializa laterais recebidas
    Node (int value, Node left, Node right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
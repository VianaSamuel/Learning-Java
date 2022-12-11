package A02EstruturasDeDados.Flexivel;

public class Node {
    // cria node e proximo node
    private int value;
    private Node next;

    // construtor
    public Node(int newValue){
        this.value = newValue;
    }

    // getters e setters
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next = next;
    }
}

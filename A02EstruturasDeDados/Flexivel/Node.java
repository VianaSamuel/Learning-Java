package A02EstruturasDeDados.Flexivel;

public class Node {
    private int value;      // valor
    private Node next;      // proximo node

    // construtor
    public Node(int newValue){
        this.value = newValue;
    }

    //=====GETTERS & SETTERS=====//
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
    //=====GETTERS & SETTERS=====//
}

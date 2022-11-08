package A02EstruturaDeDados.Flexivel;

public class ZNode {
    // cria nó e próximo nó
    private int value;
    private ZNode next;

    // construtor
    public ZNode(int newValue){
        this.value = newValue;
    }

    // getters e setters
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
    public ZNode getNext(){
        return next;
    }
    public void setNext(ZNode next){
        this.next = next;
    }
}

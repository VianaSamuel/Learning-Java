package A02EstruturasDeDados.Flexivel;

public class Pilha {
    // cria o node-topo
    private Node top;
    private int size;
    
    // inicializa o tamanho como 0 e o topo como nulo 
    public Pilha(){
        size = 0;
        top = null;
    }

    //=====GETTERS & SETTERS=====//
        public Node getTop() {
            return top;
        }
        public void setTop(Node top) {
            this.top = top;
        }
        public int getSize() {
            return size;
        }
        public void setSize(int size) {
            this.size = size;
        }
    //=====GETTERS & SETTERS=====//

    //=====METODOS=====//
        public void add(int x){
            Node temp = new Node(x);

            temp.setNext(top);
            top = temp;

            size++;
            temp = null;
        }

        public int remove(){
            int removed = top.getValue();

            Node temp = top;
            top = top.getNext();
            temp.setNext(null);

            size--;
            temp = null;
            return removed;
        }

        public Node get(int pos){
            // inicializa o percurso
            Node current = top;

            for (int i = 0; i < pos; i++){
                current = current.getNext();
            }

            // retorna o ultimo node
            return current;
        }

        public void show(){
            System.out.print("[ ");
            for (Node i = top; i != null; i = i.getNext()){
                System.out.print(i.getValue() + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    //=====METODOS=====//
}

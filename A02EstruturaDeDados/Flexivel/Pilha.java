package A02EstruturaDeDados.Flexivel;

public class Pilha {
    // cria o node-topo
    private ZNode top;
    private int size;
    
    // inicializa o tamanho como 0 e o topo como nulo 
    public Pilha(){
        size = 0;
        top = null;
    }

    //=====GETTERS & SETTERS=====//
        public ZNode getTop() {
            return top;
        }
        public void setTop(ZNode top) {
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
            ZNode temp = new ZNode(x);

            temp.setNext(top);
            top = temp;

            size++;
            temp = null;
        }

        public int remove(){
            int removed = top.getValue();

            ZNode temp = top;
            top = top.getNext();
            temp.setNext(null);

            size--;
            temp = null;
            return removed;
        }

        public ZNode get(int pos){
            // inicializa o percurso
            ZNode current = top;

            for (int i = 0; i < pos; i++){
                current = current.getNext();
            }

            // retorna o ultimo node
            return current;
        }

        public void show(){
            System.out.print("[ ");
            for (ZNode i = top; i != null; i = i.getNext()){
                System.out.print(i.getValue() + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    //=====METODOS=====//
}

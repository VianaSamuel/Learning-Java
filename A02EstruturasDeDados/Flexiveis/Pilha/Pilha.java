//==============//
//PILHA FLEXIVEL//
//==============//
//METODOS: add -> remove -> get -> search -> show

package A02EstruturasDeDados.Flexiveis.Pilha;
import A02EstruturasDeDados.Flexiveis.Node;

public class Pilha {
    private Node first;     // primeiro node
    private int size;       // tamanho da estrutura
    
    public Pilha(){
        size = 0;
        first = null;
    }

    //=====GETTERS & SETTERS=====//
        public Node getFirst() {
            return first;
        }
        public void setFirst(Node first) {
            this.first = first;
        }
        public int getSize() {
            return size;
        }
        public void setSize(int size) {
            this.size = size;
        }
    //=====GETTERS & SETTERS=====//

    //=====ADD=====//
        public void add(int x){
            // cria o novo node com o valor do input
            Node temp = new Node(x);

            // DIREITA do NOVO NODE aponta pro PRIMEIRO NODE
            temp.setNext(first);
            // NOVO NODE se torna o NOVO PRIMEIRO NODE
            first = temp;

            size++;
            temp = null;
        }
    //=====ADD=====//
    //=====REMOVE=====//
        public int remove(){
            // guarda o valor removido
            int removed = first.getValue();

            // TEMPORARIO: aponta pro primeiro node
            Node temp = first;
            // PRIMEIRO NODE "torna-se" o node a sua DIREITA
            first = first.getNext();
            // TEMPORARIO: apaga o ponteiro da DIREITA
            temp.setNext(null);

            size--;
            temp = null;
            return removed;
        }
    //=====REMOVE=====//
    //=====GET=====//
        public Node get(int pos){
            // inicializa o percurso
            Node i = first;

            // caminha ate a posicao desejada se o proximo node nao estiver vazio
            for (int k = 0; k < pos; k++){
                if (i.getNext() != null){
                    i = i.getNext();
                }
            }
            return i;
        }
    //=====GET=====//
    //=====SEARCH=====//
        public boolean search(int x){
            // inicializa o retorno
            boolean result = false;

            // percorre a estrutura
            for (Node i = first; i != null || result == false; i = i.getNext()){
                // se achar o valor buscado
                if (i.getValue() == x){
                    result = true;
                }
            }
            return result;
        }
    //=====SEARCH=====//
    //=====SHOW=====//
        public void show(){
            System.out.print("[ ");

            // caminha enquanto nao achar um ponteiro nulo
            for (Node i = first; i != null; i = i.getNext()){
                System.out.print(i.getValue() + " ");
            }

            System.out.print("]");
            System.out.println();
        }

        public void showMain(){
            System.out.print("Pilha: ");
            this.show();
            System.out.println("Tamanho: " + this.getSize());
            System.out.println();
        }
    //=====SHOW=====//
}

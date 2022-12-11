package A02EstruturasDeDados.Flexivel;

public class Lista {
    // o first sera SEMPRE um NODE CABECA de valor IRRELEVANTE //
    // o PRIMEIRO ELEMENTO sera SEMPRE first.getNext() //

    private Node first, last;      // nodes -> primeiro e ultimo
    private int size;               // tamanho da estrutura

    public Lista(){
        size = 0;
        first = last = new Node(0);
    }

    //=====GETTERS & SETTERS=====//
        public Node getFirst(){
            return first;
        }
        public void setFirst(Node first){
            this.first = first;
        }
        public Node getLast(){
            return last;
        }
        public void setLast(Node last){
            this.last = last;
        }
        public int getSize(){
            return size;
        }
        public void setSize(int size){
            this.size = size;
        }
    //=====GETTERS & SETTERS=====//

    //=====METODOS=====//
        public void add(int x, int pos){
            // se a posicao for 0, convoca o metodo de adicionar no INICIO
            if (pos == 0) addStart(x);
            // se a posicao for (tamanho + 1), convoca o metodo de adicionar no FIM
            else if (pos == size) addEnd(x);

            // para outras posicoes
            else {
                // inicializa o percurso
                Node previous = first;

                // percorre a estrutura ate chegar ao ANTERIOR do NODE DESEJADO
                for (int i = 0; i < pos; i++) previous = previous.getNext();

                // cria node com o valor do input
                Node temp = new Node(x);

                // 
                temp.setNext(previous.getNext());
                previous.setNext(temp);

                size++;
                temp = null;
                previous = null;
            }
        }

        public void addStart(int x){
            // cria node com o valor do input
            Node temp = new Node(x);

            // atualiza o PROXIMO DO NOVO NODE como o ANTIGO PRIMEIRO NODE
            temp.setNext(first.getNext());
            // atualiza o PRIMEIRO NODE como o NOVO NODE
            first.setNext(temp);

            // se a estrutura estiver vazia, atualiza tambem o ULTIMO NODE como o NOVO NODE
            if (isEmpty()){
                last = temp;
            }

            // incrementa o tamanho, libera o node temporario
            size++;
            temp = null;
        }
    
        public void addEnd(int x){
            // cria node com o valor do input
            Node temp = new Node(x);

            // atualiza o PROXIMO DO ULTIMO NODE como o NOVO NODE
            last.setNext(temp);
            // atualiza o ULTIMO NODE como o NOVO NODE
            last = temp;

            // incrementa o tamanho
            size++;
        }

        public int remove(int pos){
            // inicializa o retorno
            int removed = 0;

            if (pos == 0) removed = removeStart();
            else if (pos == size-1) removed = removeEnd();
            else {
                // inicializa o percurso
                Node previous = first;

                // percorre ate o node ANTERIOR ao BUSCADO
                for (int i = 0; i < pos; i++) previous = previous.getNext();

                // aponta o PROXIMO NODE do ANTERIOR como o BUSCADO e guarda o seu valor
                Node searched = previous.getNext();
                removed = searched.getValue();

                // REAPONTA o espaco a ser removido como o PROXIMO do BUSCADO
                previous.setNext(searched.getNext());

                // APAGA o 
                searched.setNext(null);
                previous = null;
                searched = null;
            }

            size--;
            return removed;
        }

        public int removeEnd(){
            // inicializa o node temporario
            Node temp;

            // percorre a estrutura ate chegar ao ANTERIOR DO ULTIMO NODE
            for (temp = first; temp.getNext() != last; temp = temp.getNext());

            // guarda o valor removido
            int removed = last.getValue();

            // aponta o PENULTIMO NODE como o (NOVO) ULTIMO NODE
            last = temp;

            // apaga o ULTIMO NODE
            last.setNext(null);

            // libera o node temporario e retorna o valor apagado
            temp = null;
            size--;
            return removed;
        }
    
        public int removeStart(){
            // inicializa o NODE TEMPORARIO como o NODE CABECA  
            Node temp = first;

            // aponta o PRIMEIRO NODE e GUARDA O SEU VALOR
            first = first.getNext();
            int removed = first.getValue();

            // libera o PRIMEIRO NODE e o temporario
            temp.setNext(null);

            // libera o node temporario e retorna o valor apagado
            temp = null;
            size--;
            return removed;
        }
    
        public Node get(int pos){
            // inicializa o percurso
            Node current = first.getNext();

            // enquanto o proximo node nao estiver vazio, percorre
            for (int i = 0; i < pos; i++){
                if (current.getNext() != null){
                    current = current.getNext();
                }
            }

            // retorna o ultimo node
            return current;
        }

        public void show(){
            System.out.print("[ ");
            for (Node i = first.getNext(); i != null; i = i.getNext()){
                System.out.print(i.getValue() + " ");
            }
            System.out.print("]");
            System.out.println();
        }

        public boolean isEmpty(){
            // se o NODE CABECA for igual o ULTIMO NODE (nulo/vazio), entao a estrutura esta VAZIA
            if (first == last) return true;
            else return false;
        }
    //=====METODOS=====//
}

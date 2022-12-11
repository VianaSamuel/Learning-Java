package A02EstruturasDeDados.Flexivel;

public class Lista {
    // o first sera SEMPRE um NODE CABECA de valor IRRELEVANTE //
    // o PRIMEIRO ELEMENTO sera SEMPRE first.getNext() //

    private Node first, last;       // nodes -> primeiro e ultimo
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

    //=====ADD=====//
        //-----ADD-----//
        public void add(int x, int pos){
            // se a posicao for 0, convoca o metodo de adicionar no INICIO
            if (pos == 0) addStart(x);
            // senao, se a posicao for igual ao TAMANHO DA ESTRUTURA, convoca o metodo de adicionar no FIM
            else if (pos == size) addEnd(x);

            // para outras posicoes
            else {
                // inicializa o percurso
                Node previous = first;

                // percorre ate o NODE ANTERIOR da POSICAO DESEJADA
                for (int i = 0; i < pos; i++) previous = previous.getNext();

                // cria o novo node com o valor do input
                Node temp = new Node(x);

                // "costura" DIREITA do NOVO NODE
                temp.setNext(previous.getNext());
                // "costura" DIREITA do NODE ANTERIOR
                previous.setNext(temp);

                size++;
                temp = null;
                previous = null;
            }
        }

        //-----ADD START-----//
        public void addStart(int x){
            // cria o novo node com o valor do input
            Node temp = new Node(x);

            // "costura" DIREITA do NOVO NODE com o ANTIGO PRIMEIRO NODE
            temp.setNext(first.getNext());
            // atualiza o PRIMEIRO NODE como o NOVO NODE
            first.setNext(temp);

            // se a estrutura estiver VAZIA (node cabeca == ultimo), atualiza tambem o ULTIMO NODE como o NOVO NODE
            if (first == last){
                last = temp;
            }

            size++;
            temp = null;
        }

        //-----ADD END-----//
        public void addEnd(int x){
            // cria o novo node com o valor do input
            Node temp = new Node(x);

            // atualiza a DIREITA do ULTIMO NODE como o NOVO NODE
            last.setNext(temp);
            // atualiza o ULTIMO NODE como o NOVO NODE
            last = temp;

            size++;
        }
    //=====ADD=====//
    //=====REMOVE=====//
        //-----REMOVE-----//
        public int remove(int pos){
            // inicializa o retorno
            int removed = 0;
        
            // se a posicao for 0, convoca o metodo de remover o INICIO
            if (pos == 0) removed = removeStart();
            // senao, se a posicao for igual ao TAMANHO DA ESTRUTURA, convoca o metodo de adicionar no FIM
            else if (pos == size-1) removed = removeEnd();

            // para outras posicoes
            else {
                // inicializa o percurso
                Node previous = first;
            
                // percorre ate o NODE ANTERIOR da POSICAO DESEJADA
                for (int i = 0; i < pos; i++) previous = previous.getNext();
            
                // aponta pro node desejado (DIREITA do ANTERIOR) e salva o seu valor
                Node searched = previous.getNext();
                removed = searched.getValue();
            
                // "costura" o ESPACO a ser REMOVIDO
                previous.setNext(searched.getNext());
            
                // DESVINCULA o node desejado (remove a direita)
                searched.setNext(null);
                previous = null;
                searched = null;
            }
        
            size--;
            return removed;
        }

        //-----REMOVE START-----//
        public int removeStart(){
            // inicializa o NODE TEMPORARIO como o NODE CABECA  
            Node temp = first;

            // aponta pro node desejado (PRIMEIRO) e salva o seu valor
            first = first.getNext();
            int removed = first.getValue();

            // DESVINCULA o primeiro node
            temp.setNext(null);

            size--;
            temp = null;
            return removed;
        }

        //-----REMOVE END-----//
        public int removeEnd(){
            // inicializa o node temporario
            Node i;

            // percorre ate o NODE ANTERIOR ao ULTIMO NODE
            for (i = first; i.getNext() != last; i = i.getNext());
            // guarda o valor a ser removido
            int removed = last.getValue();

            // aponta o PENULTIMO NODE como o (NOVO) ULTIMO NODE
            last = i;
            // apaga o ULTIMO NODE
            last.setNext(null);

            size--;
            i = null;
            return removed;
        }
    //=====REMOVE=====//
    //=====GET=====//
        public Node get(int pos){
            // inicializa o percurso
            Node i = first.getNext();

            // caminha ate a posicao desejada se o proximo node nao estiver vazio
            for (int k = 0; k < pos; k++){
                if (i.getNext() != null) i = i.getNext();
            }

            // retorna o ultimo node
            return i;
        }
    //=====GET=====//
    //=====SHOW=====//
        public void show(){
            System.out.print("[ ");

            // caminha enquanto nao achar um ponteiro nulo
            for (Node i = first.getNext(); i != null; i = i.getNext()){
                System.out.print(i.getValue() + " ");
            }

            System.out.print("]");
            System.out.println();
        }
    //=====SHOW=====//
}
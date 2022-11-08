package A02EstruturaDeDados.Flexivel;

public class Lista {
    // o first será SEMPRE um NÓ CABEÇA de valor IRRELEVANTE //
    // o PRIMEIRO ELEMENTO será SEMPRE first.getNext() //

    // cria primeiro nó, último nó, tamanho da estrutura
    private ZNode first, last;
    private int size;

    // inicializa o tamanho, cabeça e último nó como 0
    public Lista(){
        size = 0;
        first = last = new ZNode(0);
    }

    //=====GETTERS & SETTERS=====//
        public ZNode getFirst(){
            return first;
        }
        public void setFirst(ZNode first){
            this.first = first;
        }
        public ZNode getLast(){
            return last;
        }
        public void setLast(ZNode last){
            this.last = last;
        }
        public int getSize(){
            return size;
        }
        public void setSize(int size){
            this.size = size;
        }
    //=====GETTERS & SETTERS=====//

    //=====MÉTODOS=====//
        public void add(int x, int pos){
            // se a posição for 0, convoca o método de adicionar no INÍCIO
            if (pos == 0) addStart(x);
            // se a posição for (tamanho + 1), convoca o método de adicionar no FIM
            else if (pos == size) addEnd(x);

            // para outras posições
            else {
                // inicializa o percurso
                ZNode previous = first;

                // percorre a estrutura até chegar ao ANTERIOR do NÓ DESEJADO
                for (int i = 0; i < pos; i++) previous = previous.getNext();

                // cria nó com o valor do input
                ZNode temp = new ZNode(x);

                // 
                temp.setNext(previous.getNext());
                previous.setNext(temp);

                size++;
                temp = null;
                previous = null;
            }
        }

        public void addStart(int x){
            // cria nó com o valor do input
            ZNode temp = new ZNode(x);

            // atualiza o PRÓXIMO DO NOVO NÓ como o ANTIGO PRIMEIRO NÓ
            temp.setNext(first.getNext());
            // atualiza o PRIMEIRO NÓ como o NOVO NÓ
            first.setNext(temp);

            // se a estrutura estiver vazia, atualiza também o ÚLTIMO NÓ como o NOVO NÓ
            if (isEmpty()){
                last = temp;
            }

            // incrementa o tamanho, libera o nó temporário
            size++;
            temp = null;
        }
    
        public void addEnd(int x){
            // cria nó com o valor do input
            ZNode temp = new ZNode(x);

            // atualiza o PRÓXIMO DO ÚLTIMO NÓ como o NOVO NÓ
            last.setNext(temp);
            // atualiza o ÚLTIMO NÓ como o NOVO NÓ
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
                ZNode previous = first;

                // percorre até o nó ANTERIOR ao BUSCADO
                for (int i = 0; i < pos; i++) previous = previous.getNext();

                // aponta o PRÓXIMO NÓ do ANTERIOR como o BUSCADO e guarda o seu valor
                ZNode searched = previous.getNext();
                removed = searched.getValue();

                // REAPONTA o espaço a ser removido como o PRÓXIMO do BUSCADO
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
            // inicializa o nó temporário
            ZNode temp;

            // percorre a estrutura até chegar ao ANTERIOR DO ÚLTIMO NÓ
            for (temp = first; temp.getNext() != last; temp = temp.getNext());

            // guarda o valor removido
            int removed = last.getValue();

            // aponta o PENÚLTIMO NÓ como o (NOVO) ÚLTIMO NÓ
            last = temp;

            // apaga o ÚLTIMO NÓ
            last.setNext(null);

            // libera o nó temporário e retorna o valor apagado
            temp = null;
            size--;
            return removed;
        }
    
        public int removeStart(){
            // inicializa o NÓ TEMPORÁRIO como o NÓ CABEÇA  
            ZNode temp = first;

            // aponta o PRIMEIRO NÓ e GUARDA O SEU VALOR
            first = first.getNext();
            int removed = first.getValue();

            // libera o PRIMEIRO NÓ e o temporário
            temp.setNext(null);

            // libera o nó temporário e retorna o valor apagado
            temp = null;
            size--;
            return removed;
        }
    
        public ZNode get(int pos){
            // inicializa o percurso
            ZNode current = first.getNext();

            // enquanto o próximo nó não estiver vazio, percorre
            for (int i = 0; i < pos; i++){
                if (current.getNext() != null){
                    current = current.getNext();
                }
            }

            // retorna o último nó
            return current;
        }

        public void show(){
            System.out.print("[ ");
            for (ZNode i = first.getNext(); i != null; i = i.getNext()){
                System.out.print(i.getValue() + " ");
            }
            System.out.print("]");
            System.out.println();
        }

        public boolean isEmpty(){
            // se o NÓ CABEÇA for igual o ÚLTIMO NÓ (nulo/vazio), então a estrutura está VAZIA
            if (first == last) return true;
            else return false;
        }
    //=====MÉTODOS=====//
}

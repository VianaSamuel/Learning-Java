//===================//
//HASH LISTA FLEXIVEL//
//===================//
// ORDEM: hash -> add -> search -> remove

package A05Hashes;

public class HashLista {
    final int EMPTY = -1;       // flag de index vazio
    Lista table[];              // tabela
    int t;                      // tamanho da tabela

    // cria a tabela
    public HashLista(){
        this(13);
    }
    // PREENCHE a tabela com LISTAS VAZIAS
    public HashLista(int t){
        this.t = t;
        this.table = new Lista[this.t];

        for (int i = 0; i < t; i++){
            table[i] = new Lista();
        }
    }

    //=====HASH=====//
        public int hash(int x){
            return x % t;
        }
    //=====HASH=====//
    //=====ADD=====//
        public void add(int x){
            // se nao existir na tabela
            if (!search(x)){
                // calcula index com o hash
                int id = hash(x);

                // convoca metodo da LISTA de ADICIONAR NO INICIO
                table[id].addStart(x);
            }
        }
    //=====ADD=====//
    //=====SEARCH=====//
        public boolean search(int x){
            // calcula index com o hash
            int id = hash(x);

            // convoca metodo da LISTA de PESQUISAR
            return table[id].search(x);
        }
    //=====SEARCH=====//
    //=====REMOVE=====//
        public void remove(int x){
            // calcula index com o hash
            int id = hash(x);

            // convoca metodo da LISTA de REMOVER
            table[id].remove(x);
        }
    //=====REMOVE=====//
}
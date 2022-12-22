//===========//
//HASH REHASH//
//===========//
// METODOS: hash -> insert -> search -> remove

package A05TabelasHash;

public class HashRehash {
    final int EMPTY = -1;       // flag de index vazio
    int table[];                // tabela
    int t;                      // tamanho da tabela

    // cria a tabela
    public HashRehash(){
        this(13);
    }
    // PREENCHE a tabela com indices VAZIOS
    public HashRehash(int t){
        this.t = t;
        this.table = new int[this.t];

        for (int i = 0; i < t; i++){
            table[i] = EMPTY;
        }
    }

    //=====HASH=====//
        public int hash(int x){
            return x % t;
        }
        public int rehash(int x){
            return ++x % t;
        }
    //=====HASH=====//
    //=====INSERT=====//
        public boolean insert(int x){
            boolean result = false;

            if (x != EMPTY){
                // calcula index com o hash
                int id = hash(x);

                // INSERE DIRETO na tabela se o index dela estiver VAZIO
                if (table[id] == EMPTY){
                    table[id] = x;
                    result = true;
                }

                // senao, realiza o REHASH e o adiciona se indice estiver VAZIO
                else {
                    id = rehash(x);
                    if (table[id] == EMPTY){
                        table[id] = x;
                        result = true;
                    }
                }
            }

            return result;
        }
    //=====INSERT=====//
    //=====SEARCH=====//
        public int search(int x){
            int result = EMPTY;
        
            // calcula index com o hash
            int id = hash(x);
        
            // se encontrado no PRIMEIRO HASH
            if (table[id] == x) result = id;
        
            // senao, busca no REHASH
            else if (table[id] != EMPTY){
                id = rehash(x);
                
                // se encontrado no REHASH
                if (table[id] == x){
                    result = id;
                }
            }
        
            // retorna o INDICE
            return result;
        }
    //=====SEARCH=====//
    //=====REMOVE=====//
        public boolean remove(int x){
            boolean result = false;
        
            // realiza a PESQUISA
            int id = search(x);
        
            // se o elemento EXISTIR nas tabelas, o REMOVE
            if (id != EMPTY){
                table[id] = EMPTY;
            }
        
            return result;
        }
    //=====REMOVE=====//
}

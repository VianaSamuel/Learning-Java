//============//
//HASH RESERVA//
//============//
// ORDEM: hash -> insert -> search -> remove

package A05Hashes;

public class HashReserva {
    final int EMPTY = -1;       // flag de index vazio
    int table[];                // tabela original
    int extra;                  // tabela reserva
    int t1, t2, total;          // tamanhos e total das tabelas

    // cria as tabelas ORIGINAL e RESERVA
    public HashReserva(){
        this(13, 7);
    }
    // SOMA O TOTAL e PREENCHE a tabela ORIGINAL com indices VAZIOS
    public HashReserva(int t1, int t2){
        extra = 0;
        this.t1 = t1;
        this.t2 = t2;
        this.total = t1 + t2;
        this.table = new int[total];

        for(int i = 0; i < t1; i++){
            table[i] = EMPTY;
        }
    }
    
    //=====HASH=====//
        public int hash(int x){
            return x % 7;
        }
    //=====HASH=====//
    //=====INSERT=====//
        public boolean insert(int x){
            boolean result = false;
            
            if (x != EMPTY){
                // calcula index com o hash
                int id = hash(x);

                // INSERE NA ORIGINAL se o index da tabela estiver VAZIO
                if (table[id] == EMPTY){
                    table[id] = x;
                    result = true;
                }

                // senao, INSERE NA RESERVA se a QUANTIA DE ITENS nela for MENOR QUE SEU TAMANHO
                else if (extra < t2){
                    table[t1 + extra] = x;
                    extra++;
                    result = true;
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

            // se ENCONTRADO na tabela ORIGINAL
            if (table[id] == x) result = id;

            // senao, busca na tabela RESERVA
            else if (table[id] != EMPTY){
                // caminha pelos ITENS da RESERVA
                for (int i = 0; i < extra; i++){
                    // se ENCONTRADO na tabela RESERVA
                    if (table[t1 + i] == x){
                        result = t1 + i;
                        i = extra;
                    }
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

//==========//
//ARVORE AVL//
//==========//
//ORDEM: insercao -> remocao -> balanceamento -> rotacoes -> caminhamento

package A04Arvores.Binarias;

public class ArvoreAVL extends Arvore {
    //=====INSERCAO AVL=====//
        public void insertAVL(int value){
            root = insertAVL(value, root);
        }
        public Node insertAVL(int value, Node node){
            if (node == null) node = new Node(value);
            else if (value < node.value) node.left = insertAVL(value, node.left);
            else if (value > node.value) node.right = insertAVL(value, node.right);
            
            // retorna o node inserido BALANCEADO
            return balance(node);
        }
    //=====INSERCAO AVL=====//
    //=====REMOCAO AVL=====//
        void removeAVL(int x){
            root = removeAVL(x, root);
        }
        Node removeAVL(int x, Node node){
            if (node != null){
                if (x < node.value) node.left = removeAVL(x, node.left);
                else if (x > node.value) node.right = removeAVL(x, node.right);

                else if (node.right == null) node = node.left;
                else if (node.left == null) node = node.right;

                else node.left = largestLeft(node, node.left);
            }
            // retorna o node removido BALANCEADO
            return balance(node);
        }

        Node largestLeft(Node parent, Node son){
            // se NODE DIREITO do filho estiver VAZIO
            if (son.right == null){
                // ATUALIZA o valor do PAI
                parent.value = son.value;
                // "COSTURA" o NODE ESQUERDO do filho
                son = son.left;
            }

            // senão, caminha pra DIREITA
            else son.right = largestLeft(parent, son.right);

            // retorna o FILHO
            return son;
        }
    //=====REMOCAO AVL=====//
    //=====BALANCEAMENTO=====//
    public Node balance(Node node){
        if (node != null){
            // fator de balanceamento
            int factor = Node.getLevel(node.right) - Node.getLevel(node.left);
            // se JA BALANCEADA (modulo de fator),  INCREMENTA ALTURA
            if (Math.abs(factor) <= 1) node.setLevel();

            // se desbalanceada pra DIREITA
            else if (factor == 2){
                // define FILHO e seu FATOR
                Node son = node.right;
                int factorSon = Node.getLevel(son.right) - Node.getLevel(son.left);
                
                // "JOELHO DIREITA"
                // SE o filho da DIREITA tambem estiver DESBALANCEADO
                // rotaciona DIREITA
                if (factorSon == -1) node.right = singleRight(son);

                // rotacao ESQUERDA
                node = singleLeft(node);
            }

            // se desbalanceada pra ESQUERDA
            else if (factor == -2){
                // define FILHO e seu FATOR
                Node son = node.left;
                int factorSon = Node.getLevel(son.right) - Node.getLevel(son.left);

                // "JOELHO ESQUERDA"
                // SE o filho da ESQUERDA tambem estiver DESBALANCEADO
                // rotaciona ESQUERDA
                if (factorSon == 1) node.left = singleLeft(son);

                // rotacao DIREITA
                node = singleRight(node);
            }
        }
        return node;
    }
    //=====BALANCEAMENTO=====//
    //=====ROTACOES=====//
        // -> rotacao ANTI-HORARIA, desbalanceamento POSITIVO (RETA & DIREITA)
        Node singleLeft(Node grand){
            System.out.println("---> Rotacionando ESQUERDA (" + grand.value + ")");

            //node PAI (DESBALANCEADO) a ser ESCALADO
            Node father = grand.right;
            //node FILHO a ser REALOCADO
            Node son = father.left;

            //ESCALA o node PAI
            father.left = grand;
            //REALOCA o node FILHO
            grand.right = son;

            //atualiza os niveis dos nodes
            grand.setLevel();
            father.setLevel();

            //retorna o node BALANCEADO
            return father;
        }

        // -> rotacao HORARIA, desbalanceamento NEGATIVO (RETA & ESQUERDA)
        Node singleRight(Node grand){
            System.out.println("---> Rotacionando DIREITA (" + grand.value + ")");

            //node PAI (DESBALANCEADO) a ser ESCALADO
            Node father = grand.left;
            //node FILHO a ser REALOCADO
            Node son = father.right;

            //ESCALA o node PAI
            father.right = grand;
            //REALOCA o node FILHO
            grand.left = son;

            //atualiza os niveis dos nodes
            grand.setLevel();
            father.setLevel();

            //retorna o node BALANCEADO
            return father;
        }
    //=====ROTACOES=====//
    //=====CAMINHAMENTO AVL=====//
        void AVLOrder(){
            AVLOrder(root);
        }
        void AVLOrder(Node node){
            if (node != null){
                System.out.println(node.value + " FATOR [" + (Node.getLevel(node.right) - Node.getLevel(node.left)) + "]");
                AVLOrder(node.left);
                AVLOrder(node.right);
            }
        }
    //=====CAMINHAMENTO AVL=====//
}

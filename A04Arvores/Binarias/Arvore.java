//================//
//ARVORE & METODOS//
//================//

//ORDEM: insercoes -> remocao -> pesquisa -> balanceamento -> rotacoes -> caminhamentos -> prints

package A04Arvores.Binarias;

public class Arvore {
    // cria o node raiz
    Node root;
    
    // quando a arvore for criada, inicializa a raiz como nula
    public Arvore(){
        this.root = null;
    }

    //=====INSERCOES=====//
        //-----REFERENCIA-----//
            public void insert(int value){
                root = insert(value, root);
            }

            // PERCORRE toda a arvore -> ADICIONA a ultima folha -> VOLTA toda a arvore
            public Node insert(int value, Node node){
                // se NODE estiver VAZIO, ADICIONA a folha
                if (node == null) node = new Node(value);

                // senão, se o valor for MENOR do que o PAI, caminha pra ESQUERDA
                else if (value < node.value) node.left = insert(value, node.left);
                // senão, se o valor for MAIOR do que o PAI, caminha pra DIREITA
                else if (value > node.value) node.right = insert(value, node.right);

                // retorna o ENDEREÇO
                return node;
            }
        //-----REFERENCIA-----//
        //-----AVL-----//
            public void insertAVL(int value){
                root = insertAVL(value, root);
            }

            public Node insertAVL(int value, Node node){
                if (node == null) node = new Node(value);

                else if (value < node.value) node.left = insertAVL(value, node.left);
                else if (value > node.value) node.right = insertAVL(value, node.right);

                // retorna o node BALANCEADO
                return balance(node);
            }
        //-----AVL-----//
        //-----PASSAGEM DE PAI-----//
            public void insertFather(int value){
                // se RAIZ estiver NULA, ADICIONA o elemento
                if (root == null) root = new Node(value);

                // senão, se o valor for MENOR do que a RAIZ, caminha pra ESQUERDA
                else if (value < root.value) insertFather(value, root, root.left);
                // senão, se o valor for MAIOR do que a RAIZ, caminha pra DIREITA
                else if (value > root.value) insertFather(value, root, root.right);
            }

            public void insertFather(int value, Node parent, Node son){
                // se o FILHO estiver VAZIO
                if (son == null){
                    // se o valor for MENOR do que o PAI, ADICIONA a ESQUERDA
                    if (value < parent.value) parent.left = new Node(value);

                    // se o valor for MAIOR do que o PAI, ADICIONA a DIREITA
                    else if (value > parent.value) parent.right = new Node(value);
                }

                // senão, se o valor for MENOR do que o FILHO, caminha pra ESQUERDA
                else if (value < son.value) insertFather(value, son, son.left);
                // senão, se o valor for MAIOR do que o FILHO, caminha pra DIREITA
                else if (value > son.value) insertFather(value, son, son.right);
            }
        //-----PASSAGEM DE PAI-----//
    //=====INSERCOES=====//
    //=====REMOCAO=====//
        void remove(int x){
            root = remove(x, root);
        }
        Node remove(int x, Node node){
            // se NODE estiver VAZIO, retorna ERRO
            if (node == null)System.out.println("Erro!");

            // senão, se o PROCURADO for MENOR do que o NODE, caminha pra ESQUERDA
            else if (x < node.value) node.left = remove(x, node.left);
            // senão, se o PROCURADO for MAIOR do que o NODE, caminha pra DIREITA
            else if (x > node.value) node.right = remove(x, node.right);

            // !!! a partir daqui, o elemento foi ENCONTRADO !!! //

            // se o NODE DIREITO estiver VAZIO, "COSTURA" o NODE da ESQUERDA
            else if (node.right == null) node = node.left;
            // se o NODE ESQUERDO estiver VAZIO, "COSTURA" o NODE da DIREITA
            else if (node.left == null) node = node.right;

            // se NENHUM estiver VAZIO, APONTA pro MAIOR ELEMENTO da ESQUERDA
            else node.left = largestLeft(node, node.left);

            // retorna o node
            return node;
        }

        void removeAVL(int x){
            root = removeAVL(x, root);
        }
        Node removeAVL(int x, Node node){
            if (node == null)System.out.println("Erro!");

            else if (x < node.value) node.left = removeAVL(x, node.left);
            else if (x > node.value) node.right = removeAVL(x, node.right);

            else if (node.right == null) node = node.left;
            else if (node.left == null) node = node.right;

            else node.left = largestLeft(node, node.left);

            // retorna o node BALANCEADO
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
    //=====REMOCAO=====//
    //=====PESQUISA=====//
        boolean search(int x){
            return search(x, root);
        }

        boolean search(int x, Node node){
            // inicializa o resultado
            boolean result = false;

            // se o NODE estiver VAZIO, retorna FALSE
            if (node == null) result = false;
            // senão, se o PROCURADO for IGUAL o NODE, retorna TRUE
            else if (x == node.value) result = true;

            // senão, se o PROCURADO for MENOR que o NODE, caminha pra ESQUERDA
            else if (x < node.value) result = search(x, node.left);
            // senão, se o PROCURADO for MAIOR que o NODE, caminha pra DIREITA
            else if (x > node.value) result = search(x, node.right);

            // retorna o resultado
            return result;
        }
    //=====PESQUISA=====//
    //=====BALANCEAMENTO=====//
        public Node balance(Node node){
            if (node != null){
                // fator de balanceamento
                int factor = Node.getLevel(node.right) - Node.getLevel(node.left);

                // se ja balanceada (modulo de fator)
                if (Math.abs(factor) <= 1) node.setLevel();

                // se desbalanceada pra DIREITA (POSITIVAMENTE)
                else if (factor == 2){
                    // define FILHO e seu FATOR
                    Node son = node.right;
                    int factorSon = Node.getLevel(son.right) - Node.getLevel(son.left);

                    // se o filho da DIREITA tambem estiver DESBALANCEADO
                    if (factorSon == -1) node.right = singleRight(son);

                    // rotacao ESQUERDA
                    node = singleLeft(node);
                }

                // se desbalanceada pra ESQUERDA (NEGATIVAMENTE)
                else if (factor == -2){
                    // define FILHO e seu FATOR
                    Node son = node.left;
                    int factorSon = Node.getLevel(son.right) - Node.getLevel(son.left);

                    // se o filho da ESQUERDA tambem estiver DESBALANCEADO
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
    //=====CAMINHAMENTOS=====//
        //-----CENTRAL-----//
        // da ESQUERDA para a DIREITA, eh ORDENDADO
        void inOrder(Node node){
            if (node != null){
                inOrder(node.left);
                System.out.print(node.value + " ");
                inOrder(node.right);
            }
        }
        void inOrder(){
            inOrder(root);
        }
            
        //-----PRE-----//
        // primeiro os NODES (cima para baixo), depois as PONTAS
        void preOrder(Node node){
            if (node != null){
                System.out.print(node.value + " ");
                preOrder(node.left);
                preOrder(node.right);
            }
        }
        void preOrder(){
            preOrder(root);
        }

        //-----POS-----//
        // primeiro as PONTAS (baixo para cima), depois os NODES
        void postOrder(Node node){
            if (node != null){
                postOrder(node.left);
                postOrder(node.right);
                System.out.print(node.value + " ");
            }
        }
        void postOrder(){
            postOrder(root);
        }

        //-----AVL-----//
        void AVLOrder(Node node){
            if (node != null){
                System.out.println(node.value + " FATOR [" + (Node.getLevel(node.right) - Node.getLevel(node.left)) + "]");
                AVLOrder(node.left);
                AVLOrder(node.right);
            }
        }
        void AVLOrder(){
            AVLOrder(root);
        }
    //=====CAMINHAMENTOS=====//
    //=====PRINTS=====//
        //-----PRINTA ARVORE-----//
        public void printTree(){
            System.out.println("#--------#");
            System.out.println("| ARVORE |");
            System.out.println("#--------#");
            System.out.println("│        │");
            printTree(root, 0);
            System.out.println("#--------#");
        }

        public void printTree(Node node, int height){
            // se node for nulo, interrompe
            if (node == null) return;

            // printa o nivel e espaco
            System.out.print("│   (" + height + ")" + "  ");

            // printa o elemento
            System.out.print("├");
            for (int i = 0; i < height; i++){
                System.out.print("*─");
            }
            System.out.println(node.value);

            // printa o espacamento extra
            System.out.println("│        │");

            // CAMINHAMENTO
            printTree(node.right, height+1);
            printTree(node.left, height+1);
        }
        //-----PRINTA ARVORE-----//
        //-----PRINTA CAMINHAMENTOS-----//
        public void printInOrder(){
            System.out.println("#-----------------------#");
            System.out.print("| CAMINHAMENTO CENTRAL: |     [ " );
            inOrder();
            System.out.println("]\n#-----------------------#");
        }
        public void printPreOrder(){
            System.out.println("#-------------------#");
            System.out.print("| CAMINHAMENTO PRE: |     [ " );
            preOrder();
            System.out.println("]\n#-------------------#");
        }
        public void printPostOrder(){
            System.out.println("#-------------------#");
            System.out.print(  "| CAMINHAMENTO POS: |     [ " );
            postOrder();
            System.out.println("]\n#-------------------#");
        }
        //-----PRINTA CAMINHAMENTOS-----//
    //=====PRINTS=====//
}
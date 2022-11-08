package A02EstruturaDeDados.Flexivel;

public class RunPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.add(2);
        pilha.add(3);
        pilha.add(4);

        pilha.show();

        pilha.remove();

        pilha.show();

        
        int tam = pilha.getSize();
        System.out.println("TAMANHO " + tam);
        System.out.println();

        for (int i = 0; i < tam; i++){
            System.out.println(pilha.get(i).getValue());
        }
    }
}

package A02EstruturasDeDados.Flexivel;

public class RunLista {
    public static void main(String[] args) {        
        Lista ligada = new Lista();
        
        ligada.addStart(3);
        ligada.addStart(4);
        ligada.addEnd(5);
        ligada.addEnd(6);

        
        ligada.show();
        int tam = ligada.getSize();
        System.out.println("TAMANHO " + tam);

        ligada.remove(1);
        
        ligada.show();
        tam = ligada.getSize();
        System.out.println("TAMANHO " + tam);

        ligada.addStart(2);
        ligada.addStart(3);
        
        ligada.show();
        tam = ligada.getSize();
        System.out.println("TAMANHO " + tam);

        ligada.removeEnd();
        ligada.removeEnd();

        ligada.show();
        tam = ligada.getSize();
        System.out.println("TAMANHO " + tam);

        ligada.add(6, 3);
        ligada.add(6, 0);
        ligada.add(10, 2);
        
        ligada.show();
        tam = ligada.getSize();
        System.out.println("TAMANHO " + tam);
        System.out.println();

        for (int i = 0; i < tam; i++){
            System.out.print(ligada.get(i).getValue() + " | ");
        }
    }
}

package EstruturasDeDados.Flexiveis.Lista;
import java.util.Random;

public class Run {
    public static void main(String[] args) {        
        // criacao da lista
        Lista lista = new Lista();

        // criacao do array de preenchimento
        int[] array = new int[10];
    
        // preenchimento do array com numeros aleatorios de 10 a 99
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (new Random().nextInt(90) + 10);
        }

        // primeira adicao
        addLabel();
        for (int i = 0; i < 5; i++){
            lista.addStart(array[i]);
        }
        lista.showMain();

        // primeira remocao
        int pos = new Random().nextInt(6);
        removeLabel(pos);
        lista.remove(pos);
        lista.showMain();

        // segunda adicao
        addLabel();
        for (int i = 0; i < 3; i++){
            lista.addStart(array[i]);
        }
        lista.showMain();
        
        // segunda remocao
        pos = new Random().nextInt(6);
        removeLabel(pos);
        lista.remove(pos);
        lista.showMain();
    }

    public static void addLabel(){
        System.out.println("-----------");
        System.out.println("ADICIONANDO");
        System.out.println("-----------");
    }
    public static void removeLabel(int pos){
        System.out.println("---------------------");
        System.out.println("REMOVENDO POSICAO (" + pos + ")");
        System.out.println("---------------------");
    }
}

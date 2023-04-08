package EstruturasDeDados.Flexiveis.Pilha;
import java.util.Random;

public class Run {
    public static void main(String[] args) {
        // criacao da pilha
        Pilha pilha = new Pilha();

        // criacao do array de preenchimento
        int[] array = new int[10];
    
        // preenchimento do array com numeros aleatorios de 10 a 99
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (new Random().nextInt(90) + 10);
        }

        // primeira adicao
        addLabel();
        for (int i = 0; i < 5; i++){
            pilha.add(array[i]);
        }
        pilha.showMain();

        // primeira remocao
        removeLabel();
        pilha.remove();
        pilha.showMain();

        // segunda adicao
        addLabel();
        for (int i = 0; i < 3; i++){
            pilha.add(array[i]);
        }
        pilha.showMain();
        
        // segunda remocao
        removeLabel();
        pilha.remove();
        pilha.showMain();
    }

    public static void addLabel(){
        System.out.println("-----------");
        System.out.println("ADICIONANDO");
        System.out.println("-----------");
    }
    public static void removeLabel(){
        System.out.println("---------");
        System.out.println("REMOVENDO");
        System.out.println("---------");
    }
}

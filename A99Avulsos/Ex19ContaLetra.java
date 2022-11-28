package A99Avulsos;

import java.util.Scanner;

public class Ex19ContaLetra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite a palavra: ");
        String palavra = input.next();

        System.out.printf("Digite a letra a ser contada: ");
        char letra = input.next().charAt(0);

        System.out.println();

        int cont = 0;
        for (int i = 0; i < palavra.length(); i++){
            if (palavra.charAt(i) == letra){
                cont++;
            }
        }

        System.out.println("Numero de ocorrencias da letra '" + letra + "': " + cont);
        
        input.close();
    }
}

package L99ExerciciosAvulsos;

import java.util.Scanner;

public class Ex20CaracteresMaiusculas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite a palavra: ");
        String palavra = input.next();

        int cont = 0;
        for (int i = 0; i < palavra.length(); i++){
            if (Character.isUpperCase(palavra.charAt(i))){
                cont++;
            }
        }

        System.out.println("Quantidade de caracteres: " + palavra.length());
        System.out.println("Quantidade de maiúsculas: " + cont);

        input.close();
    }
}

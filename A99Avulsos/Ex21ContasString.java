package A99Avulsos;

import java.util.Scanner;

public class Ex21ContasString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite a palavra: ");
        String palavra = input.next();
        System.out.println();

        int let = 0, nlet = 0, vog = 0, con = 0;

        for (int i = 0; i < palavra.length(); i++){
            if (Character.isAlphabetic(palavra.charAt(i))){
                let++;
            } else {
                nlet++;
            }

            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A' ||
                palavra.charAt(i) == 'e' || palavra.charAt(i) == 'E' ||
                palavra.charAt(i) == 'i' || palavra.charAt(i) == 'I' ||
                palavra.charAt(i) == 'o' || palavra.charAt(i) == 'O' ||
                palavra.charAt(i) == 'u' || palavra.charAt(i) == 'U') {
                    vog++;
            } else {
                con++;
            }
        }

        System.out.println("Quantidade de caracteres: " + palavra.length());
        System.out.println("Quantidade de letras: " + let);
        System.out.println("Quantidade de não-letras: " + nlet);
        System.out.println("Quantidade de vogais: " + vog);
        System.out.println("Quantidade de consoantes: " + con);

        input.close();
    }
}

package L99ExerciciosAvulsos;
import java.util.Scanner;

public class Ex03Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número desejado: ");
		int numero = input.nextInt();
        System.out.println("");
		
		int um = (numero * 1);
		int dois = (numero * 2);
		int tres = (numero * 3);
		int quatro = (numero * 4);
		int cinco = (numero * 5);
		int seis = (numero * 6);
		int sete = (numero * 7);
		int oito = (numero * 8);
		int nove = (numero * 9);
		int dez = (numero * 10);
		
		System.out.println("Tabuada de " + numero + ":");
		System.out.println(um);
		System.out.println(dois);
		System.out.println(tres);
		System.out.println(quatro);
		System.out.println(cinco);
		System.out.println(seis);
		System.out.println(sete);
		System.out.println(oito);
		System.out.println(nove);
		System.out.println(dez);

        input.close();
    }
}

package L99ExerciciosAvulsos;
import java.util.Scanner;

public class Ex18Triangulos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = 0.0 , b = 0.0, c = 0.0;

        System.out.printf("Digite o lado A do triângulo: ");
        a = input.nextDouble();

        System.out.printf("Digite o lado B do triângulo: ");
        b = input.nextDouble();

        System.out.printf("Digite o lado C do triângulo: ");
        c = input.nextDouble();

        System.out.println();

        if (a == b && a == c){
            System.out.println("O triângulo é equilátero.");
        } else if (a == b && c != a || a == c && b != a || b == c && a != b) {
            System.out.println("O triângulo é isósceles.");
        } else if (a != b && a != c && b != c){
            System.out.println("O triângulo é escaleno.");
        }

        input.close();
    }
}
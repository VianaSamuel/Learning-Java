package A99Avulsos;
import java.util.Scanner;

public class Ex18Triangulos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = 0.0 , b = 0.0, c = 0.0;

        System.out.printf("Digite o lado A do triangulo: ");
        a = input.nextDouble();

        System.out.printf("Digite o lado B do triangulo: ");
        b = input.nextDouble();

        System.out.printf("Digite o lado C do triangulo: ");
        c = input.nextDouble();

        System.out.println();

        if (a == b && a == c){
            System.out.println("O triangulo é equilatero.");
        } else if (a == b && c != a || a == c && b != a || b == c && a != b) {
            System.out.println("O triangulo é isosceles.");
        } else if (a != b && a != c && b != c){
            System.out.println("O triangulo é escaleno.");
        }

        input.close();
    }
}
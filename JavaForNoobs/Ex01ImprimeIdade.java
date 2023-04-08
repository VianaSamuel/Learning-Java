package JavaForNoobs;
import java.util.Scanner;

public class Ex01ImprimeIdade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a idade: ");
        int idade = input.nextInt();
        System.out.print("A idade digitada eh: " + idade);
    
        input.close();
    }
}
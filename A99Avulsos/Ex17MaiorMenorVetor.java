package A99Avulsos;

public class Ex17MaiorMenorVetor {
    public static void main(String[] args) {
        int[] array = {5, 2, 7, 22, 154, 202, 1, 8, 4, 66};
        System.out.println("Vetor: {5, 2, 7, 22, 154, 202, 1, 8, 4, 66}");
        System.out.println();

        maiorMenor(array);
    }

    public static void maiorMenor(int[] array) {
        int maior = 0;
        int menor = 99999;

        for(int i = 0; i < array.length; i++) {
            if (array[i] > maior) maior = array[i];
            if (array[i] < menor) menor = array[i];
        }

        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
    }
}
package A99Avulsos;

public class Ex10ImprimePares {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("Números pares de 0 a 100:");
        System.out.println("-------------------------");
		for (int contador = 0; contador <= 100; contador++) {
			if (contador%2 == 0) {
				System.out.println(contador);
			}
        }
    }
}

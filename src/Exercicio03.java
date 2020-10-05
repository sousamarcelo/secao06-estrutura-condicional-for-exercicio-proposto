import java.util.Locale;
import java.util.Scanner;

/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5. */

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("quantidade de testes: ");
		int quantidadeTestes = sc.nextInt();

		for (int i = 1; i <= quantidadeTestes; i++) {
			System.out.println("Teste: " + i);
			System.out.print("Digite os tres valores: ");
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();
			double mediaPondera = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / (2 + 3 + 5);
			System.out.printf("Medio Ponderada:  %.1f", mediaPondera);
			System.out.println();

		}

		sc.close();

	}

}

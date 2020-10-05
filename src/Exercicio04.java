import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número N.Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidade = sc.nextInt();
		
		for (int i = 0; i < quantidade; i++) {
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			
			if (valor2 == 0) {
				System.out.println("divisão impossivel");
			} else {
				double divisao = (double) valor1 / valor2;
				System.out.printf("%.1f%n", divisao);
			}
			
			
		}
		
		sc.close();

	}

}

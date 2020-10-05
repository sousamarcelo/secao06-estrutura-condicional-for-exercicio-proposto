import java.util.Scanner;

/*Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas,
come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
exemplo.*/

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			int posicao1 = i;
			int posicao2 = (int)Math.pow(i, 2);
			int posicao3 = (int)Math.pow(i, 3);
			
			System.out.printf("%d %d %d%n", posicao1, posicao2, posicao3);		
		}
		
		sc.close();

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Instanciar um objeto da classe Scanner
		Scanner teclado;
		teclado = new Scanner(System.in);
		// Scanner teclado = new Scanner(System.in);
		
		//declarar variaveis
		int numero1, numero2, soma;
		
		System.out.print("Digite um número inteiro: ");
		numero1 = teclado.nextInt();
		System.out.print("Digite outro número inteiro: ");
		numero2 = teclado.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.println("Soma: " + soma);
		
		// fechar o teclado
		teclado.close();
	}

}

import java.util.Scanner;

public class ValorDiaria {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float valorDiaria, percentualDesconto, valorDiariaDesconto;
		
		System.out.println("Informe o valor da diária: ");
		valorDiaria = teclado.nextFloat();
		System.out.println();
		
		System.out.println("Informe o percentual de desconto: ");
		percentualDesconto = teclado.nextFloat();
		System.out.println();
		
		valorDiariaDesconto = valorDiaria - (valorDiaria * (percentualDesconto / 100));
		
		System.out.println("O valor da diária com desconto é: " + valorDiariaDesconto);
		teclado.close();
	}
	
	

}

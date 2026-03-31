import java.util.Scanner;

public class EstacaoDoAno {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String mes;
		
		System.out.println("Informe o mês: ");
		mes = teclado.next();
		
		switch (mes){
		case "dezembro","janeiro","fevereiro":
		System.out.println("Verão");
		break;
		case "março","abril","maio":
		System.out.println("Outono");
		break;
		case "junho","julho","agosto":
		System.out.println("Inverno");
		break;
		case "setembro","outubro","novembro":
		System.out.println("Primavera");
		break;
		default:
		System.out.println("Mês inválido!");
		break;
		}
		
		teclado.close();
	}

}

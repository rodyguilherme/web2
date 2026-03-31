import java.util.Scanner;

public class IdadeMinima {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe a sua idade: ");
		idade = teclado.nextInt();
		
		if(idade >= 18) {
			System.out.println("Acesso autorizado!");
		} else {
			System.out.println("Acesso não autorizado!");
		}
		
		teclado.close();
	}

}

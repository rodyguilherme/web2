import java.util.Scanner;

import javax.swing.JOptionPane;

public class CustoTeatral {

	public static void main(String[] args) {
		
//		float custoEspetaculo, precoConvite, quantidadeConvitesNecessario;
//		
//		custoEspetaculo = Float.parseFloat(JOptionPane.showInputDialog("Informe o custo do espetáculo teatral:"));
//		precoConvite = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço do convite: "));
//		
//		quantidadeConvitesNecessario = custoEspetaculo / precoConvite;
//		
//		JOptionPane.showMessageDialog(null, "A quantidade de ingressos que deve ser vendida para cobrir o custo do espetáculo teatral é: R$ " + quantidadeConvitesNecessario + ".");
		
		Scanner teclado = new Scanner(System.in);
		
		float custoEspetaculo, precoConvite, quantidadeConvitesNecessario;
		
		System.out.println("Informe o custo do espetáculo teatral:");
		custoEspetaculo = teclado.nextFloat();
		
		System.out.println("Informe o preço do convite: ");
		precoConvite = teclado.nextFloat();
		
		quantidadeConvitesNecessario = custoEspetaculo / precoConvite;
		
		System.out.println("A quantidade de ingressos que deve ser vendida para cobrir o custo do espetáculo teatral é: R$ " + quantidadeConvitesNecessario);
		teclado.close();
		
		
	}

}

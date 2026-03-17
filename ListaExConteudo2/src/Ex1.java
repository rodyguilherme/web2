import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		
//		Scanner teclado = new Scanner(System.in);
//		
//		float pesoSacoRacao, quantidadeDiariaRacao, quantidadeFinalRacao;
//		
//		System.out.println("Informe quantos quilos tem o saco de ração: ");
//		pesoSacoRacao = teclado.nextFloat();
//		
//		System.out.println("Informe a quantidade diária de ração em gramas: ");
//		quantidadeDiariaRacao = teclado.nextFloat();
//		
//		quantidadeFinalRacao = pesoSacoRacao - ((quantidadeDiariaRacao * 5) / 1000);
//		
//		System.out.println("A quantidade de ração que sobrou é: " + quantidadeFinalRacao);
//		teclado.close();	
//		
		float pesoSacoRacao, quantidadeDiariaRacao, quantidadeFinalRacao;
		
		pesoSacoRacao = Float.parseFloat(JOptionPane.showInputDialog("Informe quantos quilos tem o saco de ração: "));
		quantidadeDiariaRacao = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade diária de ração em gramas: "));
		
		quantidadeFinalRacao = pesoSacoRacao - ((quantidadeDiariaRacao * 5) / 1000);
		
		JOptionPane.showMessageDialog(null, "A quantidade de ração que sobrou é: " + quantidadeFinalRacao);
		
	}

}

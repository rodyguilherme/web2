import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// Instanciar um objeto da classe Random
		Random geradorDeNumeros = new Random();
		
		// Declaração de variáveis
		int face1, face2, soma, tentativas, opcao, aposta;
		boolean acertou;
		
		// Repetição do jogo
		do {
			face1 = geradorDeNumeros.nextInt(6) + 1;
			face2 = geradorDeNumeros.nextInt(6) + 1;
			
			soma = face1 + face2;
			
			tentativas = 3;
			
			// Imprimir os valores para teste
			System.out.println("Face 1: " + face1 + " - Face 2: " + face2 + " - Soma: " + soma);
			
			acertou = false;
			while(!acertou && tentativas > 0) {
				tentativas--;
				aposta = Integer.parseInt(JOptionPane.showInputDialog("Digite sua aposta: "));
				if (aposta == soma) {
					acertou = true;
				}else {
					JOptionPane.showMessageDialog(null, "Você errou! Tente novamente");
				}
			}
			if (acertou) {
				JOptionPane.showMessageDialog(null, "Parabéns! Você acertou!");
			}else {
				JOptionPane.showMessageDialog(null, "Jogo encerrado!");
			}
			opcao = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?");
		}while(opcao == 0); // Enquanto for zero, o usuário continua as tentativas.
	}
}

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Data data = new Data(1, 12, 1988);
		JOptionPane.showMessageDialog(null, data);
		data.setDia(3);
		data.setMes(12);
		data.setAno(2005);
		JOptionPane.showMessageDialog(null, data);

	}

}

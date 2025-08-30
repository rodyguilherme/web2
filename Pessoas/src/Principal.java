
public class Principal {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Rafael", 27);
		System.out.println(p1);
		p1.setNome("Rodrigo");
		p1.setIdade(25);
		System.out.println(p1);
	}

}

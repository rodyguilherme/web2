
public class BankAccount {
	
	// declaração de atributos
	private int id;
	private String clientName;
	private double balance;
	
	// construtor da classe com argumentos
	public BankAccount(int id, String clientName, double balance) {
		this.id = id;
		this.clientName = clientName;
		this.balance = balance;
	}
	
	// construtor padrão
	public BankAccount() {
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	// método para efetuar um saque
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
		}
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	
	public void displayDetails() {
		System.out.println("Dados da conta: ");
		System.out.println("Código: " + id);
		System.out.println("Nome do cliente: " + clientName);
		System.out.println("Saldo da conta: R$ " + balance);
	}
}

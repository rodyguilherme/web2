
public class Main {

	public static void main(String[] args) {
		// instanciar um objeto da classe BankAccount
		BankAccount account1 = new BankAccount(1, "Joao", 1000);
		System.out.println(account1);
		account1.displayDetails();
		account1.deposit(1000);
		System.out.println("ID: " + account1.getId());
		account1.setId(1001);
		//System.out.println("Saldo atualizado: " + account1.balance);
		account1.withdraw(1500);
		//System.out.println("Saldo atualizado: " + account1.balance);
		
		//account1.clientName = "Rodrigo";
		account1.displayDetails();
		System.out.println();
		// instanciar outro objeto da classe BankAccount
		BankAccount account2 = new BankAccount();
		System.out.println(account2);
		account2.displayDetails();
	}

}

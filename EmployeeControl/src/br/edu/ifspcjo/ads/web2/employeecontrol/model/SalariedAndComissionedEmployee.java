package br.edu.ifspcjo.ads.web2.employeecontrol.model;

public class SalariedAndComissionedEmployee extends ComissionedEmployee {
	
	private double salary;

	public SalariedAndComissionedEmployee(String name, String cpf, double salesValue, double comissionPercentage,
			double salary) {
		super(name, cpf, salesValue, comissionPercentage);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Empregado salariado e comissionado\n"
				+ "Salário: " + salary + ",\n"
				+ "Valor das vendas: " + salesValue
				+ ",\nPercentual de comissão: " + comissionPercentage
				+ ",\nNome: " + name 
				+ ",\nCPF: " + cpf + ".";
	}
	
	@Override
	public double calculateIncome() {
		return salary + super.calculateIncome();
	}
}

package br.edu.ifspcjo.ads.web2.employeecontrol.model;

public class HourlyEmployee extends Employee {
	
	private int numberOfHoursWorked;
	private double valueOfHoursWorked;
	
	
	public HourlyEmployee(String name, String cpf, int numberOfHoursWorked, double valueOfHoursWorked) {
		super(name, cpf);
		this.numberOfHoursWorked = numberOfHoursWorked;
		this.valueOfHoursWorked = valueOfHoursWorked;
	}

	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}


	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}


	public double getValueOfHoursWorked() {
		return valueOfHoursWorked;
	}


	public void setValueOfHoursWorked(double valueOfHoursWorked) {
		this.valueOfHoursWorked = valueOfHoursWorked;
	}

	@Override
	public String toString() {
		return "Horas trabalhadas: " + numberOfHoursWorked + ", Valor da hora trabalhada: " + valueOfHoursWorked + ", Nome: " + name + ", CPF: " + cpf + ".";
	}
	
	@Override
	public double calculateIncome() {
		return numberOfHoursWorked * valueOfHoursWorked;
	}

}

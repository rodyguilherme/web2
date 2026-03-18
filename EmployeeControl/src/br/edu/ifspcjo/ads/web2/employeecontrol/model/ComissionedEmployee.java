package br.edu.ifspcjo.ads.web2.employeecontrol.model;

public class ComissionedEmployee extends Employee{

	protected double salesValue;
	protected double comissionPercentage;
	
	public ComissionedEmployee(String name, String cpf, double salesValue, double comissionPercentage) {
		super(name, cpf);
		this.salesValue = salesValue;
		this.comissionPercentage = comissionPercentage;
	}

	public double getSalesValue() {
		return salesValue;
	}

	public void setSalesValue(double salesValue) {
		this.salesValue = salesValue;
	}

	public double getComissionPercentage() {
		return comissionPercentage;
	}

	public void setComissionPercentage(double comissionPercentage) {
		this.comissionPercentage = comissionPercentage;
	}

	@Override
	public String toString() {
		return "Empregado comissionado - Valor das vendas: R$ " + salesValue + ", Percentual de comissão: " + comissionPercentage
				+ " %, Nome: " + name + ", CPF: " + cpf + ".";
	}
	
	@Override
	public double calculateIncome() {
		return salesValue * comissionPercentage / 100;
	}
}

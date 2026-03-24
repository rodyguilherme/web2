package br.edu.ifspcjo.ads.web2.employeecontrol.view;

import br.edu.ifspcjo.ads.web2.employeecontrol.model.ComissionedEmployee;
import br.edu.ifspcjo.ads.web2.employeecontrol.model.Employee;
import br.edu.ifspcjo.ads.web2.employeecontrol.model.HourlyEmployee;
import br.edu.ifspcjo.ads.web2.employeecontrol.model.SalariedAndComissionedEmployee;
import br.edu.ifspcjo.ads.web2.employeecontrol.model.SalariedEmployee;

public class Main {

	public static void main(String[] args) {
		
		//Employee empregado0 = new Employee("Eliana", "9876");
		
		Employee empregado1 = new SalariedEmployee("Ana", "1234", 3000);
		System.out.println(empregado1);
		System.out.println("Rendimentos = R$ " + empregado1.calculateIncome());
		System.out.println();
		
		Employee empregado2 = new HourlyEmployee("Adriana", "5678", 40, 30);
		System.out.println(empregado2);
		System.out.println("Rendimentos: R$ " + empregado2.calculateIncome());
		System.out.println();
		
		Employee empregado3 = new ComissionedEmployee("Juliana", "8765", 50000, 5);
		System.out.println(empregado3);
		System.out.println("Rendimentos: R$ " + empregado3.calculateIncome());
		System.out.println();
		
		Employee empregado4 = new SalariedAndComissionedEmployee("Mariana", "4321", 50000, 5, 2000);
		System.out.println(empregado4);
		System.out.println("Rendimentos: R$" + empregado4.calculateIncome());
		System.out.println();
		
	}

}

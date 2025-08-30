
public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
	
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia >= 1 && dia <= 30) {
			this.dia = dia;
		} else {
			this.dia = 1;
		}
		
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
		} else {
			this.mes = 1;
		}
		
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano >= 1900) {
			this.ano = ano;
		} else {
			this.ano = 1;
		}
		
	}

	@Override
	public String toString() {
		return "Data: " + dia + "/" + mes + "/"+ ano;
	}

}

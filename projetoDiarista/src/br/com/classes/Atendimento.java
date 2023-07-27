package br.com.classes;

public class Atendimento {
	private int horas;

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		
		if (horas >= 1 && horas <=12) {
			this.horas = horas;
			System.out.println(" Parábens atendimento realizado com sucesso");
			
		} else {
			this.horas = horas;
			System.out.println(" Atendimento fora do horário comercial");

		}
		
		
	
	}
	

}

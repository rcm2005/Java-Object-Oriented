package br.com.fiap;

public class FolhaPagamento {

	public double salarioBruto, planoSaude, salarioLiquido,descontoINSS;
	public int numeroDeDependentes;
	
	public void calcularSalarioLiquido() {
		System.out.println("O valor do inss é " + ((salarioBruto *descontoINSS))/100);
		salarioLiquido = salarioBruto - (salarioBruto * descontoINSS/100);
		System.out.println("O valor do plano de saúde é " + (planoSaude * (numeroDeDependentes + 1)));
		salarioLiquido = salarioLiquido - (planoSaude * (numeroDeDependentes + 1));
		System.out.println("O salário líquido é " + salarioLiquido);
		
		

		



	
		
	
	}
	
}

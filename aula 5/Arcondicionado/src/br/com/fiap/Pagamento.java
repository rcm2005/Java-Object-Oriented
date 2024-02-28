package br.com.fiap;

public class Pagamento {

	public static void main(String[] args) {
		FolhaPagamento pagamento = new FolhaPagamento();
		pagamento.descontoINSS = 10;
		pagamento.numeroDeDependentes = 2;
		pagamento.salarioBruto = 5000;
		pagamento.planoSaude = 50;
		
		pagamento.calcularSalarioLiquido();
	}

}

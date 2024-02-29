package br.com.fiap;

import java.util.Scanner;



public class PagamentoScan {

    public static void main(String[] args) {
        Scanner scan;
        String aux;
        double salario;

        FolhaPagamento pagamento = new FolhaPagamento();
        scan = new Scanner(System.in);
        
        System.out.println("Digite o salário bruto: ");
        pagamento.salarioBruto = scan.nextDouble();

        System.out.println("Digite o valor do INSS: ");
        pagamento.descontoINSS = scan.nextDouble();

        System.out.println("Digite o número de dependentes: ");
        pagamento.numeroDeDependentes = scan.nextInt();

        System.out.println("Digite o valor do plano de saúde: ");
        pagamento.planoSaude = scan.nextDouble();

        salario = pagamento.calcularSalarioLiquido();

        System.out.println(salario);
        
    }



}

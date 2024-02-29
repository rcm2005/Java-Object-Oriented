package br.com.fiap;

import java.util.Scanner;

import Scanner;

public class PagamentoScan {

    public static void main(String[] args) {

        Scanner scan;
        String aux;
        double salariobru, inss, planosaude, salarioliq;
        int dependentes;
        FolhaPagamento folha;

        try {
            
        

            folha = new FolhaPagamento();
            scan = new Scanner(System.in);
            
            System.out.println("Digite o salário bruto: ");
            salariobru = scan.nextDouble();

            System.out.println("Digite o valor do INSS: ");
            inss = scan.nextDouble();

            System.out.println("Digite o número de dependentes: ");
            dependentes = scan.nextInt();

            System.out.println("Digite o valor do plano de saúde: ");
            planosaude = scan.nextDouble();

            folha.descontoINSS = inss;
            folha.salarioBruto = salariobru;
            folha.planoSaude = planosaude;
            folha.numeroDeDependentes = dependentes;
            
            folha.calcularSalarioLiquido();




        } catch (Exception e) {
            System.out.println("formato de numero incorreto");
        }
        
    }



}

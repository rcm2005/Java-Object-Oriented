package br.com.fiap;


import javax.swing.JOptionPane;

public class PagamentoJOP {
    public static void main(String[] args) {
        double salariobru, planosaude, inss;
        String aux;
        int numerodependente;
        FolhaPagamento folha;


        try {
            folha = new FolhaPagamento();

            aux = JOptionPane.showInputDialog("digite o salário bruto: ");
            salariobru = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("digite o INSS: ");
            inss = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Digite o número de dependentes: ");
            numerodependente = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog("Digite o valor do plano de saúde: ");
            planosaude = Double.parseDouble(aux);

            folha.salarioBruto = salariobru;
            folha.descontoINSS = inss;
            folha.numeroDeDependentes = numerodependente;
            folha.planoSaude = planosaude;

            folha.calcularSalarioLiquido();

        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

package br.com.fiap.bean;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class UsaEquipe {
    public static void main(String[] args) {
        Euquipe grupo;
        String aux, nome, escolha = "sim";
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                nome = JOptionPane.showInputDialog("Dê um nome para a equipe");
                String membros = "continua";
                ArrayList<String> integrantes = new ArrayList<String>();
                while (membros.equalsIgnoreCase("continua")) {
                    aux = JOptionPane.showInputDialog("Digite integrante ou 'fim' para encerrar:");
                    if (aux.equals("fim")){
                        membros = "fim";
                    }else{
                        integrantes.add(aux);
                    }
                    grupo = new Equipe(nome, integrantes);
                    grupo.listaEquipe();
                    escolha = JOptionPane.showInputDialog("Deseja continuar ?");
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
        }
        JOptionPane.showMessageDialog(null, "Fim do programa. Até breve!");
    }
    
}

package br.com.fiap.main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Equipe;

public class Usaequipe {
    public static void main(String[] args){
        Equipe grupo;
        String aux, nome, escolha = "sim";
        while (escolha.equalsIgnoreCase("sim")){
            try {
                
                nome = JOptionPane.showInputDialog("Digite o ome da equipe");
                String membros = "continua";
                ArrayList<String> integrantes = new ArrayList<String>();
                while (membros.equalsIgnoreCase("continua")){
                    aux = JOptionPane.showInputDialog("digite integrantes dessa equipe ou digite \"fim\" para encerrar.");
                    if(aux.equalsIgnoreCase("fim")){
                        membros = "fim";

                    } else{
                        integrantes.add(aux);

                    }
                }
                
                grupo = new Equipe(nome, integrantes);
                grupo.listaEquipe(nome, integrantes);
                escolha = JOptionPane.showInputDialog(null,"Deseja continuar ?");


            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                e.getMessage());
            }

        }
        JOptionPane.showMessageDialog(null, "Fim do programa");
    }
}

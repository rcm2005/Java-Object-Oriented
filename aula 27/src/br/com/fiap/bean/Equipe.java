package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Equipe {
    private String nome;
    private ArrayList<String> integrantes;


    // declaração de construtores
    public Equipe(){}

    // declaração de getters e setters
    public Equipe(String nome, ArrayList<String> integrantes){
        this.integrantes = integrantes;
        this.nome = nome;
    }

    public ArrayList<String> getIntegrantes() {
        return integrantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIntegrantes(ArrayList<String> integrantes) {
        this.integrantes = integrantes;
    }

    public void listaEquipe(){
        String exibe = "nome da equipe: " + nome + "\n";
        Collections.soet(integrantes);
        int cont = 1;
        for (string i: integrantes){
            exibe += "integrante" + cont + ":" + i + "\n";
            cont++;
        }
        JOptionPane.showMessageDialog(null, exibe);


        // JOptionPane.showMessageDialog(null, integrantes, nome, 0);         #jeito curto, seco e direto de fazer
    }
    

}

package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Equipe {
    
    private String nome;
    private ArrayList<String> integrantes;

    public Equipe(){

    }

    public Equipe(String nome, ArrayList<String> integrantes){
        this.nome = nome;
        this.integrantes = integrantes;
    }

    public ArrayList<String> getIntegrantes() {
        return integrantes;
    }

    public String getNome() {
        return nome;
    }

    public void setIntegrantes(ArrayList<String> integrantes) {
        this.integrantes = integrantes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }





    public void listaEquipe(){
        String exibe = "nome da equipe" + nome;
        Collections.sort(integrantes);
        int cont = 1;
        for (String i : integrantes){
            exibe += "\nIntegrante " + cont + ": " + i;
            cont++;
        }
    }



    
}

package br.com.fiap.bean;

import java.util.ArrayList;

public class SuperHeroi {
    // Praticando arraylist

    private String nome, idSecreta;
    private ArrayList<String> poderes;
    private ArrayList<String> fraquezas;

    public SuperHeroi(){}
    
    public SuperHeroi(String nome, String idSecreta, ArrayList<String> poderes, ArrayList<String> fraquezas){
        try {
            this.fraquezas = fraquezas;
            this.idSecreta = idSecreta;
            this.nome = nome;
            this.poderes = poderes;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void listaHeroi(){
        ///

    }

}

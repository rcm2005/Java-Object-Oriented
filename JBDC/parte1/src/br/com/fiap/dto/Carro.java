package br.com.fiap.dto;

public class Carro {
    private String placa;
    private String cor;
    private String descricao;
    private int ano;
    public Carro(){

    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

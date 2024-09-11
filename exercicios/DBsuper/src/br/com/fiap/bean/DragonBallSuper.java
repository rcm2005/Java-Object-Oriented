package br.com.fiap.bean;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DragonBallSuper {
    public String nomeChar;
    public int ki, tecnicas, velocidade, transformacoes;

    public DragonBallSuper(){}

    public int getKi() {
        return ki;
    }
    public int getTransformacoes() {
        return transformacoes;
    }
    public String getNomeChar() {
        return nomeChar;
    }
    public int getTecnicas() {
        return tecnicas;
    }
    public int getVelocidade() {
        return velocidade;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }
    public void setNomeChar(String nomeChar) {
        this.nomeChar = nomeChar;
    }
    public void setTecnicas(int tecnicas) {
        this.tecnicas = tecnicas;
    }
    public void setTransformacoes(int transformacoes) {
        this.transformacoes = transformacoes;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }



    /**
     *  Método que le o caminho especificado para encontrar arquivos com
     * 
     * @param caminho a ser lido
     * @throws IOexception ao ler o arquivo
     */


    public void ler(String path) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(path + "/" + nomeChar + ".txt" ));
            nomeChar = br.readLine();
            ki = br.readLine();
            tecnicas = br.readLine();

    }


}

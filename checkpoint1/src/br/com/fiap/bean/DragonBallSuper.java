package br.com.fiap.bean;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DragonBallSuper implements IDBSuper {
    public String nomeChar;
    public int ki, tecnicas, velocidade, transformacoes;

    /**
     * Construtor padrão.
     */
    public DragonBallSuper() {}

    /**
     * Retorna o nível de ki do personagem.
     * 
     * @return int Nível de ki do personagem.
     * @author Rafael Carvalho Mattos - 99874
     */
    public int getKi() {
        return ki;
    }

    /**
     * Retorna o número de transformações que o personagem pode realizar.
     * 
     * @return int Número de transformações que o personagem pode realizar.
     * @author Rafael Carvalho Mattos - 99874
     */
    public int getTransformacoes() {
        return transformacoes;
    }

    /**
     * Retorna o nome do personagem.
     * 
     * @return String Nome do personagem.
     * @author Rafael Carvalho Mattos - 99874
     */
    public String getNomeChar() {
        return nomeChar;
    }

    /**
     * Retorna o número de técnicas que o personagem possui.
     * 
     * @return int Número de técnicas que o personagem possui.
     * @author Rafael Carvalho Mattos - 99874
     */
    public int getTecnicas() {
        return tecnicas;
    }

    /**
     * Retorna a velocidade do personagem.
     * 
     * @return int Velocidade do personagem.
     * @author Rafael Carvalho Mattos - 99874
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * Define o nível de ki do personagem.
     * 
     * @param ki Nível de ki do personagem.
     * @author Rafael Carvalho Mattos - 99874
     */
    public void setKi(int ki) {
        this.ki = ki;
    }

    /**
     * Define o nome do personagem.
     * 
     * @param nomeChar Nome do personagem.
     * @author Rafael Carvalho Mattos - 99874
     */
    public void setNomeChar(String nomeChar) {
        this.nomeChar = nomeChar;
    }

    /**
     * Define o número de técnicas que o personagem possui.
     * 
     * @param tecnicas Número de técnicas que o personagem possui.
     * @author Rafael Carvalho Mattos - 99874
     */
    public void setTecnicas(int tecnicas) {
        this.tecnicas = tecnicas;
    }

    /**
     * Define o número de transformações que o personagem pode realizar.
     * 
     * @param transformacoes Número de transformações que o personagem pode realizar.
     * @author Rafael Carvalho Mattos - 99874
     */
    public void setTransformacoes(int transformacoes) {
        this.transformacoes = transformacoes;
    }

    /**
     * Define a velocidade do personagem.
     * 
     * @param velocidade Velocidade do personagem.
     * @author Rafael Carvalho Mattos - 99874
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }



    /**
     * Lê as informações do personagem de um arquivo.
     * 
     * @param path Caminho do arquivo que contém as informações do personagem.
     * @throws IOException Se ocorrer um erro ao ler o arquivo.
     * @author Rafael Carvalho Mattos - 99874
     */
    public void ler(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path + "/" + nomeChar + ".txt"));
        nomeChar = br.readLine();
        ki = Integer.parseInt(br.readLine());
        transformacoes = Integer.parseInt(br.readLine());
        tecnicas = Integer.parseInt(br.readLine());
        br.close();
    }



    /**
     * Grava um arquivo em um diretório específico.
     * 
     * @param path Caminho do diretório onde o arquivo será gravado.
     * @return String com o resultado da operação (sucesso ou erro).
     * @author Rafael Carvalho Mattos - 99874
     */


     public String gravar(String path) {
        try {
            File dir = new File(path);
            if (!dir.exists()) {
                dir.mkdir();
            }
            PrintWriter pw = new PrintWriter(path + "/" + nomeChar + ".txt");
            pw.println(nomeChar);
            pw.println(ki);
            pw.println(transformacoes);
            pw.println(tecnicas);
            pw.flush();
            pw.close();
            return "Arquivo gravado com sucesso";
        } catch (Exception e) {
            return "Falha ao gravar arquivo: " + e.getMessage();
        }
    }
}
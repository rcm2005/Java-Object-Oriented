//Rafael Carvalho Mattos RM99874

package br.com.fiap.bean;
import java.io.IOException;

/**
 * Interface que define os métodos para lidar com personagens de Dragon Ball Super.
 * 
 * @author Rafael Carvalho Mattos - 99874
 * @version 1.0
 */
public interface IDBSuper  {

    /**
     * Lê os dados do personagem de um arquivo.
     * 
     * @param path o caminho do arquivo
     * @throws IOException se ocorrer um erro ao ler o arquivo
     * @author Rafael Carvalho Mattos - 99874
     */
    void ler(String path) throws IOException;

    /**
     * Grava os dados do personagem em um arquivo.
     * 
     * @param path o caminho do arquivo
     * @return o conteúdo do arquivo
     * @author Rafael Carvalho Mattos - 99874
     */
    String gravar(String path);

}
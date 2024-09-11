package br.com.fiap.bean;

import java.io.File;
import java.io.PrintWriter;

public class Pessoa {
    

    public String gravar(String path){
        try {
            File dir = new File(path);
            if (!dir.exists()){
                dir.mkdir();

            }
            PrintWriter pw = new PrintWriter(path + "/" codigo + ".txt");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }


}

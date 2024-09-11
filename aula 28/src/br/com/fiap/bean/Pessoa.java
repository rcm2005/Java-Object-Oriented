import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Pessoa {
    String codigo, nome, email;

    public Pessoa(){}

    public String getCodigo() {
        return codigo;
    }
    public String getEmail() {
        return email;
    }
    public String getNome() {
        return nome;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public Pessoa ler(String path) throws IOexception {
        BufferedReader br = new BufferedReader(new FileReader(path +"/" + codigo + ".txt"));
        codigo = br.readLine();
        nome = br.readLine();
        email = br.readLine();
        br.close();

        return this;




    }

    public String Gravar(String path){

        try {
            File dir = new File(path);   //Converte a string path para um objeto File
            if (!dir.exists()){ // Se o diretório não existir
                dir.mkdir();   // Criao diretório
            }
            PrintWriter pw = new PrintWriter(path + "/" + codigo + ".txt");
            pw.println(codigo);
            pw.println(nome);
            pw.println(email);
            pw.flush();
            pw.close();
            return "Arquivo gravado com sucesso";   

        } catch (Exception e) {
            return "Falha ao gravar arquivo" + e.getMessage();
        }

    }

}

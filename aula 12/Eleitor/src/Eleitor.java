public class Eleitor {
    
    
    private String nome;
    private int anoNascimento, numTitulo, zona, secao;

    Eleitor(String nome, int anoNascimento, int numTitulo, int zona, int secao){
        this.nome= nome;
        this.anoNascimento = anoNascimento;
        this.numTitulo = numTitulo;
        this.zona = zona;
        this.secao = secao;
    }

    Eleitor(){}

    public int getAnoNascimento() {
        return anoNascimento;
    }
    public String getNome() {
        return nome;
    }
    public int getNumTitulo() {
        return numTitulo;
    }
    public int getSecao() {
        return secao;
    }
    public int getZona() {
        return zona;
    }
    public void setAnoNascimento(int anoNascimento) {
        try {
            if(anoNascimento >= 1900){
                this.anoNascimento = anoNascimento;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumTitulo(int numTitulo) {
        this.numTitulo = numTitulo;
    }
    public void setSecao(int secao) {
        this.secao = secao;
    }
    public void setZona(int zona) {
        this.zona = zona;
    }

    public int calculaIdade(int anoAtual){
        int resultado = anoAtual - anoNascimento;

        return resultado;

    }
}

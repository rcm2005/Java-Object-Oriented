public class Funcionario {
    
    private String nome;
    private float valorHora;

    Funcionario(){}

    Funcionario(String nome, float valorHora){
        this.nome = nome;
        try {
           setValorHora(valorHora);
                
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }

    //getters & setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValorHora() {
        return valorHora;
    }
    public void setValorHora(float valorHora) {
        try {
            if (valorHora > 0){
                this.valorHora = valorHora;
    
            }else{
                throw new Exception("Valor inválido o numero de hora deve ser maior que 0");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    //metodos
    public float salario(int horas){ 
        
        float salar = horas * valorHora;

        return salar;

    }

}

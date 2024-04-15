import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Gestante {
    private String nome;
    private LocalDate dataD;

    //construtores

    Gestante(){}

    Gestante(String nome, LocalDate dataD){};

    //getters & setters

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDaGestacao() {
        return dataD;
    }

    public void setNome(String nome) {
        try {
            this.nome = nome;

        } catch (Exception e) {
            System.out.println("Valor inválido");
        }
    }

    public void setDataDaGestacao(LocalDate dataDaGestacao) {

        try {
            this.dataD = dataDaGestacao;

        } catch (Exception e) {
            System.out.println("Valor inválido");
        }
    }


    //metodos
    public int tempoDeGestacao(){
        
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate hoje;
        Period periodo;
        int auxi;


        // dataDaGestacao = LocalDate.parse(dataDaGestacao, formatter);
        hoje = LocalDate.now();
        periodo = Period.between(dataD, hoje);

        auxi = periodo.getMonths();


        return auxi;
        


    }
}

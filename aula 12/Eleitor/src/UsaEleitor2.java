import java.util.Scanner;

public class UsaEleitor2 {
    public static void main(String[] args) {
        int aux;
        String auxs;
        
        Eleitor eleitor1 = new Eleitor();
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("digite o seu nome: ");
            auxs = scan.nextLine();
            eleitor1.setNome(auxs);
            System.out.println("digite o número do seu título de eleitor: ");
            aux = scan.nextInt();
            eleitor1.setNumTitulo(aux);
            System.out.println("digite seu ano de nascimento: ");
            aux = scan.nextInt();
            eleitor1.setAnoNascimento(aux);
            System.out.println("digite a zona: ");
            aux = scan.nextInt();
            eleitor1.setZona(aux);
            System.out.println("digite a seção");
            aux = scan.nextInt();
            eleitor1.setSecao(aux);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("digite o ano atual: ");
        aux = scan.nextInt();


        aux = eleitor1.calculaIdade(aux);

        System.out.println(aux);



         
        


    }
}

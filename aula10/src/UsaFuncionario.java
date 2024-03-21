import java.util.Scanner;

public class UsaFuncionario {
    public static void main(String[] args) {
        
        int horasTrabalhadas;
        Scanner scan;

        Funcionario func = new Funcionario();
        scan = new Scanner(System.in);


        func.setNome("Rafael");
        func.setValorHora(30);
        System.out.println("digite o numero de horas trabalhadas");
        horasTrabalhadas = scan.nextInt();
        System.out.println(func.salario(horasTrabalhadas));

        

    }
}

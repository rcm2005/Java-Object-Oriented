public class UsaFuncionario2 {
    public static void main(String[] args) {
        
        String nome = "Jerisvaldo";
        int horasTrabalhadas = 4;
        int valorhora = 10;
        



        Funcionario func = new Funcionario(nome,valorhora);

        System.out.println(func.salario(horasTrabalhadas));
    }
}

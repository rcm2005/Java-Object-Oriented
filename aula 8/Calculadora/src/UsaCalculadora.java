import java.util.Scanner;

public class UsaCalculadora {
    public static void main(String[] args) {
        
        int aux, um, dois;
        Scanner scan;
        scan = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        System.out.println("Seja bem vindo ao menu, escoha uma opção:");
        System.out.println("soma - 1");
        System.out.println("Subtração - 2");
        System.out.println("Multiplicação - 3");
        System.out.println("Divisão - 4");

        aux = scan.nextInt();

        if (aux == 1){
            System.out.println("digite os números: ");
            calc.soma(scan.nextInt(), scan.nextInt());
        } else if (aux == 2){
            System.out.println("digite os números");
            calc.subtracao(scan.nextInt(), scan.nextInt());
        }else if (aux == 3){
            System.out.println("digite os números: ");
            calc.multiplicacao(scan.nextInt(),scan.nextInt());
        }else if (aux == 4){
            System.out.println("digite os dois números");
            calc.divisao(scan.nextInt(), scan.nextInt());
        }






    }
    
}

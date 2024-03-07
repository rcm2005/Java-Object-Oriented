import java.util.Scanner;

public class UsaArcondicionadoEncpasulado {
    

    public static void main(String[] args) {
        
        ArCondicionadoEncapsulado ar = new ArCondicionadoEncapsulado();
        Scanner scan;
        int aux;
        String auxs;
        scan = new Scanner(System.in);
        do{
            System.out.println("Aumentar temperatura - 1");
            System.out.println("Diminuir temperatura - 2");
            System.out.println("Trocar modo - 3");
            System.out.println("Digite 0 para encerrar o programa");
            aux = scan.nextInt();

            if (aux == 1 ){
                ar.aumentarTemperatura();
                ar.mostrar();
            }else if (aux ==2){
                ar.diminuirTemperatura();
                ar.mostrar();
            }else if (aux == 3){
                System.out.println("Qual modo deseja ? (Resfriar, Aquecer, Ventilar): ");
                auxs = scan.next();
                ar.trocarModo(auxs);
                ar.mostrar();
            }
        }while(aux != 0);
    }
}

import java.util.Scanner;

public class UsarTelevisorEncapsulado {

    public static void main(String[] args) {
        int opcao, input;
        Scanner scan;

        TelevisorEncapsulado tv = new TelevisorEncapsulado();
        
        opcao = tv.menu();

        do{
            if (opcao == 1){
                scan = new Scanner(System.in);
                System.out.println("Qual canal gostaria de definir ?");
                input = scan.nextInt();
                tv.setCanal(input);
            }else if (opcao == 2){
                scan = new Scanner(System.in);
                System.out.println("Qual volume gostaria de definir ?");
                input = scan.nextInt();
                tv.setVolume(input);
            }else if (opcao == 3){
                tv.aumentaVolume();
            }else if (opcao == 4){
                tv.diminuirVolume();
            }
        } while(opcao != 0);
    
    }
}

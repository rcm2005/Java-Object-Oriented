import java.util.Scanner;

public class UsarTelevisorEncapsulado {

    public static void main(String[] args) {
        int opcao, input;
        Scanner scan;

        TelevisiorEncapsulado tv = new TelevisiorEncapsulado();
        
        opcao = tv.menu();
        
        if (opcao == 1){
            scan = new Scanner(System.in);
            System.out.println("Qual canal gostaria de definir ?");
            input = getIntFromUser();
            tv.setCanal(input);
        }else if (opcao == 2){
            scan = new Scanner(System.in);
            System.out.println("Qual volume gostaria de definir ?");
            input = getIntFromUser();
            tv.setVolume(input);
        }else if (opcao == 3){
            tv.aumentaVolume();
        }else if (opcao == 4){
            tv.diminuirVolume();
        }
    }

}

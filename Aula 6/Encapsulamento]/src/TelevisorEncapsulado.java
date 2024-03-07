import java.util.Scanner;

public class TelevisorEncapsulado {

    public int canal, volume;


    //getters & setters

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        try {
            if (volume <= 100 && volume >=0){
                this.volume = volume;
            }else{
                throw new Exception("O volume deve estar entre 0 e 100");
            } 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public int getCanal(){
        return canal;
    }

    public void setCanal(int canal){
        try {
            if (canal == 2 || canal == 4 || canal == 5 || canal == 7 || canal == 13){
                this.canal = canal;
            }
        } catch (Exception e) {
            System.out.println("O primeiro canal é o 1");
        }
    }

    //troca o canal
    public void trocaCanal(){
        canal ++;
    }
    
    //aumenta volume
    public void aumentaVolume(){
        try {
            if (volume < 100){
                volume ++;
            }else{
                throw new Exception("O volume já está no máximo");
            }    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public void diminuirVolume(){
        try {
            if (volume >= 0){
                volume --;
            }else{
                System.out.println("O volume não pode ser menor do que 0");
            }    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int menu(){

        Scanner scan;
        int opcao = 0;

        try {
            
            scan = new Scanner(System.in);
            System.out.println("O que deseja ?");
            System.out.println("Definir canal (2,4,5,7 ou 13) - 1");
            System.out.println("Definir volume - 2");
            System.out.println("Aumentar o volume - 3 ");
            System.out.println("Diminuir o volume - 4");
            System.out.println("Digite 0 para fechar o programa");
            opcao = scan.nextInt();


        } catch (Exception e) {
            System.out.println("Por favor digite uma opção válida");
        }
        return opcao;

    }


}
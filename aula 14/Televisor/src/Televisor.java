public class Televisor {
   
    private int volume, canal;

    Televisor(){}

    Televisor(int volume, int canal){
        this.canal = canal;
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        try {
            if (canal == 2 || canal == 4 || canal == 5 || canal == 13){
                this.canal = canal;

            }else{
                throw new Exception("canal inválido");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        try {
            if (volume > 0 && volume < 10){
                this.volume = volume;

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }


    public void aumentarVolume(){

        try {
            if (volume !=10){
                this.volume = volume++;
            }
        } catch (Exception e) {
            System.out.println("O volume já está no máximo");
        }

    }

    public void diminuirVolume(){
        if (volume >=1){
            this.volume = volume++;
        }
    }




}

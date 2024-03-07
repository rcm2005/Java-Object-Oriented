public class ArCondicionadoEncapsulado {

    public int temperatura;
    public String modo;

    //getters and setters

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        try {
            if (temperatura >= 15 && temperatura <= 26){
                this.temperatura = temperatura;
            }
               
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
    }

    public String getModo() {
        return modo;
    }


    
    public void setModo(String modo) {
       try {
               
        if (modo.equals("Ventilar") || modo.equals("Aquecer") || modo.equals("Resfriar")){
            this.modo = modo;
        }
       } catch (Exception e) {
        System.out.println(e.getMessage());
       }

        
    }
    // Métodos

    public void aumentarTemperatura(){
        if (temperatura < 26){
            temperatura ++;
        }
    }

    public void diminuirTemperatura(){
        if (temperatura > 15){
            temperatura --;
        }
    }

    public void trocarModo(String modo){
        
        try {
            if (modo.equals("Ventilar") || modo.equals("Aquecer") || modo.equals("Resfriar")){
                this.modo = modo;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
    }

    public void mostrar(){
        System.out.println("a temperatua esta em: " + temperatura +" e o modo é: " + modo );
    }

}

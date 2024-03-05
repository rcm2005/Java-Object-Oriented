public class RadioEncapsulada {

    private int volume;
    private float estacao;

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;

    }
    public float getEstacao(){
        return estacao;

    }
    public void setEstacao(float estacao){
        this.estacao = estacao;
    }

    public void aumentarVolume(){
        volume ++;
    }

    public void diminuirVolume(){
        volume --;
    }
    public void mostrar(){
        System.out.println("Volume: " + volume + "\nEstação: " + estacao);
    }
    
}
    


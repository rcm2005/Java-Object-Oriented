package br.com.fiap.bean;


public class Retangulo extends Quadrado {
    
    private float altura;

    // Construtores
    public Retangulo(){

    }
    public Retangulo(float altura){
        this.altura = altura;
    }

    //getters & setters

    public float getAltura() {
        return altura;
    }

    public float calcularArea(){
        float area = super.getLado() *altura;

        return area;
        
    }
    
}

package br.com.fiap.bean;

public class Triangulo extends Quadrado {
    private float altura;

    //construtores
    public Triangulo(){}

    public Triangulo(float altura){
        this.altura = altura;
    }

    public float calcularArea(){
        float area = (super.getLado() *altura)/2;
        return area;
    }
    
}

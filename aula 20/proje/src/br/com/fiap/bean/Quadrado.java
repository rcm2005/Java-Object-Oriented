package br.com.fiap.bean;

public class Quadrado {

    private float lado;


    //Construtores

    public Quadrado(){}

    public Quadrado(float lado){
        this.lado = lado;
    }

    // Getters & setters
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        try {
            this.lado = lado;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public float calcularArea() {
        float area = lado *lado;
        return area;

    }
    
}

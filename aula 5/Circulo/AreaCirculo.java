public class AreaCirculo {
    
    public double raio, area;
    public double pi = 3.14;

    public double calculaArea(){
        area = pi * (raio *raio);
        System.out.println("A área do círculo é: " + area);
        return area;
    }
}

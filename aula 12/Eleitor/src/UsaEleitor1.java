public class UsaEleitor1 {
    public static void main(String[] args) {
     
        int resultado;
        
        Eleitor eleitor1 = new Eleitor("João", 2005, 123456, 1, 10);
        Eleitor eleitor2 = new Eleitor("Maria", 1990, 654321, 2, 20);
        
        resultado = eleitor1.calculaIdade(2024);

        System.out.println(resultado);
        
        resultado = eleitor2.calculaIdade(2024);

        System.out.println(resultado);


    
    }
}

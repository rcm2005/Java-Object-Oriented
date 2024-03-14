public class Calculadora {
    private int num1, num2;


    //geters and setters

    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }


    // métodos
    public void soma(int num1, int num2){
        int soma = num1 + num2;
        System.out.println("a soma dos dois números é: " + soma);
    }
    public void subtracao(int num1, int num2){
        int subtracao = num1 - num2;
        System.out.println("a subtração dos números é: " + subtracao);

    }
    public void multiplicacao(int num1, int num2){
        int multiplicacao = num1 * num2;
        System.out.println("a multiplicação dos números é: " + multiplicacao);
    }
    public void divisao(int num1, int num2){
        int divisao = num1 / num2;
        System.out.println("A divisão dos dois números é: " + divisao);
    }
    


}

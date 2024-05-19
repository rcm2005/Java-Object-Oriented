/**Classe para objetos do tipo conta Poupanca
 * @author asçdlkfj
 * @version 2.0
 */

public class ContaPoupanca implements ContaBancaria {
    private int numConta;
    private float saldo;

    public ContaPoupanca(){}

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta(){
        return numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**Metodo sacar que permite sacar o valor informado
     * valor a ser sacado não pode ser superior ao saldo atual
     * @author Fulano da silva
     * @param valor - valor indicado a ser sacado
     * @return float - valor do saldo (atualizado)
     *
     */

     public float sacar(float valor){
        try {
            if (valor <= saldo){
                saldo = saldo - valor;

            }else{
                throw new Exception("saldo insuficiente");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return saldo;
     }

    /**Metodo depositar que permite depositar o valor informado
     * @author Fulano da silva
     * @param valor - valor indicado a ser depositado
     * @return float - valor do saldo (atualizado)
     */

    public float depositar(float valor){
        try {
            saldo += valor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return saldo;
    }





    }

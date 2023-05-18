
public abstract class Conta implements Movimentacoes {

    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta\n" + "numero=" + numero + ", saldo=" + saldo;
    }

   
    public void depositar(double valor) {
        
    }

   
    public void sacar(double valor) {

    }

    public void consultarSaldo() {

    }

}

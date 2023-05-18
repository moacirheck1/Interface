
public class ContaCorrente extends Conta implements Movimentacoes{
    private double limite;

    public ContaCorrente(String numero, double saldo) {
        super(numero, saldo);
    }

    public ContaCorrente(double limite, String numero, double saldo) {
        super(numero, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    

    @Override
    public String toString() {
        return "ContaCorrente{" + "limite=" + limite + '}';
    }
    

   
    
}

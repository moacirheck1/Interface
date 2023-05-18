
public class ContaPoupanca extends Conta {
private double taxaRendimento;
    public ContaPoupanca(String numero, double saldo) {
        super(numero, saldo);
    }

    public ContaPoupanca(double taxaRendimento, String numero, double saldo) {
        super(numero, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
   

    @Override
    public String toString() {
        return "ContaPoupanca{" + "taxaRendimento=" + taxaRendimento + '}';
    }
    
    
    

    
}

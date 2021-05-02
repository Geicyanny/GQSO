public class Banco {
    private double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        this.saldo += valor;

    }
    public void saque(double valor){
        this.saldo -= valor;
    }
    public double saldo() {
        return this.saldo;
    }
}
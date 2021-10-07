package exercicios.exercicio01;

public class Conta {
    private int numeroConta;
    private double saldo;

    public Conta(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public int getNumero() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }
    
   @Override
    public String toString (){
        return String.format("%d : R$ %.2f", numeroConta, saldo);
    }
}

package exercicios.exercicio01.dominio;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numeroConta, double limite) {
        super(numeroConta);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (getSaldo() + limite >= valor){
            return super.sacar(valor);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta especial nº " + super.toString() + ", com limite de " + limite;
    }

}

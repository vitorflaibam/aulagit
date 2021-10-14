package exercicios.exercicio01.dominio;

public class ContaCorrente extends Conta{
    final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int numeroConta){
        super(numeroConta);
    }
    @Override
    public boolean sacar(double valor){
        if(valor <= getSaldo()){ // verifica se tem saldo suficiente
            super.sacar(valor);
        }
        return false; // nao tem saldo suficiene
    }
    @Override
    public boolean depositar(double valor){
        return super.depositar(valor - TAXA_DEPOSITO);
    }
    @Override
    public String toString (){
        return "Conta corrente nº " + super.toString();
    }
}

package exercicios.exercicio01.dominio;

public class ContaPoupanca extends Conta{
    // static define um atributo para a classe e nao para cada objeto
   private static double taxa = 0.1;
   
    public ContaPoupanca(int numero){
        super(numero);
    }

public void setTaxa(double novaTaxa){
    if(novaTaxa >0){
        taxa = novaTaxa;
    }
}

    @Override
    public boolean sacar(double valor){
        if(valor + taxa <= getSaldo()){ // verifica se tem saldo suficiente
            super.sacar(valor + taxa);
        }
        return false; // nao tem saldo suficiene
    }
}

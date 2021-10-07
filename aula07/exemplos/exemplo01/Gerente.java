package exemplos.exemplo01;

public class Gerente extends Funcionario {
    private int numFuncionarios;

    public Gerente(String nome, double salario, int numFuncionarios) {
        super(nome, salario);
        this.numFuncionarios = numFuncionarios;
    }

    // overload
    public Gerente(String nome) {
        super(nome, 0);
    }
    public Gerente(double salario){
        super("nome", 0);
    }

    public void exibir(){
        System.out.println(getNome() + " - " + getSalario()+ " - " + numFuncionarios);
    }


@Override
public String toString(){
return super.toString() + " Numero Funcionario : " +  numFuncionarios;
}
}
// recebe 20% a mais alem do salario do funcionario
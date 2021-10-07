package exercicios.exercicio02;

public class Professor extends Pessoas {
    private double salario;

    public Professor(String nome, String telefone, String curso, double salario) {
        super(nome, telefone);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + salario;
    }
}
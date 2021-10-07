package exercicios.exercicio02;

public class Animal {
    private String nome, raca;
    private int anoNasc;
    private Proprietario proprietario;

    public Animal(String nome, String raca, int anoNasc, Proprietario proprietario){
        this.nome = nome;
        this.raca= raca;
        this.anoNasc = anoNasc;
        this.proprietario = proprietario;
    }
    public Animal(String nome, String raca, int anoNasc, Proprietario nomeProprietario, String telefone){
        this.nome = nome;
        this.raca= raca;
        this.anoNasc = anoNasc;
        this.proprietario = new Proprietario(nomeProprietario, telefone);
    }
public String toString(){
    return nome + " " + raca + " - " + anoNasc + " " + nomeProprietario + telefone);
}
}

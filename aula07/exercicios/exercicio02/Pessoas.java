package exercicios.exercicio02;
// uma classe abstrata nao pode criar (instanciar) objetos
// ela serve apenas como um modelo para outras classes
public class Pessoas {
    private String nome;
    private String telefone;

 
    public Pessoas(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
@Override
    public String toString(){
        return nome + " " + telefone;
    }
}

package exemplos.exemplo03;

public class Pessoa {
    // atributos
    String nome;
    int idade;

    // método construtor - inicializa os dados do objeto
    Pessoa(String nome, int idade) {
        this.nome = nome; // THIS se refere ao objeto (atributo)
        this.idade = idade;
    }

    // metodos
    void apresentar(){
        System.out.println("Olá, Sou " + nome + " e tenho " + idade + " anos.");
    }

}

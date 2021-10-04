package exemplos.exemplo03;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Vítor", 29);
        Pessoa p2 = new Pessoa("Etegildo", 40);

       // p.nome = "Vitor";
        // p.idade = 28;
        p.apresentar();

       // p2.nome = "Etegildo";
        // p2.idade = 40;
        p2.apresentar();
    }
}

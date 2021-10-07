package exemplos.exemplo01;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Carlos", 1000);
        Gerente g = new Gerente("Amanda", 2000, 10);
        Gerente g2 = new Gerente("João");
        f.aumentaSalario(10);
        f.exibir();
        g.aumentaSalario(30);
        g.exibir();
        g2.exibir();
    }
}

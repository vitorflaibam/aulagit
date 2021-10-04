package exemplos.exemplo03;

public class AppCarro {
    public static void main(String[] args) {
        Carro c = new Carro("Ka", "Ford", 20.1);
        Carro  c2 = new Carro("Punto", "Fiat", 17.17);

        c.marcamodelo();
        c.consumo();
        c2.marcamodelo();
        c2.consumo();

    }
}

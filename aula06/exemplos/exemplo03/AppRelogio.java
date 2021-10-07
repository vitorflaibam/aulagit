package exemplos.exemplo03;

public class AppRelogio {
    public static void main(String[] args) {
        
    Relogio r = new Relogio(23, 45, 00);

    System.out.println("Hora atual: " + r.getHoras());
    r.setHoras(79);
    System.out.println("Hora atual: " + r.getHoras());

        r.setMinutos(8);
        System.out.println("Minuto atual: " + r.getMinutos());

        r.exibir();
    }
}

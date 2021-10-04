package exemplos.exemplo03;

public class AppRelogio {
    public static void main(String[] args) {
        
    Relogio r = new Relogio(25, 45, 00);

    System.out.println("Hora atual: " + r.getHoras());
    r.setHoras(79);
    System.out.println("Hora atual: " + r.getHoras());
    }
}

package exemplos.exemplo03;

public class Relogio {
    // atributos
    private int horas, minutos, segundos;

    // construtor

    public Relogio(int horas, int minutos, int segundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas >= 0 && horas < 24) {
            this.horas = horas;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minutos = minutos;
        }
    }

    public int getSegudos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && minutos < 60) {
            this.segundos = segundos;
        }
    }
    public void exibir(){
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }
}

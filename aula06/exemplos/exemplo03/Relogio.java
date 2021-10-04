package exemplos.exemplo03;

public class Relogio {
    // atributos
    private int horas, minutos, segundos;

    //  construtor

    public Relogio(int horas, int minutos, int segundos){
        setHoras(horas) ;
        this.minutos = minutos;
        this.segundos = segundos;
    }
       
    public int getHoras(){
        return horas;
    }
    public void setHoras(int horas){
        if (horas >= 0 && horas < 24){
        this.horas = horas;
        }
     }

    }


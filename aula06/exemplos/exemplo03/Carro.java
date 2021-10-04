package exemplos.exemplo03;

public class Carro {
    String nome, marca;
    double consumo;

    Carro(String nome, String marca, double consumo){
        this.nome = nome;
        this.marca = marca;
        this.consumo = consumo;
    }
        void marcamodelo(){
            System.out.println("Esse é o " + marca + " " + nome + ".");
        }

        void consumo(){
            System.out.println("O consumo do " + nome + " é de " + consumo + " km por hora.");

        }
    }


package exemplos;

public class Exemplo01 {
    public static void main(String[] args) {
        linha();
        System.out.println("Meu programa v.1");
        linha(); // chamada de método
        System.out.println("Opções");
        int tamanho = "opções".length();
        linha2 (tamanho); // para usar o tamanho de acordo com a palavra
        linha2(20);
        linha3(10, '*');
    }

    static void linha() { // VOID = não tem retorno
        System.out.println("----------------");
    }

    static void linha2(int tamanho) { // tamanho é um parametro
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void linha3(int tamanho, char letra) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(letra);
        }
        System.out.println();
    }

}
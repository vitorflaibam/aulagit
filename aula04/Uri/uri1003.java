package Uri;

import java.util.Scanner;

public class uri1003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, soma;

        a = entrada.nextInt();
        b = entrada.nextInt();

        soma = a + b;
        System.out.println("SOMA = "+ soma);

        entrada.close();
    }
}

package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        double metade;

        System.out.println("Digite o número");
        numero = teclado.nextInt();

        if (numero > 20) {
            int divisor = 2;
           metade = (double)numero / divisor; // CASTING USADO NO DOUBLE
            System.out.println("A metade do número é " + metade);
        }

        teclado.close();
    }
}
 // casting = forçar uma conversão temporariamente
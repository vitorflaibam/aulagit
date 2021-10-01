package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int[] numeros = new int[10];

/*         numeros[0] = 12;
        numeros[1] = 9;
        numeros[4] = 7; */

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite aqui um valor inteiro:");
            numeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }

        entrada.close();

        /*
         * System.out.println(numeros[0]); System.out.println(numeros[1]);
         * System.out.println(numeros[2]); System.out.println(numeros[4]);
         */
    }
}

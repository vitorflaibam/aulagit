package exercicios;

import java.util.Scanner;

/**
 * Exercicio01
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cont;
        cont = 0;
        numero = 0;

        while (numero <= 10) {
            System.out.printf("Digite o %dº numero: ", cont++);
            numero = entrada.nextInt();
        }
        System.out.println();

        entrada.close();
    }

}
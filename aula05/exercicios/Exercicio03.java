package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String[] nomes = new String[7];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite aqui os nomes:");
            nomes[i] = entrada.nextLine();
        }

        System.out.println("Os nomes são");
        for (int i = nomes.length-1; i >= 0; i--) {
            System.out.printf(nomes[i] + " ");
        }

        entrada.close();

    }
}

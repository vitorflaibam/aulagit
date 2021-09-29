package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;

        System.out.println("Qual a nota 1?");
        nota1 = entrada.nextDouble();

        System.out.println("Qual a nota 2?");
        nota2 = entrada.nextDouble();

        System.out.println("Sua média é " + ((nota1 + nota2) / 2));

        entrada.close();
    }
}

package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner  entrada = new Scanner(System.in);
        double salario;

        System.out.println("Qual o seu salário?");
        salario = entrada.nextDouble();

        System.out.println("Seu salário reajustado é " + salario * 1.25);
        entrada.close();
    }
}

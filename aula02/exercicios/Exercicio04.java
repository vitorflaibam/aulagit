package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salminimo, valorKw, valortotal, valorDesc;
        int quilowatts;

        System.out.println("Qual o valor do salário mínimo atual?");
        salminimo = entrada.nextDouble();

        System.out.println("Qual a quantidade de quilowatts consumida?");
        quilowatts = entrada.nextInt();

        // processamento
        // System.out.println("Cada quilowatt custa " + salminimo / 500 + ", totalizando R$" + (quilowatts /500) * salminimo);
        valorKw = salminimo / 500;
        valortotal = valorKw * quilowatts;
        valorDesc = valortotal * 0.85;

        // saida
        System.out.printf(" Valor por KW: R$ %.2f\n", valorKw);
        System.out.printf(" Valor a ser pago: R$ %.2f\n", valortotal);
        System.out.printf(" Valor com desconto: R$ %.2f\n", valorDesc);


        entrada.close();
    }
}

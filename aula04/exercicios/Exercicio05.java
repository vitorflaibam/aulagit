package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, pares = 0;

        for (int i = 1; i <= 10; i++) {
        System.out.printf("Digite o %dº número: ", i);
        numero = entrada.nextInt();

        if (numero % 2 == 0){
            pares++;
        }
    }
        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de impares é: " + (10 - pares));

        entrada.close();
        }
    }

package exercicios;

import java.util.Scanner;

public class Teste01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float n1, n2;

        System.out.println("Digite os números");
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();

        if (n1 > n2){
            System.out.printf("O maior número é: %.1f e o menor é %.1f", n1, n2);
        } else {
            System.out.printf("O maior número é: %.1f e o menor é %.1f", n2, n1);
        }

        entrada.close();
    }
}

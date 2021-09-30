package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double a, b, c;

        System.out.println("Digite o comprimento do lado A:");
        a = entrada.nextDouble();
        System.out.println("Digite o comprimento do lado B:");
        b = entrada.nextDouble();
        System.out.println("Digite o comprimento do lado C:");
        c = entrada.nextDouble();

        if (a > b+c){
            System.out.println("Não forma um triângulo");
        } else {
            if (c > b+a){
                System.out.println("Não forma um triângulo");
            } else {
                if (b > c+a){
                System.out.println("Não forma um triângulo.");
            }
        }
    
        if (a == b && a == c){
        System.out.println("Trnângulo equilátero");
        } else {
            if (a == b || b == c || a == c){
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Trângulo escaleno");
            }
        }
    }

        entrada.close();
    }
}

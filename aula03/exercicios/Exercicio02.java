package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite a nota 1");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a nota 2");
        nota2 = entrada.nextDouble();

        media = (nota1 * 0.6) + (nota2 * 0.4);

        if(media >=6){
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        System.out.println("Sua média é " + media);

        entrada.close();
    }
}

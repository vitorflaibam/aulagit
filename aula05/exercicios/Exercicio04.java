package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[10];
        double media;
        int qtdMaiorMedia;

        media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite aqui as notas:");
            notas[i] = entrada.nextDouble();
        }

        System.out.println("As notas são:");

        for (int i = 0; i < notas.length; i++) {
            System.out.printf(notas[i] + " ");

            media = media + notas[i];
        }
        media = media / notas.length;

        System.out.printf("\nmédia da turma é: %.1f", media);

        // ate aqui consegui fazer sozinho
        System.out.println("\nNotas maiores que a média:");
        qtdMaiorMedia = 0;
        for (int i = 0; i > media; i++) {
            if (notas[i] > media) {
                System.out.printf(notas[i] + " ");
                qtdMaiorMedia++;
            }
        }
        System.out.println("Quantidade de notas acima da média" + qtdMaiorMedia);
        entrada.close();

    }

}

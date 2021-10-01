package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroDigitado, multiplicador, resultado;

        System.out.println("Digite o número:");
        numeroDigitado = entrada.nextInt();
        multiplicador = 0;


        while (multiplicador <= 10)
        {
            resultado = numeroDigitado * multiplicador;
            System.out.println(numeroDigitado + " x " + multiplicador + " = " + resultado);
            multiplicador++;
          
            entrada.close();
        }
    }
}

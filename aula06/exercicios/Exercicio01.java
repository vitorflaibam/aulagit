package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero inteiro");
        numero = entrada.nextInt();
        entrada.close();

        if(ehPar(numero)){
            System.out.println(numero + " é par");
        } else{
            System.out.println(numero + " é impar");
        }
    }

    static boolean ehPar(int numero){
            return (numero % 2 == 0);
        }

/*     static boolean ehPar(int numero){
        if(numero % 2 == 0){
            return true;
        } // else está implicito
            return false;
        } */

    }

/*
 * int retorno; retorno = numero(10); System.out.println("a");
 * 
 * }
 * 
 * static int numero (int n1) { if (n1 % 2 == 0){
 * System.out.println("Número par"); } else { System.out.println("Númro impar");
 * } return resultado; } }
 */
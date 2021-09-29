package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float num1, num2;

        System.out.println("Digite o primeiro número:");
        num1 = entrada.nextFloat();

        System.out.println("Digite o segundo número:");
        num2 = entrada.nextFloat();

        if(num1 >= num2){
            System.out.println("Os números digitados são: " + num1 + " e " + num2);
        }else{
            System.out.println("Os números digitados são: " + num2 + " e " + num1);
        }


        entrada.close();
    }
}

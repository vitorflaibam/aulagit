package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario;

        System.out.println("Qual o seu salário?");
        salario = teclado.nextDouble();

        if (salario <= 600) {
            System.out.println("Você é insento de desconto");
        } else {
            if (salario <= 1200) {
            System.out.println("Você tem 20% de desconto no salário");
            } else {
              if (salario <= 2000){
            System.out.println("Você tem 25% de desconto no salário");
                } else {
            System.out.println("Você tem 30% de desconto no salário");
        }
    }
}
        
        teclado.close();
    }
}

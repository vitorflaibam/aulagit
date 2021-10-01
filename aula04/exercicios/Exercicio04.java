package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numerodig, totalNum, cont = 1;
        numerodig = 1;
        totalNum = 0;

        while (numerodig != 0){
             System.out.printf("Digite o %dº número: ", cont++);
            numerodig = entrada.nextInt();
            totalNum += numerodig; // totalnum = totalnum + numerodig;
        }
            System.out.println("A soma dos valoress é: " +  totalNum);
           
        entrada.close();
        }

    }


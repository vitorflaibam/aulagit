package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroLimite, cont;

        System.out.println("Informe o limite:");
        numeroLimite = entrada.nextInt();

        cont = 1;

        while(cont <= numeroLimite){
            if (cont == 1) {
                System.out.print(cont);
                cont = cont + cont;
               }
    
            System.out.print( ", " + cont);
            cont = cont * 2;
            // ou cont *= 2;

        }



        /*
        System.out.println("Digite o número:");
        numeroLimite = entrada.nextInt();

        while (numeroLimite <= numeroLimite){
            System.out.print("a sequência é: " );
            numeroLimite += numeroLimite * 2;
        
        }
        
        
        
        
        */
        entrada.close();
    }
}

package uri;

import java.util.Scanner;

public class uri1035 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A, B, C, D, somacd, somaab;

        System.out.println("digite");
        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();
        D = entrada.nextInt();

        somacd = C + D;
        somaab = A + B;

        if (B > C && D > A && somacd > somaab && C > 0 && D > 0 &&  A % 2 == 0) {
         
                 System.out.println("Valores aceitos");
                    
        } else {
            System.out.println("Valores nao aceitos");
        }
        entrada.close();
    }
}
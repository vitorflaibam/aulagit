package Uri;

import java.util.Scanner;

public class uri1004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int a, b, prod;

        a = entrada.nextInt();
        b = entrada.nextInt();
        prod = a + b;

        System.out.printf("PROD %f", prod);
        
        entrada.close();
    }
}

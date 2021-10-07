package uri;

import java.util.Scanner;

public class uri1117 {
    public static void main(String[] args) {
/*             Scanner teclado = new Scanner(System.in);
            double input, cont, media;
            cont = 0;
            media = 0;
            while (cont != 2) {
                System.out.println("dushsauh");
                input = teclado.nextDouble();
                if (input >= 0 && input <= 10) {
                    cont++;
                    media += input;
                } else {
                    System.out.println("nota invalida");
                }
            }
            System.out.printf("media = %.2f\n", (media / cont));
            teclado.close();
        }
    } */
         Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;
        

        System.out.println("sdishaj");
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();

        media = (nota1 + nota2) / 2;
        
        

        while (media < 0 && media > 10) {
                System.out.println("nota invalida");
            } 
        { 
            System.out.println("media = " + media);

        
    }
        entrada.close();
    }

} 

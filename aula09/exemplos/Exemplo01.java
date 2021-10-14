package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        try {
            System.out.println("Digite um numero inteiro:");
            // numero = teclado.nextInt();
            numero = Integer.parseInt(teclado.nextLine());
            System.out.println("Você digitou " + numero);

        } catch (InputMismatchException ex) {
            System.out.println("Erro de digitação");
        } catch (NumberFormatException ex) {
            System.out.println("Erro de digitação");
            System.out.println(ex.getMessage());
        } finally {

            System.out.println("Fim do programa.");
            teclado.close();
        }
    }
}
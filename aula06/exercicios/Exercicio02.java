package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {


        System.out.println(menor(3, 1, 2));

    }

    static int menor(int n1, int n2, int n3) {
        if (n1 <= n2 && n2 <= n3) {
            return n1;
        } else {
            if (n2 <= n1 && n1 <= n3) {
                return n2;
            } else {
                return n3;
            }
        }
    }
}

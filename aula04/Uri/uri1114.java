package uri;

import java.util.Scanner;

public class uri1114 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha;
        boolean senhaCerta;

        System.out.println("digite a senha");
        senha = entrada.nextLine();

        senhaCerta = senha.equals("2002");

        while (senhaCerta =! senhaCerta) 
        {
            System.out.println("Senha Invalida");
        } 
        
            System.out.println("Acesso Permitido");
        

        entrada.close();
    }
}

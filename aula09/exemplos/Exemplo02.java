package exemplos;

import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(5);
        lista.add(7);
        lista.add(9);

        // System.out.println(lista);
      /*   for (int i = 0; i < lista.size(); i++) { //size é a qtdd de intens na lista
            System.out.println(lista.get(i)); // pega um elemento no indice "i"
            
        } */
        for (Integer item : lista) {// para cada item do tipo integer da lista, faça:
            System.out.println(item);
        }

    }
}

package clase4a;

import org.apache.log4j.Logger;

import java.util.ArrayList;

public class Demo {
    private static final Logger LOGGER = Logger.getLogger(Demo.class);

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);
        lista.add(11);
        listaPromedio(lista);
    }

    public static void listaPromedio(ArrayList<Integer> lista) {
        if (lista.size() > 10) {
            LOGGER.info("La lista tiene más de 10 elementos");
        } else if (lista.size() > 5) {
            LOGGER.info("La lista tiene más de 5 elementos");
        } else if (lista.size() > 0) {
            LOGGER.info("La lista tiene 5 o menos elementos");
        } else {
            LOGGER.info("La lista está vacía");
            return;
        }

        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i);
        }
        LOGGER.info("El promedio es: " + suma / lista.size());
    }
}

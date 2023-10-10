
package ejercicio1_3_1;

import ejercicio1_3_1.DataMakers.GeneraDatos;
import ejercicio1_3_1.DataMakers.ImplementaMinimoMaximo;

public class Ejercicio1_3_1 {

    public static void main(String[] args) {
        GeneraDatos generador = new GeneraDatos();
        ImplementaMinimoMaximo<Integer> implementacionEnteros = new ImplementaMinimoMaximo<>(generador);
        ImplementaMinimoMaximo<Character> implementacionCaracteres = new ImplementaMinimoMaximo<>(generador);
        ImplementaMinimoMaximo<String> implementacionCadenas = new ImplementaMinimoMaximo<>(generador);

        // Generar tres arrays con 9 valores enteros aleatorios
        Integer[] enteros = new Integer[9];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = generador.generarCadena(1).charAt(0) - 'a' + 1; // Convertir caracteres aleatorios a enteros
        }

        // Generar tres arrays con 9 caracteres aleatorios
        Character[] caracteres = new Character[9];
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = generador.generarArrayCaracteres(1)[0];
        }

        // Generar tres arrays con 9 cadenas aleatorias de 3 caracteres cada una
        String[] cadenas = new String[9];
        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = generador.generarCadena(3);
        }

        // Calcular máximos y mínimos para enteros, caracteres y cadenas
        Integer maximoEnteros = implementacionEnteros.maximo(enteros);
        Integer minimoEnteros = implementacionEnteros.minimo(enteros);

        Character maximoCaracteres = implementacionCaracteres.maximo(caracteres);
        Character minimoCaracteres = implementacionCaracteres.minimo(caracteres);

        String maximoCadenas = implementacionCadenas.maximo(cadenas);
        String minimoCadenas = implementacionCadenas.minimo(cadenas);

        // Mostrar resultados
        System.out.println("Valores enteros: " + java.util.Arrays.toString(enteros));
        System.out.println("Máximo de enteros: " + maximoEnteros);
        System.out.println("Mínimo de enteros: " + minimoEnteros);

        System.out.println("Caracteres: " + java.util.Arrays.toString(caracteres));
        System.out.println("Máximo de caracteres: " + maximoCaracteres);
        System.out.println("Mínimo de caracteres: " + minimoCaracteres);

        System.out.println("Cadenas: " + java.util.Arrays.toString(cadenas));
        System.out.println("Máximo de cadenas: " + maximoCadenas);
        System.out.println("Mínimo de cadenas: " + minimoCadenas);
    }

}

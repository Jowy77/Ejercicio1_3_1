package ejercicio1_3_1.DataMakers;

import ejercicio1_3_1.interfaces.MinimoMaximo;

public class ImplementaMinimoMaximo<T extends Comparable<T>> implements MinimoMaximo<T> {
    private GeneraDatos generador;

    public ImplementaMinimoMaximo(GeneraDatos generador) {
        this.generador = generador;
    }

    public T maximo(T[] array) {
        T maximo = array[0];
        for (T elemento : array) {
            if (elemento.compareTo(maximo) > 0) {
                maximo = elemento;
            }
        }
        return maximo;
    }

    public T minimo(T[] array) {
        T minimo = array[0];
        for (T elemento : array) {
            if (elemento.compareTo(minimo) < 0) {
                minimo = elemento;
            }
        }
        return minimo;
    }
}
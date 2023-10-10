package ejercicio1_3_1.interfaces;

public interface MinimoMaximo<T extends Comparable<T>> {

    T minimo(T[] array);

    T maximo(T[] array);
}

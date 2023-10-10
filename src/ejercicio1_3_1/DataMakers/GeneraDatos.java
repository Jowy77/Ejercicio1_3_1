package ejercicio1_3_1.DataMakers;

import java.security.SecureRandom;

public class GeneraDatos {

    private SecureRandom secureRandom;

    public GeneraDatos() {
        secureRandom = new SecureRandom();
    }

    // Método para generar una secuencia de bytes aleatorios de longitud dada
    public byte[] generarSecuenciaBytes(int longitud) {
        byte[] bytes = new byte[longitud];
        secureRandom.nextBytes(bytes);
        return bytes;
    }

    // Método para generar un array de caracteres aleatorios de longitud dada
    public char[] generarArrayCaracteres(int longitud) {
        char[] caracteres = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            caracteres[i] = (char) (secureRandom.nextInt(26) + 'a'); // Genera caracteres minúsculos aleatorios
        }
        return caracteres;
    }
    
    // Método para generar una cadena de caracteres aleatorios de longitud dada
    public String generarCadena(int longitud) {
        char[] caracteres = generarArrayCaracteres(longitud);
        return new String(caracteres);
    }

}

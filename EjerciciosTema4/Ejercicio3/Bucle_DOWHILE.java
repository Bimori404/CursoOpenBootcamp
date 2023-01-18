/*
Deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
 */
package EjerciciosTema4.Ejercicio3;

public class Bucle_DOWHILE {
    public static void main(String[] args) {
        int numeroWhile = 2;
        
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 100);
       
    }
}

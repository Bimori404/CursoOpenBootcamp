/*
Crea un bucle While, este bucle tendrá que tener como condición que la
variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
- Incrementar el valor de la variable en uno cada vez que se ejecute.

- **ESTO NO LO ENTENDI**Mostrarlo por pantalla cada vez que se ejecute.
*/
package EjerciciosTema4.Ejercicio2;

public class Bucle_WHILE {
    public static void main(String[] args) {
        int numeroWhile = 2;
        
        while( numeroWhile < 100) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
    }
}

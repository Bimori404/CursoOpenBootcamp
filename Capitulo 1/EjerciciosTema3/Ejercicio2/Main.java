/*
Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.
*/
package EjerciciosTema3.Ejercicio2;

public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche(); // Mandamos llamar a la clase mediante el objeto "miCoche"
        miCoche.numPuertas = 4; 
        miCoche.aumentarNumPuertas(); // Llamamos a la función
        System.out.println("El coche tiene " + miCoche.numPuertas + " puertas."); // imprimimos el resultado
    }  

}

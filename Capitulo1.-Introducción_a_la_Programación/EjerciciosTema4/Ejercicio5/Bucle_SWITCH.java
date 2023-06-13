/*
Para el Switch, deberás crear la variable estacion, y distintos case para las cuatro
estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un
mensaje por consola informando de la estación en la que está.

También habrá que poner un default para cuando el valor de la variable no sea una estación.
 */
package EjerciciosTema4.Ejercicio5;

public class Bucle_SWITCH {
    public static void main(String[] args) {
        String estacion = "Otonio";
        
        switch( estacion ) {
            case "Primavera":
                System.out.println("Primavera");
                break;
            case "Verano":
                System.out.println("Verano");
                break;
            case "Otonio":
                System.out.println("Otoño");
                break;
            case "Invierno":
                System.out.println("Invierno");
                break;
            default:
                System.out.println("Eso no es una estacion del año");
                break;
        }
    }
}

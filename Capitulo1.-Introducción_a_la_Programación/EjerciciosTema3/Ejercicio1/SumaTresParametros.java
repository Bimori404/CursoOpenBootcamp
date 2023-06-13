/*
Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores.
*/
package EjerciciosTema3.Ejercicio1;

public class SumaTresParametros {

    public static void main(String[] args) {
        sumarNumeros(2, 3, 5); //Llamamos a la función para darle valores
    }
    
    //Creamos la funcion y la inicializamos
    public static void sumarNumeros(int num1, int num2, int num3) {
        int resultado = num1 + num2 + num3; // metemos los valores en la variable que vamos a utilizar
        System.out.println("La suma de los tres números es: " + resultado); // imprimimos el resultado
    }
}

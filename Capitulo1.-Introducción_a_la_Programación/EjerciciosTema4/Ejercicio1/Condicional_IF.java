/*
Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
*/
package EjerciciosTema4.Ejercicio1;

public class Condicional_IF {
    public static void main(String[] args) {
        
        int numeroIf = 0;
        System.out.println(numeroIf +" es "+ PosNegCero(numeroIf));
        
    }
    
    public static String PosNegCero(int numeroIf) {
        
        if (numeroIf>0)
            return "un numero positivo";
        
        else if (numeroIf<0)
            return "un numero negativo";
        
        else
            return "es igual a 0";
        
    }
}

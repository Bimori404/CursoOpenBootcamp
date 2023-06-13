/*
 Crea una clase Persona con las siguientes variables:
 La edad
 El nombre
 El teléfono

 Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, 
 esta nueva clase tendrá la variable credito solo para esa clase.

 Crea ahora un objeto de la clase Cliente que debe tener como propiedades la
 edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

 Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
 y con una variable salario que solo tenga la clase Trabajador.
 */
public class Main {

    public static void main(String[] args) {
        // Crear un objeto Cliente
        Cliente cliente = new Cliente(30, "Juan", "123456789", 500.0);
        System.out.println("Cliente:");
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());

        System.out.println();

        // Crear un objeto Trabajador
        Trabajador trabajador = new Trabajador(25, "Pedro", "987654321", 2000.0);
        System.out.println("Trabajador:");
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}

// Clase Personas
class Persona {

    private int edad;
    private String nombre;
    private String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

// Clase Cliente que hereda de Persona
class Cliente extends Persona {

    private double credito;

    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

// Clase Trabajador que hereda de Persona
class Trabajador extends Persona {

    private double salario;

    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

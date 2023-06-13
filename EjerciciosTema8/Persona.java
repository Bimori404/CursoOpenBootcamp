public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    // Constructor
    public Persona() {
        // Puedes inicializar las propiedades aquí si lo deseas
    }

    // Métodos getter y setter para la propiedad "edad"
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Métodos getter y setter para la propiedad "nombre"
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para la propiedad "telefono"
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona = new Persona();

        // Establecer valores utilizando los métodos setter
        persona.setEdad(25);
        persona.setNombre("Juan");
        persona.setTelefono("123456789");

        // Obtener valores utilizando los métodos getter y mostrarlos por consola
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Teléfono: " + persona.getTelefono());
    }
}

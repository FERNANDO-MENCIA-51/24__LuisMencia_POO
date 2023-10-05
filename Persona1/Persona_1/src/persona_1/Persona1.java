
package persona_1;


public class Persona1 {
    private final String nombre;
    private int añoNacimiento;
    private final int anoNacimiento;

    // inicializar el nombre y año de nacimiento.
    public Persona1(String nombre, int anoNacimiento) {
        this.nombre = nombre;
        this.anoNacimiento = anoNacimiento;
    }

    // Método para saludar a la persona.
    public void saludar() {
        System.out.println("¡Hola, soy " + nombre + "!");
    }

    // Método para calcular la edad de la persona.
    public int calcularEdad(int anoActual) {
        int edad = anoActual - añoNacimiento;
        return edad;
    }

    public static void main(String[] args) {
        // Crear una instancia de Persona1
        Persona1 persona = new Persona1("Juan", 1990);

        // Llamar al método "saludar"
        persona.saludar();

        // Llamar al método "calcularEdad" con el año actual como parámetro
        int edad = persona.calcularEdad(2023);
        System.out.println("Tengo " + edad + " años.");
    }
}


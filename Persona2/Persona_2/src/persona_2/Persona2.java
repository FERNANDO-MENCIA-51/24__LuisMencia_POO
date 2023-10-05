/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona_2;

/**
 *
 * @author FERNANDO
 */
public class Persona2 {
    private final String nombre;
    private final int edad;

    // Constructor para inicializar el nombre y la edad.
    public Persona2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener el nombre de la persona.
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la edad de la persona.
    public int getEdad() {
        return edad;
    }
}

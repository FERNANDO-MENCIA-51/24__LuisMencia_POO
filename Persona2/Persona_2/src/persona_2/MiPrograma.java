/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona_2;

public class MiPrograma {
    public static void main(String[] args) {
        // Crear una instancia de Persona2
        Persona2 persona = new Persona2("Ana", 25);

        // Obtener el nombre de la persona
        String nombre = persona.getNombre();
        System.out.println("Nombre: " + nombre);

        // Obtener la edad de la persona
        int edad = persona.getEdad();
        System.out.println("Edad: " + edad);
    }
}



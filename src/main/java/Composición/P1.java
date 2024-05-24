/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Composición;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarPersona() {
        System.out.println("nombre = " + nombre + " edad = " + edad);
    }
}

class Curso {
    private String grupo;
    private Persona persona;

    public Curso(String grupo, Persona persona) {
        this.grupo = grupo;
        this.persona = persona;
    }

    public void info() {
        persona.mostrarPersona();
        System.out.println("grupo = " + grupo);
    }
}

public class P1 {

    public static void main(String[] args) {
        Persona personaje = new Persona("Daza", 23);
        Curso p1 = new Curso("p1", personaje);
        p1.info();
    }
}

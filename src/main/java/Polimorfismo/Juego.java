/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author camper
 */
public class Juego {
    public String nombre;
    public int precio;
    public int año;
    public String genero;
    
    public Juego(String nombre, int precio, int año, String genero){
        this.nombre = nombre;
        this.precio = precio;
        this.año = año;
        this.genero = genero;
    }
    
    public void mostrarDetalles() {
        System.out.println("Juego: " + nombre + ", Precio: " + precio + ", Año: " + año + ", Género: " + genero);
    }
    
    public static class frikiti extends Juego{
        public frikiti(String nombre, int precio, int año, String genero){
            super(nombre, precio, año, genero);
        }
        
        @Override
        public void mostrarDetalles() {
            System.out.println("Detalles específicos de frikiti:");
            super.mostrarDetalles();
        }
    }
    
    public static class amogus extends Juego{
        public amogus(String nombre, int precio, int año, String genero){
            super(nombre, precio, año, genero);
        }
        
        @Override
        public void mostrarDetalles() {
            System.out.println("Detalles específicos de amogus:");
            super.mostrarDetalles();
        }
    }
    
    public static void main(String[] args) {
        Juego.frikiti frikiti = new Juego.frikiti("Free", 100000, 2014, "battle royale");
        Juego.amogus amogus = new Juego.amogus("Impostor", 50000, 2018, "impostor");
        
        frikiti.mostrarDetalles();
        amogus.mostrarDetalles();
    }
}


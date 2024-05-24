/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Abstracción;

abstract class Dinosaurios {
    protected String especie;
    protected String color;
    protected int antiguedad;

    public Dinosaurios(String especie, String color, int antiguedad){
        this.especie = especie;
        this.color = color;
        this.antiguedad = antiguedad;
    }

    public abstract void mostrarDatos();   
}

class Trex extends Dinosaurios {
    public Trex(String especie, String color, int antiguedad){
        super(especie, color, antiguedad);   
    }

    @Override
    public void mostrarDatos(){
        System.out.println("especie = " + especie + " color = " + color + " antiguedad = " + antiguedad);
    }
}

class Diplodocus extends Dinosaurios {
    public Diplodocus(String especie, String color, int antiguedad){
        super(especie, color, antiguedad);        
    }

    @Override
    public void mostrarDatos(){
        System.out.println("especie = " + especie + " color = " + color + " antiguedad = " + antiguedad);
    }
}

public class Principal {
    public static void main(String[] args) {
        Dinosaurios trex = new Trex("T-rex", "Rosa", 500000000);
        Dinosaurios diplodocus = new Diplodocus("Diplodocus", "Rojo Fosforescente", 500000000);
        diplodocus.mostrarDatos();
        trex.mostrarDatos();
    }
}

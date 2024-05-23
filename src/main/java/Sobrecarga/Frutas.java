/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sobrecarga;

/**
 *
 * @author camper
 */
public class Frutas {

    public static void fruta(String nombre){
        System.out.println(String.format("Mi fruta favorita es %s", nombre));
    }
    public static void fruta(String nombre, int semillas){
        System.out.println(String.format("Mi fruta favorita es %s y tiene %d semillas", nombre, semillas));
    }
    
    
    
    public static void main(String[] args) {
        fruta("Tomato");
        fruta("Tomato", 20);
    }
    
}

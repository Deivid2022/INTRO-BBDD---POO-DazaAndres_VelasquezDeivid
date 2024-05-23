/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.andres_daza_deivid_velasquez;

/**
 *
 * @author camper
 */
public class Animal {
    public String especie;
    public String raza;
    public String color;
    public int Npatas;
    
    public Animal(String especie, String raza, String color, int Npatas){
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.Npatas = Npatas;
    }
    
    public static class Perro extends Animal{
        public Perro(String especie, String raza, String color, int Npatas){
            super(especie, raza, color, Npatas);
        }
    }
    
    @Override
    public String toString(){
        return "Animal{" + "Especie = " + especie + " Raza = " + raza + " Color = " + color + " Numero de patas = " + Npatas + "}";
    }
    
}

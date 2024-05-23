/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encapsulamiento;

/**
 *
 * @author camper
 */
public class Libro {

    //Atributos 
    private String nombre;
    private String genero;
    private int paginas;
    
    public Libro(String nombre, String genero, int paginas){
        this.nombre = nombre;
        this.genero = genero;
        this.paginas = paginas;
    }
    
    public String getName(){
        return nombre;
    }
    
    public void setName(String nombre){
        this.nombre = nombre;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public int getPaginas(){
        return paginas;
    }
    
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
    
    
    
    public static void main(String[] args) {
        Libro libro = new Libro("100 años de soledad", "Drama", 300);
        
        //Acceder a los datos
        System.out.println("Nombre " + libro.getName());
        System.out.println("Genero " + libro.getGenero());
        System.out.println("Paginas " + libro.getPaginas());
        
        //Modificar los datos
        libro.setPaginas(250);
        System.out.println("Nueva version " + libro.getPaginas());
    }
    
}

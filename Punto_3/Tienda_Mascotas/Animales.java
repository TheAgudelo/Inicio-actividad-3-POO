package Punto_3.Tienda_Mascotas;

public class Animales {
   protected String nombre, color;
   protected int edad;
   Animales(String nombre, int edad, String color) { 
     this.nombre = nombre; 
     this.edad = edad; 
     this.color = color; 
    }
    void imprimir() { 
        System.out.println("Nombre: " + nombre); 
        System.out.println("Edad: " + edad); 
        System.out.println("Color: " + color); 
    }
    
}

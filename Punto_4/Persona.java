package Punto_4;

public class Persona {
    String nombre, direccion;

    Persona(String nombre, String direccion) { 
        this.nombre = nombre; 
        this.direccion = direccion; 
    }

    String nombre() {
        return nombre;
    }

    String direccion() {
        return direccion;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
}

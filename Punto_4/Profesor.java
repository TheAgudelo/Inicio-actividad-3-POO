package Punto_4;

public class Profesor extends Persona{
    String departamento, categoria;

    Profesor(String nombre, String direccion, String departamento, String categoria) { 
        super(nombre, direccion);
        this.departamento=departamento;
        this.categoria=categoria;
    }

    String categoria() {
        return categoria;
    }

    String departamento() {
        return departamento;
    }

    void setcategoria(String categoria) {
        this.categoria = categoria;
    }

    void setSdepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}

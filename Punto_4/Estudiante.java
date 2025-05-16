package Punto_4;

public class Estudiante extends Persona{
    int semestre;
    String carrera;


    Estudiante(String nombre, String direccion, String carrera, int semestre) { 
        super(nombre, direccion);
        this.semestre=semestre;
        this.carrera=carrera;
    }

    String carrera() {
        return carrera;
    }

    int semestre() {
        return semestre;
    }

    void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    void setSemestre(int semestre) {
        this.semestre = semestre;
    }


    
    
}

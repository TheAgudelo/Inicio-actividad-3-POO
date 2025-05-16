package Punto_4;

public class PruebaEjercicio {
    public static void main(String[] args) {
        Profesor Persona1 = new Profesor("Robert", "Avenida Santander 45-45", "Ciencias", "Coordinador");
        System.out.println("nombre: " + Persona1.nombre);
        System.out.println("direccion: " + Persona1.direccion);
        System.out.println("departamento: " + Persona1.departamento);
        System.out.println("categoria: " + Persona1.categoria);
        Persona1.setNombre("Rigoberto");
        System.out.println("nuevo nombre: " + Persona1.nombre);
        System.out.println();
        Estudiante Persona2 = new Estudiante("Juan", "Calle 45A Carrera 67 int 320", "Ingenieria computacional", 2);
        System.out.println("nombre: " + Persona2.nombre);
        System.out.println("direccion: " + Persona2.direccion);
        System.out.println("carrera: " + Persona2.carrera);
        System.out.println("semestre: " + Persona2.semestre);
        Persona2.setSemestre(8);
        System.out.println("nuevo semestre: " + Persona2.semestre);
    }
    
}

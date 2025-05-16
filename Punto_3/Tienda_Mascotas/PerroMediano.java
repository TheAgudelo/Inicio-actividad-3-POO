package Punto_3.Tienda_Mascotas;

public class PerroMediano extends Perro{
    enum tipo {COLLIE, DALMATA,BULLDOG,GALGO,SABUESO}
    protected tipo raza;
    public PerroMediano(String nombre,int edad, String color,  boolean muerde,int peso, tipo raza) {
        super(nombre,edad, color,  muerde, peso);
        this.raza = raza;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Raza: " + raza); 
        System.out.println(); 

    }
    
}

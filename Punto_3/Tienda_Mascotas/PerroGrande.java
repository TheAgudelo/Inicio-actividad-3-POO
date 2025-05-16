package Punto_3.Tienda_Mascotas;

public class PerroGrande extends Perro{
    enum tipo {PASTOR_ALEMAN, DOBERMAN,ROTWEILLER}
    protected  tipo raza;
    public PerroGrande(String nombre,int edad, String color,  boolean muerde,int peso, tipo raza) {
        super(nombre, edad, color, muerde, peso);
        this.raza = raza;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Raza: " + raza); 
        System.out.println(); 

    }

}
    
    


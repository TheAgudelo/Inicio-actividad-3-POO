package Punto_3.Tienda_Mascotas;

public class Gato extends Animales{
    protected float alturaSa, longitudSa;

    public Gato(String nombre,int edad, String color,  float longitudSa,float alturaSa ) {
        super(nombre, edad, color); 
        this.alturaSa = alturaSa;
        this.longitudSa = longitudSa;
    }

    void sonido(){
        System.out.println("Sonido: Los gatos maúllan y ronronean");
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Altura de salto: " + alturaSa); 
        System.out.println("Longitud de salto: " + longitudSa); 

    }

    
}

package Punto_3.Tienda_Mascotas;

public class GatoPeloLargo extends Gato{
    enum tipo {ANGORA, HIMALAYO,BALINES,SOMALI}
    protected tipo raza;

    public GatoPeloLargo(String nombre, int edad,String color, float longitudSa,float alturaSa, tipo raza) {
        super(nombre,edad, color, alturaSa,longitudSa); 
        this.raza = raza;
        
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Raza: " + raza); 
        System.out.println(); 

    }
    
}

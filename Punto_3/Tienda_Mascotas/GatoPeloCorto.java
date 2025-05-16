package Punto_3.Tienda_Mascotas;

public class GatoPeloCorto extends Gato{
    enum tipo {AZUL_RUSO, BRITANICO,MANX,DEVON_REX}
    protected tipo raza;

    public GatoPeloCorto(String nombre, int edad,String color, float longitudSa,float alturaSa, tipo raza) {
        super(nombre,edad, color, alturaSa,longitudSa); 
        this.raza = raza;
        
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Raza: " + raza); 
        System.out.println(); 

    }
    
}

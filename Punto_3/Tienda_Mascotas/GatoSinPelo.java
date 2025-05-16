package Punto_3.Tienda_Mascotas;

public class GatoSinPelo extends Gato{
    enum tipo {ESFINGE, ELFO,DONSKOY}
    protected tipo raza;

    public GatoSinPelo(String nombre, int edad,String color, float longitudSa,float alturaSa, tipo raza) {
        super(nombre,edad, color, alturaSa,longitudSa); 
        this.raza = raza;
        
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Raza: " + raza); 
        System.out.println(); 

    }
    
}

package Punto_3.Tienda_Mascotas;

public class PerroPequeno extends Perro{
    enum tipo {CANICHE, YORKSHIRE_TERRIER,SHCNAUZER,CHIHUAHUA}
    protected tipo raza;
    public PerroPequeno(String nombre, int edad, String color, boolean muerde,int peso, tipo raza) {
        super(nombre, edad,color,  muerde, peso);
        this.raza = raza;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Raza: " + raza); 
        System.out.println(); 

    }
    
}

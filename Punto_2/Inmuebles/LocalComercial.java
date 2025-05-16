package Punto_2.Inmuebles;

public class LocalComercial extends Local{
    protected static double valorArea = 3000000;
    protected String centroComercial;
    public LocalComercial(int IdInmoviliario, int area, String direccion, tipo tipoLocal, String centroComercial) {
        super(IdInmoviliario, area, direccion,tipoLocal); 
        this.centroComercial = centroComercial;
    }

    void imprimir() { 
        super.imprimir(); 
        System.out.println("Centro comercial = " + centroComercial); 
        System.out.println(); 
    }
    
}

package Punto_2.Inmuebles;

public class Local extends Inmuebles{
    enum tipo {INTERNO,CALLE};
    protected tipo tipoLocal; 

    public Local(int IdInmoviliario, int area, String direccion, tipo tipoLocal) {
        super(IdInmoviliario, area, direccion); 
        this.tipoLocal = tipoLocal;
    }

    void imprimir() { 
        super.imprimir(); 
        System.out.println("Tipo de local = " + tipoLocal); 
    }
    
}

package Punto_2.Inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana{
    protected static double valorArea = 2500000;
    protected int valorAdministracion;
    protected boolean tienePiscina, tieneCamposDeportivos;

    public CasaConjuntoCerrado(int IdInmoviliario, int area, String direccion, int NHabitaciones, int NBanos, int NPisos, int valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos) {
        super(IdInmoviliario, area, direccion, NHabitaciones, NBanos, NPisos); 
        this.valorAdministracion = valorAdministracion; 
        this.tienePiscina = tienePiscina; 
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }
    void imprimir() { 
        super.imprimir(); 
        System.out.println("Valor de la administración = " + valorAdministracion); 
        System.out.println("Tiene piscina? = " + tienePiscina); 
        System.out.println("Tiene campos deportivos? = " + tieneCamposDeportivos); 
        System.out.println(); 
    }
    
}

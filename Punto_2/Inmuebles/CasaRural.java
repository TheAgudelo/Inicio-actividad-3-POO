package Punto_2.Inmuebles;

public class CasaRural extends Casa{
    protected static double valorArea = 1500000; 
    protected int DCabera, altitud;
    
    public CasaRural(int IdInmoviliario, int area, String direccion, int NHabitaciones, int NBanos, int NPisos, int DCabera, int altitud) { 
        // Invoca al constructor de la clase padre 
        super(IdInmoviliario, area, direccion, NHabitaciones, NBanos, NPisos); 
        this.DCabera = DCabera; 
        this.altitud = altitud; 
    }

    void imprimir() { 
        super.imprimir();  
        System.out.println("Distancia la cabecera municipal = " + NHabitaciones + " km."); 
        System.out.println("Altitud sobre el nivel del mar = " + altitud + " metros."); 
        System.out.println(); 
    }
}

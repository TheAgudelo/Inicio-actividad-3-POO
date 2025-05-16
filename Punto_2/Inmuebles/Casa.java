package Punto_2.Inmuebles;

public class Casa extends InmuebleVivienda{
    protected int NPisos;
    public Casa(int IdInmoviliario, int area, String direccion, int NHabitaciones, int NBanos, int NPisos) { 
        super(IdInmoviliario, area, direccion, NHabitaciones, NBanos); 
        this.NPisos = NPisos; 
    }

    void imprimir() { 
        super.imprimir(); 
        System.out.println("Número de pisos = " + NPisos); 
    }
    
}

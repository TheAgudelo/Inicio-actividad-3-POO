package Punto_2.Inmuebles;

public class Apartamento extends InmuebleVivienda  {
    public Apartamento(int IdInmoviliario, int area, String direccion, int NHabitaciones, int NBanos) {
        super(IdInmoviliario, area, direccion, NHabitaciones, NBanos); 
    }

    void imprimir() { 
        super.imprimir(); 
    }
    
}

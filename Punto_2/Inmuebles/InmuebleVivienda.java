package Punto_2.Inmuebles;


public class InmuebleVivienda extends Inmuebles {
    protected int NHabitaciones, NBanos;

    public InmuebleVivienda(int IdInmoviliario, int area, String direccion, int NHabitaciones, int NBanos) { 
        super(IdInmoviliario, area, direccion); 
        this.NHabitaciones = NHabitaciones; 
        this.NBanos = NBanos;
    }
    
    void imprimir() { 
        super.imprimir(); 
        System.out.println("Número de habitaciones = " + NHabitaciones); 
        System.out.println("Número de baños = " + NBanos); 
    }
}

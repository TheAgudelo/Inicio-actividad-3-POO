package Punto_2.Inmuebles;

public class ApartaEstudio extends Apartamento{
    protected static double valorArea = 1500000;

    public ApartaEstudio(int IdInmoviliario, int area, String direccion, int NHabitaciones, int NBanos) {
        super(IdInmoviliario, area, direccion, 1, 1); 
    }

    void imprimir() { 
        super.imprimir(); 
        System.out.println(); 
    }
    
}

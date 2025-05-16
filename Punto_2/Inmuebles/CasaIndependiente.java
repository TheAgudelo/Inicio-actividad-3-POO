package Punto_2.Inmuebles;

public class CasaIndependiente  extends CasaUrbana{
    protected static double valorArea = 3000000;

    public CasaIndependiente(int IdInmoviliario, int area, String direccion, int NHabitaciones, int NBanos, int NPisos) {
        super(IdInmoviliario, area, direccion, NHabitaciones, NBanos, NPisos);

    }

    void imprimir() { super.imprimir(); 
        System.out.println(); 
    }
}

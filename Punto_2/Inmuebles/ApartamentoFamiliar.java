package Punto_2.Inmuebles;

public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;
    protected int valorAdministracion;

    public ApartamentoFamiliar(int IdInmoviliario, int area, String direccion, int NHabitaciones, int NBanos, int valorAdministracion) { 
       
        super(IdInmoviliario, area, direccion, NHabitaciones, NBanos); 
        this.valorAdministracion = valorAdministracion; 
    }

    void imprimir() { 
        super.imprimir(); 
        System.out.println("Valor de la administración = $" + valorAdministracion);
        System.out.println(); 
    }
    
}

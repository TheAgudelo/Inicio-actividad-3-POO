package Punto_2.Inmuebles;


public class Inmuebles {
    protected int IdInmoviliario, area;
    protected String direccion;
    protected double precioVenta;

    Inmuebles(int IdInmoviliario, int area, String direccion) { 
        this.IdInmoviliario = IdInmoviliario; 
        this.area = area; 
        this.direccion = direccion; 
    }

    double calcularPrecioVenta(double valorArea) { 
        precioVenta = area * valorArea; 
        return precioVenta; 
    }

    void imprimir() { 
        System.out.println("Identificador inmobiliario = " + IdInmoviliario); 
        System.out.println("Area = " + area); 
        System.out.println("Dirección = " + direccion); 
        System.out.println("Precio de venta: $" + precioVenta); 
    }
    
}

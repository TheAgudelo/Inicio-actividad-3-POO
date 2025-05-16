package Punto_3.Tienda_Mascotas;

public class Perro extends Animales{
    protected int peso;
    protected boolean muerde;

    public Perro( String nombre, int edad,String color,  boolean muerde,int peso) {
        super(nombre, edad, color); 
        this.muerde = muerde;
        this.peso = peso;
    }

    void sonido(){
        System.out.println("Sonido: Los perros ladran");
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Peso: " + peso); 
        System.out.println("Muerde: " + muerde); 

    }
    
}

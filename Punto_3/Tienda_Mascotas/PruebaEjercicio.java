package Punto_3.Tienda_Mascotas;



public class PruebaEjercicio {
     public static void main(String args[]) { 
        PerroGrande animal1 = new PerroGrande("leon", 12, "Cafe", true, 25, PerroGrande.tipo.PASTOR_ALEMAN);
        System.out.println("Datos animal"); 
        animal1.sonido(); 
        animal1.imprimir(); 
        System.out.println("Datos animal"); 
        GatoSinPelo animal2 = new GatoSinPelo("Nicolae", 7, "blanco", 10, 030, GatoSinPelo.tipo.ELFO);
        animal2.sonido(); 
        animal2.imprimir();
    }
    
}

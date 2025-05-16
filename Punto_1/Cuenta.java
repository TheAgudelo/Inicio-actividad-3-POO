package Punto_1;
public class Cuenta {
    protected float saldo, tasaAnual, comisionM=0;
    protected int Nconsignaciones=0, Nretiros=0;


    public Cuenta(float saldo, float tasaAnual) { 
        this.saldo = saldo; 
        this.tasaAnual = tasaAnual; 
    }

    public void consignar(float cantidad) { 
        saldo = saldo + cantidad;   
        Nconsignaciones = Nconsignaciones + 1; 
        System.out.println("La consignacion se realizo con exito."); 
    }

    public void retirar(float cantidad) { float nuevoSaldo = saldo - cantidad;  
        if (nuevoSaldo >= 0) { 
            saldo -= cantidad; 
            Nretiros = Nretiros + 1; 
            System.out.println("Retiro hecho con exito."); 
        } else { 
            System.out.println("La cantida a retirar excede el saldo actual."); 
        } 
    }

 public void calcularInterés() { 
     float tasaMensual = tasaAnual / 12; 
     float interesMensual = saldo * tasaMensual; 
     saldo += interesMensual; 
    }
    public void extractoMensual() { 
        saldo -= comisionM; 
        calcularInterés(); 
    }
}

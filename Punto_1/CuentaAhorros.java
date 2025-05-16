package Punto_1;

public class CuentaAhorros extends Cuenta{
    protected boolean activa;

    public CuentaAhorros(float saldo, float tasa) { 
        super(saldo, tasa); 
        if (saldo < 10000) 
         activa = false; 
        else activa = true; 
    }

    public void retirar(float cantidad) { 
        if (activa) 
         super.retirar(cantidad); 
    }

    public void consignar(float cantidad) { 
        if (activa)
          super.consignar(cantidad);  
    }

    public void extractoMensual() { 
        if (Nretiros > 4) { 
            comisionM += (Nretiros - 4) * 1000; 
        } 
        super.extractoMensual(); 
        if ( saldo < 10000 ) 
            activa = false; 
    }

    public void imprimir() { 
        System.out.println("Saldo: $ " + saldo); 
        System.out.println("Comisión mensual:  $ " + comisionM); 
        System.out.println("Número de transacciones: " + (Nconsignaciones + Nretiros)); 
        System.out.println(); 
    }
}

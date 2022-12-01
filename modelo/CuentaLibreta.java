package modelo;

public class CuentaLibreta extends CuentaMadre {

    public CuentaLibreta(double fondos) {
            super(fondos);
            this.tasaInteres = 0.08;
    }

    @Override
    public void retiros(Integer Fondo) 
    {
            this.fondos = this.fondos - (Fondo + this.fondos * 0.02);
    }
}

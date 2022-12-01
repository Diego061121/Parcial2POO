package modelo;

public class CuentaAhorros extends CuentaMadre
{
    public CuentaAhorros(double fondos) 
    {
        super(fondos);
        this.tasaInteres = 0.04;
    }

    @Override
    public void retiros(Integer Fondo) 
    {
            this.fondos -= Fondo;
    }
}

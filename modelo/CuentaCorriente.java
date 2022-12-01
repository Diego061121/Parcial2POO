package modelo;

public class CuentaCorriente extends CuentaMadre
{
    public CuentaCorriente(double fondos) 
    {
        super(fondos);
        this.tasaInteres = 0.00;
    }

    @Override
    public void retiros(Integer Fondo) 
    {
        this.fondos -= Fondo;
    }

    public void pagar(Integer Fondo) 
    {
        this.fondos -= Fondo;
    }

    public double calcularIntereses() 
    {
        return this.fondos * this.tasaInteres;
    }
}

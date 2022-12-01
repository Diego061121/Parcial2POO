package modelo;

public abstract class CuentaMadre 
{
    protected double fondos;
    protected double tasaInteres;

    public CuentaMadre(double fondos) 
    {
        this.fondos = fondos;
        this.tasaInteres = 0.0;
    }

    public abstract void retiros(Integer Fondo);

    public void ingreso(Integer Fondo) 
    {
        this.fondos += Fondo;
    }

    public double calcIntereses() 
    {
        return this.fondos * this.tasaInteres;
    }

    public Double getFondos() 
    {
        return fondos;
    }

    public double getTasaInteres() 
    {
        return tasaInteres;
    }

    public void setFondos(double fondos) 
    {
        this.fondos = fondos;
    }

    @Override
    public String toString() 
    {
        return "Fondos: " + this.fondos + "\nInteres: " + this.tasaInteres + "\nIntereses: " + calcIntereses();
    }
}

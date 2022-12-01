package modelo;

import java.util.ArrayList;

public class Banco 
{
    private ArrayList<CuentaMadre> Cuenta;

    public Banco(ArrayList<CuentaMadre> Cuenta) 
    {
        this.Cuenta = Cuenta;
    }

    public Banco() 
    {
        this.Cuenta = new ArrayList<>();
    }

    public ArrayList<CuentaMadre> getCuenta() 
    {
        return Cuenta;
    }

    public void agregarCuenta(CuentaMadre cuenta) 
    {
        this.Cuenta.add(cuenta);
    }

    public void setCuentasBancarias(ArrayList<CuentaMadre> Cuenta) 
    {
        this.Cuenta = Cuenta;
    }
}
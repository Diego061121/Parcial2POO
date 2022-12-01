package controlador;

import modelo.Banco;
import modelo.CuentaAhorros;
import modelo.CuentaCorriente;
import modelo.CuentaLibreta;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;

    //------------------
    //Metodos
    //------------------

    //Constructor
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        if(comando.equals("IngresarFondos"))
        {
            venPrin.miPanelResultados.mostrarResultado("El total de fondos ingresado es: " + CuentaAhorros.ingresos());
        }

        if(comando.equals("RetirarFondos"))
        {
        }

        if(comando.equals("CalcularSaldo"))
        {
        }

        if(comando.equals("calcularNuevoInteres"))
        {
        }

        //Salir
        if(comando.equals("salir"))
        {
            System.exit(0);
        }  
    }
}

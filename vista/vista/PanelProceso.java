package vista;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class PanelProceso extends JPanel 
{
        public JButton btnCrear;
        public JButton btnDepositar;
        public JButton btnRetirar;
        public JButton btnBorrar;
        public JButton btnSalir;

        public PanelProceso() 
        {
        btnCrear = new JButton("Crear");
        btnCrear.setFont(new Font("Arial", Font.PLAIN, 14));
        btnCrear.setForeground(Color.BLACK);
        btnCrear.setBackground(Color.WHITE);
        btnCrear.setBorder(BorderFactory.createRaisedBevelBorder());
        btnCrear.setBounds(30, 22, 70, 20);
        btnCrear.setActionCommand("crearCuenta");

        btnDepositar = new JButton("Depositar");
        btnDepositar.setFont(new Font("Arial", Font.PLAIN, 14));
        btnDepositar.setForeground(Color.BLACK);
        btnDepositar.setBackground(Color.WHITE);
        btnDepositar.setBorder(BorderFactory.createRaisedBevelBorder());
        btnDepositar.setBounds(130, 22, 70, 20);
        btnDepositar.setActionCommand("depositarFondos");

        btnRetirar = new JButton("Retirar");
        btnRetirar.setFont(new Font("Arial", Font.PLAIN, 14));
        btnRetirar.setForeground(Color.BLACK);
        btnRetirar.setBackground(Color.WHITE);
        btnRetirar.setBorder(BorderFactory.createRaisedBevelBorder());
        btnRetirar.setBounds(230, 22, 70, 20);
        btnRetirar.setActionCommand("retirarFondos");

        btnBorrar = new JButton("Borrar");
        btnBorrar.setFont(new Font("Arial", Font.PLAIN, 14));
        btnBorrar.setForeground(Color.BLACK);
        btnBorrar.setBackground(Color.WHITE);
        btnBorrar.setBorder(BorderFactory.createRaisedBevelBorder());
        btnBorrar.setBounds(330, 22, 70, 20);
        btnBorrar.setActionCommand("borrarTexto");

        btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Arial", Font.PLAIN, 14));
        btnSalir.setForeground(Color.BLACK);
        btnSalir.setBackground(Color.WHITE);
        btnSalir.setBorder(BorderFactory.createRaisedBevelBorder());
        btnSalir.setBounds(430, 22, 70, 20);
        btnSalir.setActionCommand("cerrarVentana");

        this.setLayout(null);
        this.setBackground(Color.white);
        this.setVisible(true);
        this.add(btnCrear);
        this.add(btnDepositar);
        this.add(btnRetirar);
        this.add(btnBorrar);
        this.add(btnSalir);
        }
}

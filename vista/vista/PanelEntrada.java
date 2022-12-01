package vista;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class PanelEntrada extends JPanel 
{
        private JLabel lbTitulo;
        private JLabel lbFondos;
        private JLabel lbCuentas;
        private static JTextField tfFondos;
        private static JComboBox<String> cbCuentas;

        public PanelEntrada() 
        {
                lbTitulo = new JLabel("CASO BANCO", SwingConstants.CENTER);
                lbTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
                lbTitulo.setForeground(Color.BLACK);
                lbTitulo.setBounds(0, 10, 558, 30);

                lbCuentas = new JLabel("Cuentas =");
                lbCuentas.setFont(new Font("Serif", Font.PLAIN, 18));
                lbCuentas.setForeground(Color.BLACK);
                lbCuentas.setBounds(230, 55, 480, 30);

                String[] cuentas = { "Cuenta Corriente", "Cuenta de Ahorros", "Cuenta de Libreta" };
                cbCuentas = new JComboBox<>(cuentas);
                cbCuentas.setFont(new Font("Arial", Font.PLAIN, 18));
                cbCuentas.setForeground(Color.BLACK);
                cbCuentas.setBounds(330, 55, 190, 30);

                lbFondos = new JLabel("Fondos =");
                lbFondos.setFont(new Font("Serif", Font.PLAIN, 18));
                lbFondos.setForeground(Color.BLACK);
                lbFondos.setBounds(230, 95, 480, 30);

                tfFondos = new JTextField();
                tfFondos.setFont(new Font("Arial", Font.PLAIN, 18));
                tfFondos.setForeground(Color.BLACK);
                tfFondos.setBounds(330, 95, 190, 30);

                this.setLayout(null);
                this.setBackground(Color.white);
                this.setVisible(true);
                this.add(lbTitulo);
                this.add(lbCuentas);
                this.add(cbCuentas);
                this.add(lbFondos);
                this.add(tfFondos);
        }

        public static String getTfFondos() 
        {
                return tfFondos.getText();
        }

        public static String getCuenta() 
        {
                return cbCuentas.getSelectedItem().toString();
        }

        public static Integer getIndexCuenta() 
        {
                return cbCuentas.getSelectedIndex();
        }

        public static void borrarTf() 
        {
                JOptionPane.showMessageDialog(null, "Los datos se borraran", "Caso Banco",
                JOptionPane.WARNING_MESSAGE);
                tfFondos.setText("");
                cbCuentas.setSelectedIndex(0);
                PanelSalida.taResultados.setText("");
        }
}

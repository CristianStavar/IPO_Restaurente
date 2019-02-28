package presentacion;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class PanelCalculadora extends JPanel {

	private JButton[] button = new JButton[11];
	private JSpinner[] texto = new JSpinner[11];
	private double[] dinero = { 5.00, 10.00, 20.00, 50.00, 100.00, 0.10, 0.20, 0.50, 1.00, 2.00, 1.00 }; // Puntos=1.00
	private double cambio;
	private double cantidad = 1.0;
	private double puntos = 1.00;

	public PanelCalculadora(double nuevo) {
		setBorder(new TitledBorder(null, "Teclado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(6, 4, 0, 0));
		Font fuente = new Font("Verdana", Font.BOLD, 1);

		for (int i = 0; i < 11; i++) {
			button[i] = new JButton(String.valueOf(i));
			button[i].setIcon(
					new ImageIcon(Principal.class.getResource("/presentacion/imagen" + String.valueOf(i) + ".jpg")));
			button[i].setSize(40, 200);
			button[i].setFont(fuente);
			this.add(button[i]);

			texto[i] = new JSpinner();
			texto[i].setModel(new SpinnerNumberModel(1.0, 1.0, 50.0, 1.0)); // inicial,min,max,++
			texto[i].setSize(50, 40);
			this.add(texto[i]);

			cambio = nuevo;
		}

		for (int i = 0; i < 11; i++) {
			button[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent arg0) {
					MiTablaTicket TablaCambio = (MiTablaTicket) Principal.tblticket.getModel();
					String a = arg0.getActionCommand();
					int boton = Integer.parseInt(a);
					int celdaRowUlt = TablaCambio.getRowCount();
					Object b = texto[boton].getValue();
					cantidad = (double) b;
					cambio = cambio + dinero[boton] * cantidad;
					TablaCambio.setValueAt("Entregado", celdaRowUlt - 2, 0);
					TablaCambio.setValueAt(cambio, celdaRowUlt - 2, 3);
					texto[boton].setModel(new SpinnerNumberModel(1.0, 1.0, 50.0, 1.0)); // Vuelve el texto[boton] a 1.00
					if (boton == 10) {
						TablaCambio.setValueAt("Puntos", celdaRowUlt - 2, 1);
						TablaCambio.setValueAt(puntos, celdaRowUlt - 2, 2);
						puntos++;
					}
					TablaCambio.fireTableDataChanged();

				}
			});
		}

	}

	public void setcambio(double nuevo) {
		cambio = nuevo;
		puntos = 1.00;
	}

}

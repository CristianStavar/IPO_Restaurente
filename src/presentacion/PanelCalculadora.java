package presentacion;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.TitledBorder;
import javax.swing.JTextField;

public class PanelCalculadora extends JPanel {
	
	private JButton[] button =new JButton[11];
	
	
	
	
	public PanelCalculadora() {
		setBorder(new TitledBorder(null, "Teclado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(6, 4, 0, 0));
		Font fuente= new Font("Verdana",Font.BOLD, 12);
		
		for (int i = 0; i < 11; i++) {
			button[i] = new JButton(String.valueOf(i));
			button[i].setIcon(new ImageIcon(Principal.class.getResource("/presentacion/imagen" + String.valueOf(i) + ".jpg")));
			button[i].setSize(40,200);
			button[i].setFont(fuente);
			
			this.add(button[i]); // añadir cada componente al contenedor (JPanel)
			JTextField texto = new JTextField(1);
			texto.setSize(50, 40);
			this.add(texto);
		}
		
		for (int i = 0; i < 11; i++) {
			button[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent arg0) {
					int j;
					MiTablaTicket TablaCambio = (MiTablaTicket) Principal.tblticket.getModel();
					Object[] nuevaFila = {"Entregado", null,null, 5.00};
					System.out.println("Pulsó el botón ");
					TablaCambio.aniadeFila(nuevaFila);
					TablaCambio.fireTableDataChanged();
					}
				
		});
		}
	}
}


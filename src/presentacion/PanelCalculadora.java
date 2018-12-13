package presentacion;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;

public class PanelCalculadora extends JPanel {
	
	private JButton[] botones =new JButton[11];
	
	
	public PanelCalculadora() {
		setBorder(new TitledBorder(null, "Teclado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(6, 4, 0, 0));
		Font fuente= new Font("Verdana",Font.BOLD, 12);
		
		for (int i = 0; i < 11; i++) {
			JButton button = new JButton();
			button.setIcon(new ImageIcon(Principal.class.getResource("/presentacion/imagen" + String.valueOf(i) + ".jpg")));
			button.setSize(40,200);
			button.setFont(fuente);
			
			this.add(button); // añadir cada componente al contenedor (JPanel)
			JTextField texto = new JTextField(String.valueOf(1));
			texto.setSize(50, 40);
			this.add(texto);
			
			
		}
	}

}

package presentacion;

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
		//setLayout(new GridLayout(6, 4, 20, 0));
		Font fuente= new Font("Verdana",Font.BOLD, 12);
		
		for (int i = 0; i < 11; i++) {
			JButton button = new JButton(String.valueOf(i + 1));
			button.setSize(50,200);
			button.setFont(fuente);
			//botones[i] = new JButton(String.valueOf(i+1));
			//this.add(botones[i]); 
			
			this.add(button); // añadir cada componente al contenedor (JPanel)
			JTextField texto = new JTextField(String.valueOf(i + 1));
			this.add(texto);
			
			
		}
	}

}

package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class LoginRest {

	protected static final Object password = "Restaurante";
	private JFrame frmRestaurante;
	private JPanel panel;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JTextField tfUsuario;
	private JPasswordField pwdfPassword;
	private JLabel lblAviso;
	private JButton btnEntrar;
	private JComboBox cmbBoxIdioma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginRest window = new LoginRest();
					window.frmRestaurante.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginRest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRestaurante = new JFrame();
		frmRestaurante.setTitle("Restaurante ...");
		frmRestaurante.setResizable(false);
		frmRestaurante.setBounds(100, 100, 431, 257);
		frmRestaurante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRestaurante.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 405, 205);
		frmRestaurante.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblUsuario = new JLabel("Nombre:");
		lblUsuario.setBounds(104, 67, 59, 14);
		panel.add(lblUsuario);
		
		lblPassword = new JLabel("Contraseña:");
		lblPassword.setEnabled(false);
		lblPassword.setBounds(95, 104, 86, 14);
		panel.add(lblPassword);
		
		tfUsuario = new JTextField();
		tfUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Activamos los de la contraseñalblPassword.
				lblPassword.setEnabled(true);
				pwdfPassword.setEnabled(true);
				//Pasamos el foco (el cursor) al campo de la contraseña
				pwdfPassword.requestFocus();
			}
		});
		tfUsuario.setBounds(191, 64, 134, 20);
		panel.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		pwdfPassword = new JPasswordField();
		pwdfPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				//mostramos el carácter de la tecla pulsada
			}
		});
		pwdfPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					//obtenemos la contraseña introducida
					if (String.valueOf(pwdfPassword.getPassword()).equals(password)){
						btnEntrar.setEnabled(true);
						lblAviso.setBackground(Color.GREEN);
						lblAviso.setText("Contraseña correcta. Puede entrar");
						lblAviso.setVisible(true);
						lblPassword.setEnabled(false);
						pwdfPassword.setEnabled(false);
					}
					else {
						lblAviso.setBackground(Color.RED);
						lblAviso.setText("Contraseña incorrecta. Vuelva a intentarlo");
						lblAviso.setVisible(true);
						pwdfPassword.setText(null);
					}
			}
		});
		pwdfPassword.setEnabled(false);
		pwdfPassword.setBounds(191, 101, 134, 20);
		panel.add(pwdfPassword);
		
		lblAviso = new JLabel("");
		lblAviso.setOpaque(true);
		lblAviso.setBounds(115, 129, 224, 33);
		panel.add(lblAviso);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setEnabled(false);
		btnEntrar.addActionListener(new BtnEntrarActionListener());
		btnEntrar.setBounds(171, 173, 89, 23);
		panel.add(btnEntrar);
		
		cmbBoxIdioma = new JComboBox();
		cmbBoxIdioma.setName("Idioma");
		cmbBoxIdioma.setToolTipText("Idioma\r\n");
		cmbBoxIdioma.setModel(new DefaultComboBoxModel(new String[] {"Español", "Ingles"}));
		cmbBoxIdioma.setBounds(311, 11, 77, 20);
		panel.add(cmbBoxIdioma);
	}

	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (String.valueOf(pwdfPassword.getPassword()).equals(password)){
				Principal ventana= new Principal();
				ventana.getFrame().setVisible(true);
				LoginRest.dispose();
			}
		}
	}

	protected static void dispose() {
		// TODO Auto-generated method stub
		
	}
}

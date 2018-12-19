package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;

public class Perfil extends JFrame {

	private JPanel contentPane;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblTelefono;
	private JLabel lblPassword;
	private JLabel lblCiudad;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JFormattedTextField fTxtTlf;
	private JPasswordField password;
	private JTextField textCiudad;
	private JPanel pnlFoto;
	private JButton btnNuevoEmpleado;
	private JLabel Usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Perfil frame = new Perfil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Perfil() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 564, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 31, 122, 22, 116, 122, 27, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		pnlFoto = new JPanel();
		GridBagConstraints gbc_pnlFoto = new GridBagConstraints();
		gbc_pnlFoto.gridwidth = 2;
		gbc_pnlFoto.gridheight = 5;
		gbc_pnlFoto.insets = new Insets(0, 0, 5, 5);
		gbc_pnlFoto.fill = GridBagConstraints.VERTICAL;
		gbc_pnlFoto.gridx = 1;
		gbc_pnlFoto.gridy = 1;
		contentPane.add(pnlFoto, gbc_pnlFoto);
		pnlFoto.setLayout(new BorderLayout(0, 0));

		Usuario = new JLabel("");
		Usuario.setIcon(new ImageIcon(Perfil.class.getResource("/presentacion/431.png")));
		pnlFoto.add(Usuario);

		lblNombre = new JLabel("Nombre:  ");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 3;
		gbc_lblNombre.gridy = 1;
		contentPane.add(lblNombre, gbc_lblNombre);

		textNombre = new JTextField();
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 4;
		gbc_textNombre.gridy = 1;
		contentPane.add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);

		lblApellidos = new JLabel("Apellidos:  ");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 3;
		gbc_lblApellidos.gridy = 2;
		contentPane.add(lblApellidos, gbc_lblApellidos);

		textApellidos = new JTextField();
		GridBagConstraints gbc_textApellidos = new GridBagConstraints();
		gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidos.gridx = 4;
		gbc_textApellidos.gridy = 2;
		contentPane.add(textApellidos, gbc_textApellidos);
		textApellidos.setColumns(10);

		lblTelefono = new JLabel("Telefono:  ");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.EAST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 3;
		gbc_lblTelefono.gridy = 3;
		contentPane.add(lblTelefono, gbc_lblTelefono);

		fTxtTlf = new JFormattedTextField();
		GridBagConstraints gbc_fTxtTlf = new GridBagConstraints();
		gbc_fTxtTlf.insets = new Insets(0, 0, 5, 5);
		gbc_fTxtTlf.fill = GridBagConstraints.HORIZONTAL;
		gbc_fTxtTlf.gridx = 4;
		gbc_fTxtTlf.gridy = 3;
		contentPane.add(fTxtTlf, gbc_fTxtTlf);

		lblPassword = new JLabel("Password:  ");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 3;
		gbc_lblPassword.gridy = 4;
		contentPane.add(lblPassword, gbc_lblPassword);

		password = new JPasswordField();
		GridBagConstraints gbc_password = new GridBagConstraints();
		gbc_password.insets = new Insets(0, 0, 5, 5);
		gbc_password.fill = GridBagConstraints.HORIZONTAL;
		gbc_password.gridx = 4;
		gbc_password.gridy = 4;
		contentPane.add(password, gbc_password);

		lblCiudad = new JLabel("Ciudad:  ");
		GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
		gbc_lblCiudad.anchor = GridBagConstraints.EAST;
		gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad.gridx = 3;
		gbc_lblCiudad.gridy = 5;
		contentPane.add(lblCiudad, gbc_lblCiudad);

		textCiudad = new JTextField();
		GridBagConstraints gbc_textCiudad = new GridBagConstraints();
		gbc_textCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_textCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCiudad.gridx = 4;
		gbc_textCiudad.gridy = 5;
		contentPane.add(textCiudad, gbc_textCiudad);
		textCiudad.setColumns(10);

		btnNuevoEmpleado = new JButton("Nuevo Empleado");
		btnNuevoEmpleado.setEnabled(false);
		GridBagConstraints gbc_btnNuevoEmpleado = new GridBagConstraints();
		gbc_btnNuevoEmpleado.insets = new Insets(0, 0, 0, 5);
		gbc_btnNuevoEmpleado.gridx = 3;
		gbc_btnNuevoEmpleado.gridy = 6;
		contentPane.add(btnNuevoEmpleado, gbc_btnNuevoEmpleado);
	}

}

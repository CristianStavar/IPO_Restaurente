package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ModificarPlato extends JFrame {

	private JPanel pnlPrincipal;
	private JPanel pnlBotones;
	private JPanel pnlInfo;
	private JButton btnNewButton;
	private JButton btnAceptar;
	private JLabel lblTescripcion;
	private JTextArea txtaTescripcion;
	private JLabel lblNombrePlato;
	private JTextField txtfNombrePlato;
	private JLabel lblFoto;
	private JPanel pnlFoto;
	private JLabel lblPrecioPlato;
	private JTextField txtfPrecioPlato;
	private JButton btncambiarFoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarPlato frame = new ModificarPlato();
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
	public ModificarPlato() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 612, 400);
		pnlPrincipal = new JPanel();
		pnlPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlPrincipal);
		pnlPrincipal.setLayout(new BorderLayout(0, 0));
		
		pnlBotones = new JPanel();
		pnlPrincipal.add(pnlBotones, BorderLayout.SOUTH);
		
		btnAceptar = new JButton("Aceptar");
		pnlBotones.add(btnAceptar);
		
		btnNewButton = new JButton("New button");
		pnlBotones.add(btnNewButton);
		
		pnlInfo = new JPanel();
		pnlPrincipal.add(pnlInfo, BorderLayout.CENTER);
		GridBagLayout gbl_pnlInfo = new GridBagLayout();
		gbl_pnlInfo.columnWidths = new int[]{90, 289, 36, 18, 93, 18, 0};
		gbl_pnlInfo.rowHeights = new int[]{33, 0, 99, 60, 33, 33, 0};
		gbl_pnlInfo.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlInfo.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlInfo.setLayout(gbl_pnlInfo);
		
		lblTescripcion = new JLabel("Tescripcion");
		GridBagConstraints gbc_lblTescripcion = new GridBagConstraints();
		gbc_lblTescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblTescripcion.gridx = 0;
		gbc_lblTescripcion.gridy = 0;
		pnlInfo.add(lblTescripcion, gbc_lblTescripcion);
		
		lblFoto = new JLabel("Foto");
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 4;
		gbc_lblFoto.gridy = 0;
		pnlInfo.add(lblFoto, gbc_lblFoto);
		
		txtaTescripcion = new JTextArea();
		GridBagConstraints gbc_txtaTescripcion = new GridBagConstraints();
		gbc_txtaTescripcion.gridheight = 3;
		gbc_txtaTescripcion.gridwidth = 3;
		gbc_txtaTescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_txtaTescripcion.fill = GridBagConstraints.BOTH;
		gbc_txtaTescripcion.gridx = 0;
		gbc_txtaTescripcion.gridy = 1;
		pnlInfo.add(txtaTescripcion, gbc_txtaTescripcion);
		
		pnlFoto = new JPanel();
		GridBagConstraints gbc_pnlFoto = new GridBagConstraints();
		gbc_pnlFoto.gridwidth = 2;
		gbc_pnlFoto.gridheight = 2;
		gbc_pnlFoto.insets = new Insets(0, 0, 5, 0);
		gbc_pnlFoto.fill = GridBagConstraints.BOTH;
		gbc_pnlFoto.gridx = 4;
		gbc_pnlFoto.gridy = 1;
		pnlInfo.add(pnlFoto, gbc_pnlFoto);
		
		btncambiarFoto = new JButton("Cambiar Foto");
		GridBagConstraints gbc_btncambiarFoto = new GridBagConstraints();
		gbc_btncambiarFoto.insets = new Insets(0, 0, 5, 5);
		gbc_btncambiarFoto.gridx = 4;
		gbc_btncambiarFoto.gridy = 3;
		pnlInfo.add(btncambiarFoto, gbc_btncambiarFoto);
		
		lblNombrePlato = new JLabel("Nombre Plato");
		GridBagConstraints gbc_lblNombrePlato = new GridBagConstraints();
		gbc_lblNombrePlato.anchor = GridBagConstraints.EAST;
		gbc_lblNombrePlato.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombrePlato.gridx = 0;
		gbc_lblNombrePlato.gridy = 4;
		pnlInfo.add(lblNombrePlato, gbc_lblNombrePlato);
		
		txtfNombrePlato = new JTextField();
		GridBagConstraints gbc_txtfNombrePlato = new GridBagConstraints();
		gbc_txtfNombrePlato.insets = new Insets(0, 0, 5, 5);
		gbc_txtfNombrePlato.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfNombrePlato.gridx = 1;
		gbc_txtfNombrePlato.gridy = 4;
		pnlInfo.add(txtfNombrePlato, gbc_txtfNombrePlato);
		txtfNombrePlato.setColumns(10);
		
		lblPrecioPlato = new JLabel("Precio Plato");
		GridBagConstraints gbc_lblPrecioPlato = new GridBagConstraints();
		gbc_lblPrecioPlato.anchor = GridBagConstraints.EAST;
		gbc_lblPrecioPlato.insets = new Insets(0, 0, 0, 5);
		gbc_lblPrecioPlato.gridx = 0;
		gbc_lblPrecioPlato.gridy = 5;
		pnlInfo.add(lblPrecioPlato, gbc_lblPrecioPlato);
		
		txtfPrecioPlato = new JTextField();
		GridBagConstraints gbc_txtfPrecioPlato = new GridBagConstraints();
		gbc_txtfPrecioPlato.insets = new Insets(0, 0, 0, 5);
		gbc_txtfPrecioPlato.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfPrecioPlato.gridx = 1;
		gbc_txtfPrecioPlato.gridy = 5;
		pnlInfo.add(txtfPrecioPlato, gbc_txtfPrecioPlato);
		txtfPrecioPlato.setColumns(10);
	}

}

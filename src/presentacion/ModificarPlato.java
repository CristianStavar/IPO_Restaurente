package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import dominio.Plato;

import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.border.SoftBevelBorder;

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
	private JButton btnCambiarFoto;
	private JLabel lblFotografia;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ModificarPlato(Plato p, MiTabla m, JTable t) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 733, 462);
		pnlPrincipal = new JPanel();
		pnlPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlPrincipal);
		pnlPrincipal.setLayout(new BorderLayout(0, 0));

		pnlBotones = new JPanel();
		pnlBotones.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlPrincipal.add(pnlBotones, BorderLayout.SOUTH);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new BtnAceptarActionListener());
		pnlBotones.add(btnAceptar);

		btnNewButton = new JButton("New button");
		pnlBotones.add(btnNewButton);

		pnlInfo = new JPanel();
		pnlPrincipal.add(pnlInfo, BorderLayout.CENTER);
		GridBagLayout gbl_pnlInfo = new GridBagLayout();
		gbl_pnlInfo.columnWidths = new int[] { 90, 298, 106, 39, 149, 17, 0 };
		gbl_pnlInfo.rowHeights = new int[] { 33, 0, 158, 60, 33, 33, 0 };
		gbl_pnlInfo.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlInfo.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
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
		txtaTescripcion.setWrapStyleWord(true);
		txtaTescripcion.setLineWrap(true);
		txtaTescripcion.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_txtaTescripcion = new GridBagConstraints();
		gbc_txtaTescripcion.gridheight = 3;
		gbc_txtaTescripcion.gridwidth = 3;
		gbc_txtaTescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_txtaTescripcion.fill = GridBagConstraints.BOTH;
		gbc_txtaTescripcion.gridx = 0;
		gbc_txtaTescripcion.gridy = 1;
		pnlInfo.add(txtaTescripcion, gbc_txtaTescripcion);

		pnlFoto = new JPanel();
		pnlFoto.setBorder(null);
		pnlFoto.setPreferredSize(new Dimension(200, 250));
		pnlFoto.setSize(new Dimension(200, 250));
		pnlFoto.setMaximumSize(new Dimension(200, 250));
		GridBagConstraints gbc_pnlFoto = new GridBagConstraints();
		gbc_pnlFoto.gridwidth = 2;
		gbc_pnlFoto.gridheight = 2;
		gbc_pnlFoto.insets = new Insets(0, 0, 5, 0);
		gbc_pnlFoto.gridx = 4;
		gbc_pnlFoto.gridy = 1;
		pnlInfo.add(pnlFoto, gbc_pnlFoto);
		pnlFoto.setLayout(new BorderLayout(0, 0));

		lblFotografia = new JLabel("");
		lblFotografia.setPreferredSize(new Dimension(200, 250));
		lblFotografia.setMaximumSize(new Dimension(200, 250));
		lblFotografia.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pnlFoto.add(lblFotografia, BorderLayout.CENTER);

		btnCambiarFoto = new JButton("Cambiar Foto");
		btnCambiarFoto.addActionListener(new BtncambiarFotoActionListener());
		GridBagConstraints gbc_btnCambiarFoto = new GridBagConstraints();
		gbc_btnCambiarFoto.insets = new Insets(0, 0, 5, 5);
		gbc_btnCambiarFoto.gridx = 4;
		gbc_btnCambiarFoto.gridy = 3;
		pnlInfo.add(btnCambiarFoto, gbc_btnCambiarFoto);

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

		txtaTescripcion.setText(p.getDescripcion());
		txtfNombrePlato.setText(p.getNombre());
		txtfPrecioPlato.setText(p.getPrecio());

	}

	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			JTable tabla = new JTable();
			MiTabla modelo = new MiTabla();
			if (Principal.tabInicio.getSelectedComponent().equals(Principal.pnlComida)) {
				Principal.pestana = (JScrollPane) Principal.tabComidas.getSelectedComponent();
				tabla = (JTable) Principal.pestana.getViewport().getView();
			}
			if (Principal.tabInicio.getSelectedComponent().equals(Principal.pnlBebidas)) {
				Principal.pestana = (JScrollPane) Principal.scrollPaneBebidas;
				tabla = (JTable) Principal.pestana.getViewport().getView();
			}
			if (Principal.tabInicio.getSelectedComponent().equals(Principal.pnlOfertas)) {
				Principal.pestana = (JScrollPane) Principal.scrollPaneOfertas;
				tabla = (JTable) Principal.pestana.getViewport().getView();
			}
			int n = tabla.getSelectedRow();
			if (n != -1) {
				modelo = (MiTabla) tabla.getModel();
				modelo.setValueAt(lblFotografia.getIcon(), tabla.getSelectedRow(), 0);
				modelo.setValueAt(txtfNombrePlato.getText(), tabla.getSelectedRow(), 1);
				modelo.setValueAt(txtaTescripcion.getText(), tabla.getSelectedRow(), 2);
				modelo.setValueAt(Double.valueOf(txtfPrecioPlato.getText()), tabla.getSelectedRow(), 3);

				modelo.fireTableDataChanged();
				// debido al uso de la orden de arriba imagino, al actualizarse la tabla se
				// pierde la selecion actual despues de una modificacion.
				// Tampoco controlamos que se hagan modificaciones a otra fila que no sea la
				// seleccionada inicialmente.
				// se puede cambiar la selecion antes de darle al boton de confirmar y se
				// cambiara la ultima fila selecionada, no la inicial.
			}

		}
	}

	private class BtncambiarFotoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JFileChooser fcAbrir = new JFileChooser();
			int valor = fcAbrir.showDialog(btnCambiarFoto, "Cargar Foto");
			if (valor == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				cambiarFoto(new ImageIcon(file.getAbsolutePath()));
			}
		}

		private void cambiarFoto(ImageIcon image) {
			if (image != null) {
				lblFotografia.setIcon(image);
			}

		}
	}
}

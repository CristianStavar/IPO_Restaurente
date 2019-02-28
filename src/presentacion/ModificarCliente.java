package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import dominio.Cliente;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModificarCliente extends JFrame {

	private JPanel contentPane;
	private JPanel panelBotones;
	private JPanel paneldatos;
	private JButton btnGuardar;
	private JButton btnLimiar;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblTelefono;
	private JLabel lblDireccin;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblPreferencias;
	private JTextField textField_4;
	private JLabel lblIntolerancias;
	private JCheckBox chckbxLcteos;
	private JCheckBox chckbxMarisco;
	private JCheckBox chckbxFrutosSecos;
	private JCheckBox chckbxGlten;
	private JLabel lblPuntos;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ModificarCliente(Cliente c) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		panelBotones = new JPanel();
		contentPane.add(panelBotones, BorderLayout.SOUTH);

		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new BtnGuardarActionListener());
		panelBotones.add(btnGuardar);

		btnLimiar = new JButton("Limiar");
		panelBotones.add(btnLimiar);

		paneldatos = new JPanel();
		contentPane.add(paneldatos, BorderLayout.CENTER);
		GridBagLayout gbl_paneldatos = new GridBagLayout();
		gbl_paneldatos.columnWidths = new int[] { 75, 167, 69, 0, 0, 0 };
		gbl_paneldatos.rowHeights = new int[] { 33, 0, 0, 0, 0, 33, 0, 0 };
		gbl_paneldatos.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_paneldatos.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		paneldatos.setLayout(gbl_paneldatos);

		lblIntolerancias = new JLabel("Intolerancias");
		GridBagConstraints gbc_lblIntolerancias = new GridBagConstraints();
		gbc_lblIntolerancias.anchor = GridBagConstraints.WEST;
		gbc_lblIntolerancias.insets = new Insets(0, 0, 5, 5);
		gbc_lblIntolerancias.gridx = 3;
		gbc_lblIntolerancias.gridy = 0;
		paneldatos.add(lblIntolerancias, gbc_lblIntolerancias);

		lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 1;
		paneldatos.add(lblNombre, gbc_lblNombre);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		paneldatos.add(textField, gbc_textField);
		textField.setColumns(10);

		chckbxLcteos = new JCheckBox("Lácteos");
		GridBagConstraints gbc_chckbxLcteos = new GridBagConstraints();
		gbc_chckbxLcteos.anchor = GridBagConstraints.WEST;
		gbc_chckbxLcteos.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxLcteos.gridx = 3;
		gbc_chckbxLcteos.gridy = 1;
		paneldatos.add(chckbxLcteos, gbc_chckbxLcteos);

		lblApellidos = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 0;
		gbc_lblApellidos.gridy = 2;
		paneldatos.add(lblApellidos, gbc_lblApellidos);

		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		paneldatos.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		chckbxMarisco = new JCheckBox("Marisco");
		GridBagConstraints gbc_chckbxMarisco = new GridBagConstraints();
		gbc_chckbxMarisco.anchor = GridBagConstraints.WEST;
		gbc_chckbxMarisco.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxMarisco.gridx = 3;
		gbc_chckbxMarisco.gridy = 2;
		paneldatos.add(chckbxMarisco, gbc_chckbxMarisco);

		lblTelefono = new JLabel("Teléfono");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.EAST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 0;
		gbc_lblTelefono.gridy = 3;
		paneldatos.add(lblTelefono, gbc_lblTelefono);

		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		paneldatos.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		chckbxFrutosSecos = new JCheckBox("Frutos secos");
		GridBagConstraints gbc_chckbxFrutosSecos = new GridBagConstraints();
		gbc_chckbxFrutosSecos.anchor = GridBagConstraints.WEST;
		gbc_chckbxFrutosSecos.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxFrutosSecos.gridx = 3;
		gbc_chckbxFrutosSecos.gridy = 3;
		paneldatos.add(chckbxFrutosSecos, gbc_chckbxFrutosSecos);

		lblDireccin = new JLabel("Dirección");
		GridBagConstraints gbc_lblDireccin = new GridBagConstraints();
		gbc_lblDireccin.anchor = GridBagConstraints.EAST;
		gbc_lblDireccin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccin.gridx = 0;
		gbc_lblDireccin.gridy = 4;
		paneldatos.add(lblDireccin, gbc_lblDireccin);

		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 4;
		paneldatos.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

		chckbxGlten = new JCheckBox("Glúten");
		GridBagConstraints gbc_chckbxGlten = new GridBagConstraints();
		gbc_chckbxGlten.anchor = GridBagConstraints.WEST;
		gbc_chckbxGlten.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxGlten.gridx = 3;
		gbc_chckbxGlten.gridy = 4;
		paneldatos.add(chckbxGlten, gbc_chckbxGlten);

		lblPreferencias = new JLabel("Preferencias");
		GridBagConstraints gbc_lblPreferencias = new GridBagConstraints();
		gbc_lblPreferencias.anchor = GridBagConstraints.EAST;
		gbc_lblPreferencias.insets = new Insets(0, 0, 5, 5);
		gbc_lblPreferencias.gridx = 0;
		gbc_lblPreferencias.gridy = 5;
		paneldatos.add(lblPreferencias, gbc_lblPreferencias);

		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 5;
		paneldatos.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);

		lblPuntos = new JLabel("Puntos");
		GridBagConstraints gbc_lblPuntos = new GridBagConstraints();
		gbc_lblPuntos.anchor = GridBagConstraints.EAST;
		gbc_lblPuntos.insets = new Insets(0, 0, 0, 5);
		gbc_lblPuntos.gridx = 0;
		gbc_lblPuntos.gridy = 6;
		paneldatos.add(lblPuntos, gbc_lblPuntos);

		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 0, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 6;
		paneldatos.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);

		textField_1.setText(c.getNombre());
		textField.setText(c.getApellido());
		textField_3.setText(c.getDireccion());
		textField_2.setText((String.valueOf(c.getTelefono())));
		textField_4.setText(c.getPreferencias());
		textField_5.setText((String.valueOf(c.getPuntos())));
	}

	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			JTable tabla = new JTable();
			TablaVips modelo = new TablaVips();
			boolean correctoTlfn = true;
			boolean correctoPnts = true;

			tabla = (JTable) Principal.pnlClientesVips.getViewport().getView();
			int n = tabla.getSelectedRow();

			if (n != -1) {

				correctoTlfn = isNumeric(textField_2.getText());
				correctoPnts = isNumeric(textField_5.getText());
				if (correctoTlfn && correctoPnts) {
					modelo = (TablaVips) tabla.getModel();
					modelo.setValueAt(textField.getText(), tabla.getSelectedRow(), 1);
					modelo.setValueAt(textField_1.getText(), tabla.getSelectedRow(), 2);
					modelo.setValueAt(textField_2.getText(), tabla.getSelectedRow(), 4);
					modelo.setValueAt(textField_3.getText(), tabla.getSelectedRow(), 3);
					modelo.setValueAt(textField_4.getText(), tabla.getSelectedRow(), 6);
					modelo.setValueAt(textField_5.getText(), tabla.getSelectedRow(), 5);

					modelo.fireTableDataChanged();
				} else {
					JOptionPane.showMessageDialog(null,
							"Los campos no son correctos.\nRecuerde que Telefono y Puntos deben ser numéricos",
							"Cuidado!", JOptionPane.PLAIN_MESSAGE);

				}

			}
		}
	}

	public static boolean isNumeric(String str) {
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c))
				return false;
		}
		return true;
	}
}

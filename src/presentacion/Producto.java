package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Producto extends JPanel implements Serializable {
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JPanel pnlImagenProducto;
	private Color color;
	private String texto;

	/**
	 * Create the panel.
	 */
	public Producto() {
		addMouseListener(new ThisMouseListener());
		setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 67, 266, 114, 0 };
		gridBagLayout.rowHeights = new int[] { 42, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		pnlImagenProducto = new JPanel();
		GridBagConstraints gbc_pnlImagenProducto = new GridBagConstraints();
		gbc_pnlImagenProducto.insets = new Insets(0, 0, 0, 5);
		gbc_pnlImagenProducto.fill = GridBagConstraints.BOTH;
		gbc_pnlImagenProducto.gridx = 0;
		gbc_pnlImagenProducto.gridy = 0;
		add(pnlImagenProducto, gbc_pnlImagenProducto);

		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 0, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 0;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);

		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setText("Precio");
		GridBagConstraints gbc_txtPrecio = new GridBagConstraints();
		gbc_txtPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecio.gridx = 2;
		gbc_txtPrecio.gridy = 0;
		add(txtPrecio, gbc_txtPrecio);
		txtPrecio.setColumns(10);

	}

	private class ThisMouseListener extends MouseAdapter {
		public void mouseEntered(MouseEvent arg0) {
			color = getBackground();
			setBackground(new Color(250, 250, 160));
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			setBackground(color);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			texto = txtNombre.getText();
			// txtNombre.setText((String) e.getSource());
			txtPrecio.setText(texto);
			Principal.setSeleccionado(texto);
		}

	}

	public String getNombre() {
		return texto;

	}
}

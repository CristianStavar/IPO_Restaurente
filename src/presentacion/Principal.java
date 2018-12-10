package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JList;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;
import java.awt.Component;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import javax.swing.JInternalFrame;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private JFrame frame;
	private JTabbedPane tabPrincipales;
	private JPanel pnlInicio;
	private JPanel pnlPedidos;
	private JPanel pnlMapa;
	private JPanel pnlClientes;
	private JTabbedPane tabInicio;
	private JPanel pnlComida;
	private JPanel pnlBebidas;
	private JPanel pnlOfertas;
	private JTabbedPane tabComidas;
	private JPanel pnlPescado;
	private JPanel pnlCarneBase;
	private JPanel pnlPlatosPescado;
	private JButton btnNewButton;
	private JPanel pnlBocadillos;
	private JPanel pnlArroz;
	private JPanel pnlPasta;
	private JLabel lblAquiVamosA;
	private JScrollPane scrlpnlTescripcion;
	private JTable table;
	private JScrollPane scrlpnlticket;
	private JPanel pnlBilletes;
	private JPanel panel;
	private JButton btnCompra;
	private JButton btnBorrar;
	private JPanel pnlCambiosProductos;
	private JButton btnAñadirProducto;
	private JButton btnEliminrroducto;
	private JButton btnModificarProducto;
	private JScrollPane scrollPane_2;
	private JPanel pnlCarne2;
	private JPanel pnlCarne;
	private JPanel panel_1;
	private JTextArea textAreaEsc;
	private JScrollBar scrollBar;
	private JScrollPane scrollPanePostre;
	private JPanel pnlPlatosostre;
	private JScrollPane scrollPaneCarnes;
	private JScrollPane scrollPanePescado;
	private JScrollPane scrollPanePasta;
	private JScrollPane scrollPaneArroz;
	private JPanel pnlPlatosBocadillos;
	private JPanel pnlPlatosCarne;
	private JPanel pnlPlatosPescado;
	private JPanel pnlPlatosPasta;
	private JPanel pnlPlatosArroz;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblApellidos;
	private JTextField txtApellidos;
	private JTextField txtInd;
	private JLabel lblId;
	private JLabel lblTelf;
	private JLabel lblDireccion;
	private JLabel lblPuntos;
	private JFormattedTextField fTxtTelefono;
	private JTextField txtDireccion;
	private JTextField txtPuntos;
	private JComboBox cmbBIntolerancias;
	private JComboBox cmbBHistorial;
	private JComboBox cmbBPreferencias;
	private JButton btnAadir;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JTextArea textArea;
	private JToggleButton tglbtnBuscar;
	private JEditorPane edpnlMapa;
	private JList lstPedidos;
	private JList lstRepartidores;
	private JButton btnIdioma;
	private JButton btnIdioma_1;
	private JButton button;
	private JTabbedPane TbblPedidos;
	private JPanel pnldePedidosç;
	private JButton btnModificar_1;
	private JButton btnEliminar_1;
	private JPanel panel_2;
	private JLabel lblNombre_1;
	private JLabel lblDireccion_1;
	private JLabel lblTelefono;
	private JLabel lblFechaInicio;
	private JTextField txtNombre_1;
	private JTextField txtDireccion_1;
	private JTextField txtTelefono;
	private JFormattedTextField frmtFechaInicio;
	private JButton btnPagar;
	private JComboBox cmbTipo;
	private JPanel panel_3;
	private JLabel lblFechaRecogida;
	private JFormattedTextField frmtFechaRecogida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	//	lectura();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 997, 770);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tabPrincipales = new JTabbedPane(JTabbedPane.TOP);
		tabPrincipales.setToolTipText("Soy penstañas\r\n");
		getFrame().getContentPane().add(tabPrincipales, BorderLayout.CENTER);

		pnlInicio = new JPanel();
		pnlInicio.setName("");
		tabPrincipales.addTab("Inicio", null, pnlInicio, null);
		GridBagLayout gbl_pnlInicio = new GridBagLayout();
		gbl_pnlInicio.columnWidths = new int[] { 1010, 0, 642, 0 };
		gbl_pnlInicio.rowHeights = new int[] { 335, 284, 65, 0 };
		gbl_pnlInicio.columnWeights = new double[] { 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_pnlInicio.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlInicio.setLayout(gbl_pnlInicio);

		tabInicio = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabInicio = new GridBagConstraints();
		gbc_tabInicio.insets = new Insets(0, 0, 5, 5);
		gbc_tabInicio.fill = GridBagConstraints.BOTH;
		gbc_tabInicio.gridx = 0;
		gbc_tabInicio.gridy = 0;
		pnlInicio.add(tabInicio, gbc_tabInicio);

		pnlComida = new JPanel();
		pnlComida.setMinimumSize(new Dimension(500, 350));
		tabInicio.addTab("Platos", null, pnlComida, null);

		tabComidas = new JTabbedPane(JTabbedPane.LEFT);
		tabComidas.setName("");
		tabComidas.setPreferredSize(new Dimension(600, 350));
		tabComidas.setMinimumSize(new Dimension(500, 350));
		tabComidas.setOpaque(true);
		tabComidas.setBackground(Color.WHITE);
		pnlComida.add(tabComidas);

		pnlCarneBase = new JPanel();
		tabComidas.addTab("Carne", null, pnlCarneBase, null);
		pnlCarneBase.setLayout(new BorderLayout(0, 0));

		pnlCarne2 = new JPanel();
		pnlCarneBase.add(pnlCarne2, BorderLayout.CENTER);
		pnlCarne2.setLayout(new BorderLayout(0, 0));

		pnlPasta = new JPanel();
		tabComidas.addTab("Pasta", null, pnlPasta, null);
		pnlPasta.setLayout(new BorderLayout(0, 0));
		
		scrollBar = new JScrollBar();
		pnlPasta.add(scrollBar, BorderLayout.EAST);

		pnlArroz = new JPanel();
		tabComidas.addTab("Arroz", null, pnlArroz, null);
		pnlArroz.setLayout(new GridLayout(0, 2, 0, 0));

		pnlBocadillos = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pnlBocadillos.getLayout();
		flowLayout.setAlignment(FlowLayout.LEADING);
		tabComidas.addTab("Bocadillos", null, pnlBocadillos, null);
		
		scrollPanePostre = new JScrollPane();
		tabComidas.addTab("postre", null, scrollPanePostre, null);

		pnlPescado = new JPanel();
		pnlPescado.setMinimumSize(new Dimension(500, 500));
		tabComidas.addTab("Pescado", null, pnlPescado, null);

		lblAquiVamosA = new JLabel(
				"escalao imagenes.Hay que usar objetos Image, no icon-ImageIO.reat lee la cosa , luego con getscaletInstance cambia el tamaño.Hacer cambio te image a icon para poter establecerlo como icono te algo.\r\n");
		pnlPescado.add(lblAquiVamosA);

		pnlPlatosPescado = new JPanel();
		pnlPlatosPescado.setMinimumSize(new Dimension(500, 500));
		pnlPescado.add(pnlPlatosPescado);

		btnNewButton = new JButton("New button");
		pnlPlatosPescado.add(btnNewButton);

		scrollPane_2 = new JScrollPane();
		tabComidas.addTab("New tab", null, scrollPane_2, null);

		pnlCarne = new JPanel();
		scrollPane_2.setViewportView(pnlCarne);
		pnlCarne.setLayout(new GridLayout(0, 1, 0, 0));

		pnlBebidas = new JPanel();
		tabInicio.addTab("Bebidas", null, pnlBebidas, null);

		pnlOfertas = new JPanel();
		tabInicio.addTab("Ofertas", null, pnlOfertas, null);

		scrlpnlticket = new JScrollPane();
		scrlpnlticket.setMinimumSize(new Dimension(200, 200));
		scrlpnlticket.setPreferredSize(new Dimension(200, 200));
		scrlpnlticket.setMaximumSize(new Dimension(400, 400));
		GridBagConstraints gbc_scrlpnlticket = new GridBagConstraints();
		gbc_scrlpnlticket.insets = new Insets(0, 0, 5, 0);
		gbc_scrlpnlticket.fill = GridBagConstraints.BOTH;
		gbc_scrlpnlticket.gridx = 2;
		gbc_scrlpnlticket.gridy = 0;
		pnlInicio.add(scrlpnlticket, gbc_scrlpnlticket);

		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrlpnlticket.setViewportView(table);
		table.setModel(new DefaultTableModel(
				new Object[][] { { "ProPatatas", "x6", "34" }, { "fritas", "x4", "12" }, { "postre", "5", "5" },
						{ null, null, null }, { "gf", null, null }, { null, null, null }, { null, null, null }, },
				new String[] { "Product", "Cantidad", "Precio" }) {
			boolean[] columnEditables = new boolean[] { false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setMaxWidth(100);
		table.getColumnModel().getColumn(1).setMaxWidth(100);
		table.getColumnModel().getColumn(2).setMaxWidth(100);

		scrlpnlTescripcion = new JScrollPane();
		scrlpnlTescripcion.setPreferredSize(new Dimension(200, 200));
		scrlpnlTescripcion.setMaximumSize(new Dimension(1000, 1000));
		scrlpnlTescripcion.setMinimumSize(new Dimension(200, 230));
		GridBagConstraints gbc_scrlpnlTescripcion = new GridBagConstraints();
		gbc_scrlpnlTescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_scrlpnlTescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_scrlpnlTescripcion.gridx = 0;
		gbc_scrlpnlTescripcion.gridy = 1;
		pnlInicio.add(scrlpnlTescripcion, gbc_scrlpnlTescripcion);

		panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setMinimumSize(new Dimension(150, 150));
		panel_1.setMaximumSize(new Dimension(500, 500));
		panel_1.setPreferredSize(new Dimension(200, 200));
		scrlpnlTescripcion.setViewportView(panel_1);

		textAreaEsc = new JTextArea();
		textAreaEsc.setText("Soy la escricion\r\ne\r\nsas\r\nsacosas\r\ngh\r\n\r\nh\r\njh\r\nj");
		panel_1.add(textAreaEsc);

		pnlBilletes = new PanelCalculadora();
		pnlBilletes.setMaximumSize(new Dimension(350, 250));
		pnlBilletes.setPreferredSize(new Dimension(350, 250));
		pnlBilletes.setSize(new Dimension(300, 250));
		GridBagConstraints gbc_pnlBilletes = new GridBagConstraints();
		gbc_pnlBilletes.fill = GridBagConstraints.BOTH;
		gbc_pnlBilletes.insets = new Insets(0, 0, 5, 0);
		gbc_pnlBilletes.gridx = 2;
		gbc_pnlBilletes.gridy = 1;
		pnlInicio.add(pnlBilletes, gbc_pnlBilletes);
		// pnlBilletes.setLayout(new GridLayout(1, 0, 0, 0));

		pnlCambiosProductos = new JPanel();
		GridBagConstraints gbc_pnlCambiosProductos = new GridBagConstraints();
		gbc_pnlCambiosProductos.anchor = GridBagConstraints.NORTH;
		gbc_pnlCambiosProductos.insets = new Insets(0, 0, 0, 5);
		gbc_pnlCambiosProductos.fill = GridBagConstraints.HORIZONTAL;
		gbc_pnlCambiosProductos.gridx = 0;
		gbc_pnlCambiosProductos.gridy = 2;
		pnlInicio.add(pnlCambiosProductos, gbc_pnlCambiosProductos);

		btnAñadirProducto = new JButton("Añadir");
		btnAñadirProducto.addActionListener(new BtnAñadirProductoActionListener());
		pnlCambiosProductos.add(btnAñadirProducto);

		btnModificarProducto = new JButton("Modificar");
		btnModificarProducto.setIcon(null);
		pnlCambiosProductos.add(btnModificarProducto);

		btnEliminrroducto = new JButton("Eliminar");
		btnEliminrroducto.addActionListener(new BtnEliminrroductoActionListener());
		pnlCambiosProductos.add(btnEliminrroducto);

		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.NORTH;
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 2;
		pnlInicio.add(panel, gbc_panel);

		btnCompra = new JButton("Comprar");
		panel.add(btnCompra);

		btnBorrar = new JButton("Borrar");
		panel.add(btnBorrar);

		pnlPedidos = new JPanel();
		tabPrincipales.addTab("Pedidos", null, pnlPedidos, null);
		GridBagLayout gbl_pnlPedidos = new GridBagLayout();
		gbl_pnlPedidos.columnWidths = new int[]{532, 79, 770, 0};
		gbl_pnlPedidos.rowHeights = new int[]{40, 0, 0};
		gbl_pnlPedidos.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlPedidos.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		pnlPedidos.setLayout(gbl_pnlPedidos);
		
		button = new JButton("Añadir");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.EAST;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 0;
		pnlPedidos.add(button, gbc_button);
		
		btnModificar_1 = new JButton("Modificar");
		GridBagConstraints gbc_btnModificar_1 = new GridBagConstraints();
		gbc_btnModificar_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar_1.gridx = 1;
		gbc_btnModificar_1.gridy = 0;
		pnlPedidos.add(btnModificar_1, gbc_btnModificar_1);
		
		btnEliminar_1 = new JButton("Eliminar");
		GridBagConstraints gbc_btnEliminar_1 = new GridBagConstraints();
		gbc_btnEliminar_1.anchor = GridBagConstraints.WEST;
		gbc_btnEliminar_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnEliminar_1.gridx = 2;
		gbc_btnEliminar_1.gridy = 0;
		pnlPedidos.add(btnEliminar_1, gbc_btnEliminar_1);
		
		TbblPedidos = new JTabbedPane(JTabbedPane.LEFT);
		TbblPedidos.setPreferredSize(new Dimension(600, 350));
		TbblPedidos.setOpaque(true);
		TbblPedidos.setName("");
		TbblPedidos.setMinimumSize(new Dimension(500, 350));
		TbblPedidos.setBackground(Color.WHITE);
		GridBagConstraints gbc_TbblPedidos = new GridBagConstraints();
		gbc_TbblPedidos.gridwidth = 3;
		gbc_TbblPedidos.fill = GridBagConstraints.BOTH;
		gbc_TbblPedidos.gridx = 0;
		gbc_TbblPedidos.gridy = 1;
		pnlPedidos.add(TbblPedidos, gbc_TbblPedidos);
		
		pnldePedidosç = new JPanel();
		TbblPedidos.addTab("Pedidos", null, pnldePedidosç, null);
		pnldePedidosç.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_2 = new JPanel();
		panel_2.setMaximumSize(new Dimension(327, 327));
		pnldePedidosç.add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{108, 167, 125, 172, 204, 0};
		gbl_panel_2.rowHeights = new int[]{461, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		panel_3 = new JPanel();
		panel_3.setMaximumSize(new Dimension(327, 327));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridwidth = 5;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 0;
		panel_2.add(panel_3, gbc_panel_3);
		
		lblNombre_1 = new JLabel("Nombre:  ");
		GridBagConstraints gbc_lblNombre_1 = new GridBagConstraints();
		gbc_lblNombre_1.anchor = GridBagConstraints.EAST;
		gbc_lblNombre_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre_1.gridx = 0;
		gbc_lblNombre_1.gridy = 1;
		panel_2.add(lblNombre_1, gbc_lblNombre_1);
		
		txtNombre_1 = new JTextField();
		GridBagConstraints gbc_txtNombre_1 = new GridBagConstraints();
		gbc_txtNombre_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre_1.gridx = 1;
		gbc_txtNombre_1.gridy = 1;
		panel_2.add(txtNombre_1, gbc_txtNombre_1);
		txtNombre_1.setColumns(10);
		
		lblDireccion_1 = new JLabel("Direccion:  ");
		GridBagConstraints gbc_lblDireccion_1 = new GridBagConstraints();
		gbc_lblDireccion_1.anchor = GridBagConstraints.EAST;
		gbc_lblDireccion_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion_1.gridx = 0;
		gbc_lblDireccion_1.gridy = 2;
		panel_2.add(lblDireccion_1, gbc_lblDireccion_1);
		
		txtDireccion_1 = new JTextField();
		GridBagConstraints gbc_txtDireccion_1 = new GridBagConstraints();
		gbc_txtDireccion_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtDireccion_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccion_1.gridx = 1;
		gbc_txtDireccion_1.gridy = 2;
		panel_2.add(txtDireccion_1, gbc_txtDireccion_1);
		txtDireccion_1.setColumns(10);
		
		cmbTipo = new JComboBox();
		GridBagConstraints gbc_cmbTipo = new GridBagConstraints();
		gbc_cmbTipo.insets = new Insets(0, 0, 5, 5);
		gbc_cmbTipo.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbTipo.gridx = 3;
		gbc_cmbTipo.gridy = 2;
		panel_2.add(cmbTipo, gbc_cmbTipo);
		
		btnPagar = new JButton("Pagar");
		GridBagConstraints gbc_btnPagar = new GridBagConstraints();
		gbc_btnPagar.insets = new Insets(0, 0, 5, 0);
		gbc_btnPagar.gridx = 4;
		gbc_btnPagar.gridy = 2;
		panel_2.add(btnPagar, gbc_btnPagar);
		
		lblTelefono = new JLabel("Telefono:  ");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.EAST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 0;
		gbc_lblTelefono.gridy = 3;
		panel_2.add(lblTelefono, gbc_lblTelefono);
		
		txtTelefono = new JTextField();
		GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
		gbc_txtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefono.gridx = 1;
		gbc_txtTelefono.gridy = 3;
		panel_2.add(txtTelefono, gbc_txtTelefono);
		txtTelefono.setColumns(10);
		
		lblFechaRecogida = new JLabel("Fecha Recogida:  ");
		GridBagConstraints gbc_lblFechaRecogida = new GridBagConstraints();
		gbc_lblFechaRecogida.anchor = GridBagConstraints.EAST;
		gbc_lblFechaRecogida.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaRecogida.gridx = 2;
		gbc_lblFechaRecogida.gridy = 3;
		panel_2.add(lblFechaRecogida, gbc_lblFechaRecogida);
		
		frmtFechaRecogida = new JFormattedTextField();
		GridBagConstraints gbc_frmtFechaRecogida = new GridBagConstraints();
		gbc_frmtFechaRecogida.insets = new Insets(0, 0, 5, 5);
		gbc_frmtFechaRecogida.fill = GridBagConstraints.HORIZONTAL;
		gbc_frmtFechaRecogida.gridx = 3;
		gbc_frmtFechaRecogida.gridy = 3;
		panel_2.add(frmtFechaRecogida, gbc_frmtFechaRecogida);
		
		lblFechaInicio = new JLabel("Fecha:  ");
		GridBagConstraints gbc_lblFechaInicio = new GridBagConstraints();
		gbc_lblFechaInicio.anchor = GridBagConstraints.EAST;
		gbc_lblFechaInicio.insets = new Insets(0, 0, 0, 5);
		gbc_lblFechaInicio.gridx = 0;
		gbc_lblFechaInicio.gridy = 4;
		panel_2.add(lblFechaInicio, gbc_lblFechaInicio);
		
		frmtFechaInicio = new JFormattedTextField();
		GridBagConstraints gbc_frmtFechaInicio = new GridBagConstraints();
		gbc_frmtFechaInicio.insets = new Insets(0, 0, 0, 5);
		gbc_frmtFechaInicio.fill = GridBagConstraints.HORIZONTAL;
		gbc_frmtFechaInicio.gridx = 1;
		gbc_frmtFechaInicio.gridy = 4;
		panel_2.add(frmtFechaInicio, gbc_frmtFechaInicio);

		pnlMapa = new JPanel();
		tabPrincipales.addTab("Mapa", null, pnlMapa, null);
		GridBagLayout gbl_pnlMapa = new GridBagLayout();
		gbl_pnlMapa.columnWidths = new int[]{513, 61, 346, 0};
		gbl_pnlMapa.rowHeights = new int[]{298, 0, 295, 0};
		gbl_pnlMapa.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlMapa.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnlMapa.setLayout(gbl_pnlMapa);
		
		lstPedidos = new JList();
		GridBagConstraints gbc_lstPedidos = new GridBagConstraints();
		gbc_lstPedidos.anchor = GridBagConstraints.NORTH;
		gbc_lstPedidos.insets = new Insets(0, 0, 5, 5);
		gbc_lstPedidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_lstPedidos.gridx = 0;
		gbc_lstPedidos.gridy = 0;
		pnlMapa.add(lstPedidos, gbc_lstPedidos);
		
		btnIdioma = new JButton("Idioma");
		GridBagConstraints gbc_btnIdioma = new GridBagConstraints();
		gbc_btnIdioma.anchor = GridBagConstraints.NORTH;
		gbc_btnIdioma.insets = new Insets(0, 0, 5, 0);
		gbc_btnIdioma.gridx = 2;
		gbc_btnIdioma.gridy = 0;
		pnlMapa.add(btnIdioma, gbc_btnIdioma);
		
		edpnlMapa = new JEditorPane();
		GridBagConstraints gbc_edpnlMapa = new GridBagConstraints();
		gbc_edpnlMapa.insets = new Insets(0, 0, 0, 5);
		gbc_edpnlMapa.fill = GridBagConstraints.BOTH;
		gbc_edpnlMapa.gridx = 0;
		gbc_edpnlMapa.gridy = 2;
		pnlMapa.add(edpnlMapa, gbc_edpnlMapa);
		
		lstRepartidores = new JList();
		GridBagConstraints gbc_lstRepartidores = new GridBagConstraints();
		gbc_lstRepartidores.fill = GridBagConstraints.BOTH;
		gbc_lstRepartidores.gridx = 2;
		gbc_lstRepartidores.gridy = 2;
		pnlMapa.add(lstRepartidores, gbc_lstRepartidores);

		pnlClientes = new JPanel();
		tabPrincipales.addTab("Clientes", null, pnlClientes, null);
		GridBagLayout gbl_pnlClientes = new GridBagLayout();
		gbl_pnlClientes.columnWidths = new int[]{112, 246, 110, 223, 251, 0};
		gbl_pnlClientes.rowHeights = new int[]{30, 20, 20, 20, 43, 43, 47, 50, 0};
		gbl_pnlClientes.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlClientes.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		pnlClientes.setLayout(gbl_pnlClientes);
		
		btnIdioma_1 = new JButton("Idioma");
		GridBagConstraints gbc_btnIdioma_1 = new GridBagConstraints();
		gbc_btnIdioma_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnIdioma_1.gridx = 4;
		gbc_btnIdioma_1.gridy = 0;
		pnlClientes.add(btnIdioma_1, gbc_btnIdioma_1);
		
		lblNombre = new JLabel("Nombre:  ");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 1;
		pnlClientes.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.anchor = GridBagConstraints.NORTH;
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 1;
		pnlClientes.add(txtNombre, gbc_txtNombre);
		
		lblTelf = new JLabel("Telefono:  ");
		GridBagConstraints gbc_lblTelf = new GridBagConstraints();
		gbc_lblTelf.anchor = GridBagConstraints.EAST;
		gbc_lblTelf.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelf.gridx = 2;
		gbc_lblTelf.gridy = 1;
		pnlClientes.add(lblTelf, gbc_lblTelf);
		
		fTxtTelefono = new JFormattedTextField();
		GridBagConstraints gbc_fTxtTelefono = new GridBagConstraints();
		gbc_fTxtTelefono.anchor = GridBagConstraints.NORTH;
		gbc_fTxtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_fTxtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_fTxtTelefono.gridx = 3;
		gbc_fTxtTelefono.gridy = 1;
		pnlClientes.add(fTxtTelefono, gbc_fTxtTelefono);
		
		cmbBIntolerancias = new JComboBox();
		cmbBIntolerancias.setToolTipText("Intolerancias");
		GridBagConstraints gbc_cmbBIntolerancias = new GridBagConstraints();
		gbc_cmbBIntolerancias.anchor = GridBagConstraints.NORTH;
		gbc_cmbBIntolerancias.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbBIntolerancias.insets = new Insets(0, 0, 5, 0);
		gbc_cmbBIntolerancias.gridx = 4;
		gbc_cmbBIntolerancias.gridy = 1;
		pnlClientes.add(cmbBIntolerancias, gbc_cmbBIntolerancias);
		
		lblApellidos = new JLabel("Apellidos:  ");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 0;
		gbc_lblApellidos.gridy = 2;
		pnlClientes.add(lblApellidos, gbc_lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.anchor = GridBagConstraints.NORTH;
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.gridx = 1;
		gbc_txtApellidos.gridy = 2;
		pnlClientes.add(txtApellidos, gbc_txtApellidos);
		
		lblDireccion = new JLabel("Direccion:  ");
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.anchor = GridBagConstraints.EAST;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 2;
		gbc_lblDireccion.gridy = 2;
		pnlClientes.add(lblDireccion, gbc_lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
		gbc_txtDireccion.anchor = GridBagConstraints.NORTH;
		gbc_txtDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDireccion.gridx = 3;
		gbc_txtDireccion.gridy = 2;
		pnlClientes.add(txtDireccion, gbc_txtDireccion);
		
		cmbBHistorial = new JComboBox();
		cmbBHistorial.setToolTipText("Historial\r\n");
		GridBagConstraints gbc_cmbBHistorial = new GridBagConstraints();
		gbc_cmbBHistorial.anchor = GridBagConstraints.NORTH;
		gbc_cmbBHistorial.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbBHistorial.insets = new Insets(0, 0, 5, 0);
		gbc_cmbBHistorial.gridx = 4;
		gbc_cmbBHistorial.gridy = 2;
		pnlClientes.add(cmbBHistorial, gbc_cmbBHistorial);
		
		lblId = new JLabel("Id:  ");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 3;
		pnlClientes.add(lblId, gbc_lblId);
		
		txtInd = new JTextField();
		txtInd.setColumns(10);
		GridBagConstraints gbc_txtInd = new GridBagConstraints();
		gbc_txtInd.anchor = GridBagConstraints.NORTH;
		gbc_txtInd.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInd.insets = new Insets(0, 0, 5, 5);
		gbc_txtInd.gridx = 1;
		gbc_txtInd.gridy = 3;
		pnlClientes.add(txtInd, gbc_txtInd);
		
		lblPuntos = new JLabel("Puntos:  ");
		GridBagConstraints gbc_lblPuntos = new GridBagConstraints();
		gbc_lblPuntos.anchor = GridBagConstraints.EAST;
		gbc_lblPuntos.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos.gridx = 2;
		gbc_lblPuntos.gridy = 3;
		pnlClientes.add(lblPuntos, gbc_lblPuntos);
		
		txtPuntos = new JTextField();
		txtPuntos.setColumns(10);
		GridBagConstraints gbc_txtPuntos = new GridBagConstraints();
		gbc_txtPuntos.anchor = GridBagConstraints.NORTH;
		gbc_txtPuntos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPuntos.insets = new Insets(0, 0, 5, 5);
		gbc_txtPuntos.gridx = 3;
		gbc_txtPuntos.gridy = 3;
		pnlClientes.add(txtPuntos, gbc_txtPuntos);
		
		cmbBPreferencias = new JComboBox();
		cmbBPreferencias.setToolTipText("Preferencias");
		GridBagConstraints gbc_cmbBPreferencias = new GridBagConstraints();
		gbc_cmbBPreferencias.anchor = GridBagConstraints.NORTH;
		gbc_cmbBPreferencias.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbBPreferencias.insets = new Insets(0, 0, 5, 0);
		gbc_cmbBPreferencias.gridx = 4;
		gbc_cmbBPreferencias.gridy = 3;
		pnlClientes.add(cmbBPreferencias, gbc_cmbBPreferencias);
		
		btnAadir = new JButton("Añadir");
		GridBagConstraints gbc_btnAadir = new GridBagConstraints();
		gbc_btnAadir.anchor = GridBagConstraints.NORTH;
		gbc_btnAadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadir.gridx = 1;
		gbc_btnAadir.gridy = 4;
		pnlClientes.add(btnAadir, gbc_btnAadir);
		
		btnModificar = new JButton("Modificar");
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.anchor = GridBagConstraints.NORTH;
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 3;
		gbc_btnModificar.gridy = 4;
		pnlClientes.add(btnModificar, gbc_btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 0);
		gbc_btnEliminar.anchor = GridBagConstraints.NORTH;
		gbc_btnEliminar.gridx = 4;
		gbc_btnEliminar.gridy = 4;
		pnlClientes.add(btnEliminar, gbc_btnEliminar);
		
		tglbtnBuscar = new JToggleButton("Buscar");
		GridBagConstraints gbc_tglbtnBuscar = new GridBagConstraints();
		gbc_tglbtnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnBuscar.gridx = 1;
		gbc_tglbtnBuscar.gridy = 5;
		pnlClientes.add(tglbtnBuscar, gbc_tglbtnBuscar);
		
		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 5;
		gbc_textArea.insets = new Insets(0, 0, 5, 0);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 6;
		pnlClientes.add(textArea, gbc_textArea);
	}

	private class BtnAñadirProductoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			JPanel pestana;
			JPanel pestanaPanel;
		//	Component hijos[1];
			pestana = (JPanel) tabComidas.getSelectedComponent();
		//	hijos[]= pestana.getComponents();
			
			textAreaEsc.setText(String.valueOf(pestana));

			pestana.add(new Producto());
			pestana.repaint();
			pestana.revalidate();

		}
	}

	private class BtnEliminrroductoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			JPanel pestana;
			pestana = (JPanel) tabComidas.getSelectedComponent();
			if (pestana.getComponents().length >= 1) {
				pestana.remove(pestana.getComponents().length - 1);
				pestana.repaint();
				pestana.revalidate();
			}

		}
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}

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
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
import java.util.ArrayList;
import java.util.Iterator;
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
import javax.swing.JMenuBar;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.SystemColor;

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
	private JScrollPane scrollPaneBocadillos;
	private JPanel panel_1;
	private JTextArea textAreaEsc;
	private JScrollPane scrollPanePostre;
	private JScrollPane scrollPaneCarnes;
	private JScrollPane scrollPanePescado;
	private JScrollPane scrollPanePasta;
	private JScrollPane scrollPaneArroz;
	private JTable tablaPlatosCarne;
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
	private JEditorPane edpnlMapa;
	private JList lstPedidos;
	private JList lstRepartidores;
	private JButton btnIdioma_1;
	private JPanel pnldePedidos;
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
	private JButton btnMenuPerfilUsuario;
	private JLabel lblPetito;
	public static ArrayList<Producto> productos = new ArrayList<Producto>();
	private static String seleccionado = "";
	private Iterator<Producto> iterar = productos.iterator();

	public static JTable tblticket;
	private JScrollPane pnlClientesVips;
	private JTable tblClientesVips;

	private JTable tablaPlatosPez;
	private JTable tablaPlatosPasta;
	private JTable tablaPlatosArroz;
	private JTable tablaPlatosBocata;
	private JTable tablaPlatosPostre;
	private JPanel pnlBotonAñatirATicket;
	private JLabel label;
	private JPanel panel_4;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Set System L&F
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

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
		// lectura();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 1063, 693);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tabPrincipales = new JTabbedPane(JTabbedPane.TOP);
		tabPrincipales.setToolTipText("Soy penstañas\r\n");
		getFrame().getContentPane().add(tabPrincipales, BorderLayout.CENTER);

		pnlInicio = new JPanel();
		pnlInicio.setName("");
		tabPrincipales.addTab("Inicio", null, pnlInicio, null);
		GridBagLayout gbl_pnlInicio = new GridBagLayout();
		gbl_pnlInicio.columnWidths = new int[] { 1010, 0, 642, 0 };
		gbl_pnlInicio.rowHeights = new int[] { 363, 0, 53, 167, 39, 0 };
		gbl_pnlInicio.columnWeights = new double[] { 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_pnlInicio.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
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
		pnlComida.setLayout(new BorderLayout(0, 0));

		tabComidas = new JTabbedPane(JTabbedPane.LEFT);
		tabComidas.setName("");
		tabComidas.setPreferredSize(new Dimension(600, 350));
		tabComidas.setMinimumSize(new Dimension(500, 350));
		tabComidas.setOpaque(true);
		tabComidas.setBackground(Color.WHITE);
		pnlComida.add(tabComidas);

		scrollPaneCarnes = new JScrollPane();
		tabComidas.addTab("Carne", null, scrollPaneCarnes, null);

		tablaPlatosCarne = new JTable();
		tablaPlatosCarne.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		ListSelectionModel rowSM = tablaPlatosCarne.getSelectionModel();
		MiTabla tablaCarne = new MiTabla();
		rowSM.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
				if (!lsm.isSelectionEmpty()) {
					int filaSeleccionada = lsm.getMinSelectionIndex() + 1;
					textAreaEsc.setText("Fila " + filaSeleccionada + " seleccionada.\n"
							+ (String) tablaCarne.getDescripcion(lsm.getMinSelectionIndex()));
				}
			}
		});
		tablaPlatosCarne.setModel(tablaCarne);
		Object[] fila1 = { "", "Chuleton Buey", "Chuleton primeras caitates", "8.5" };
		tablaCarne.aniadeFila(fila1);

		scrollPaneCarnes.setViewportView(tablaPlatosCarne);

		scrollPanePescado = new JScrollPane();
		tabComidas.addTab("Pescado", null, scrollPanePescado, null);

		tablaPlatosPez = new JTable();
		tablaPlatosPez.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		MiTabla tablaPez = new MiTabla();
		ListSelectionModel rowSMp = tablaPlatosPez.getSelectionModel();
		rowSMp.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
				if (!lsm.isSelectionEmpty()) {
					int filaSeleccionada = lsm.getMinSelectionIndex() + 1;
					textAreaEsc.setText("Fila " + filaSeleccionada + " seleccionada.\n"
							+ (String) tablaPez.getDescripcion(lsm.getMinSelectionIndex()));
				}
			}
		});
		tablaPlatosPez.setModel(tablaPez);
		Object[] fila2 = { "", "Merluza", "Merluza Fresca con salsa marisco.\nAlérgenos:\nContiene pescado y mariscos",
				"9.5" };
		tablaPez.aniadeFila(fila2);
		scrollPanePescado.setViewportView(tablaPlatosPez);

		scrollPanePasta = new JScrollPane();
		tabComidas.addTab("Pasta", null, scrollPanePasta, null);

		tablaPlatosPasta = new JTable();
		tablaPlatosPasta.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		MiTabla tablaPasta = new MiTabla();
		tablaPlatosPasta.setModel(tablaPasta);
		ListSelectionModel rowSMp1 = tablaPlatosPasta.getSelectionModel();
		rowSMp1.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
				if (!lsm.isSelectionEmpty()) {
					int filaSeleccionada = lsm.getMinSelectionIndex() + 1;
					textAreaEsc.setText("Fila " + filaSeleccionada + " seleccionada.\n"
							+ (String) tablaPasta.getDescripcion(lsm.getMinSelectionIndex()));
				}
			}
		});
		tablaPlatosPasta.setModel(tablaPasta);
		Object[] fila3 = { "", "macarone", "salsa carbonara", "7" };
		tablaPasta.aniadeFila(fila3);
		scrollPanePasta.setViewportView(tablaPlatosPasta);

		scrollPaneArroz = new JScrollPane();
		tabComidas.addTab("Arroz", null, scrollPaneArroz, null);

		tablaPlatosArroz = new JTable();
		tablaPlatosArroz.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		MiTabla tablaArroz = new MiTabla();
		ListSelectionModel rowSMa = tablaPlatosArroz.getSelectionModel();
		rowSMa.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
				if (!lsm.isSelectionEmpty()) {
					int filaSeleccionada = lsm.getMinSelectionIndex() + 1;
					textAreaEsc.setText("Fila " + filaSeleccionada + " seleccionada.\n"
							+ (String) tablaArroz.getDescripcion(lsm.getMinSelectionIndex()));
				}
			}
		});
		tablaPlatosArroz.setModel(tablaArroz);
		Object[] fila4 = { "", "paella", "Valenciana", "12" };
		tablaArroz.aniadeFila(fila4);
		scrollPaneArroz.setViewportView(tablaPlatosArroz);

		scrollPaneBocadillos = new JScrollPane();
		tabComidas.addTab("Bocadillos", null, scrollPaneBocadillos, null);

		tablaPlatosBocata = new JTable();
		tablaPlatosBocata.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		MiTabla tablaBocata = new MiTabla();
		ListSelectionModel rowSMb = tablaPlatosBocata.getSelectionModel();
		rowSMb.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
				if (!lsm.isSelectionEmpty()) {
					int filaSeleccionada = lsm.getMinSelectionIndex() + 1;
					textAreaEsc.setText("Fila " + filaSeleccionada + " seleccionada.\n"
							+ (String) tablaBocata.getDescripcion(lsm.getMinSelectionIndex()));
				}
			}
		});
		tablaPlatosBocata.setModel(tablaBocata);
		Object[] fila5 = { "", "Bocata CAsa", "Los mejroes ingretietnes locale", "6" };
		tablaBocata.aniadeFila(fila5);
		scrollPaneBocadillos.setViewportView(tablaPlatosBocata);

		scrollPanePostre = new JScrollPane();
		tabComidas.addTab("Postres", null, scrollPanePostre, null);

		tablaPlatosPostre = new JTable();
		tablaPlatosPostre.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		MiTabla tablaPostre = new MiTabla();
		ListSelectionModel rowSMp3 = tablaPlatosPostre.getSelectionModel();
		rowSMp3.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
				if (!lsm.isSelectionEmpty()) {
					int filaSeleccionada = lsm.getMinSelectionIndex() + 1;
					textAreaEsc.setText("Fila " + filaSeleccionada + " seleccionada.\n"
							+ (String) tablaPostre.getDescripcion(lsm.getMinSelectionIndex()));
				}
			}
		});
		tablaPlatosPostre.setModel(tablaPostre);
		Object[] fila6 = { "", "Profiteroles", "Pooostreeee", "4" };
		tablaPostre.aniadeFila(fila6);
		scrollPanePostre.setViewportView(tablaPlatosPostre);

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

		tblticket = new JTable();
		tblticket.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		tblticket.setRowSelectionAllowed(false);

		MiTablaTicket Ticket = new MiTablaTicket();
		tblticket.setModel(Ticket);
		scrlpnlticket.setViewportView(tblticket);

		Object[] fila1Ticket = { "Costillas", 12.5, 3, 30.5 };
		Object[] fila2Ticket = { null, null, null, null };
		Object[] fila3Ticket = { "Entregado", null, null, null };
		Ticket.aniadeFila(fila1Ticket);
		Ticket.aniadeFila(fila2Ticket);
		Ticket.aniadeFila(fila3Ticket);

		pnlBotonAñatirATicket = new JPanel();
		GridBagConstraints gbc_pnlBotonAñatirATicket = new GridBagConstraints();
		gbc_pnlBotonAñatirATicket.insets = new Insets(0, 0, 5, 5);
		gbc_pnlBotonAñatirATicket.fill = GridBagConstraints.BOTH;
		gbc_pnlBotonAñatirATicket.gridx = 0;
		gbc_pnlBotonAñatirATicket.gridy = 1;
		pnlInicio.add(pnlBotonAñatirATicket, gbc_pnlBotonAñatirATicket);
		pnlBotonAñatirATicket.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		label = new JLabel("New label");
		pnlBotonAñatirATicket.add(label);
		
		panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 2;
		pnlInicio.add(panel_4, gbc_panel_4);
		
		btnNewButton = new JButton("New button");
		panel_4.add(btnNewButton);
		
				lblPetito = new JLabel("petito");
				panel_4.add(lblPetito);
				
						btnMenuPerfilUsuario = new JButton("Perfil");
						panel_4.add(btnMenuPerfilUsuario);
						btnMenuPerfilUsuario.addMouseListener(new BtnMenuPerfilUsuarioMouseListener());
						btnMenuPerfilUsuario.setBackground(Color.WHITE);

		scrlpnlTescripcion = new JScrollPane();
		scrlpnlTescripcion.setPreferredSize(new Dimension(200, 200));
		scrlpnlTescripcion.setMaximumSize(new Dimension(1000, 1000));
		scrlpnlTescripcion.setMinimumSize(new Dimension(200, 230));

		GridBagConstraints gbc_scrlpnlTescripcion = new GridBagConstraints();
		gbc_scrlpnlTescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_scrlpnlTescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_scrlpnlTescripcion.gridx = 0;
		gbc_scrlpnlTescripcion.gridy = 3;
		pnlInicio.add(scrlpnlTescripcion, gbc_scrlpnlTescripcion);

		panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setMinimumSize(new Dimension(150, 150));
		panel_1.setMaximumSize(new Dimension(500, 500));
		panel_1.setPreferredSize(new Dimension(200, 200));
		scrlpnlTescripcion.setViewportView(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		lblAquiVamosA = new JLabel(
				"escalao imagenes.Hay que usar objetos Image, no icon-ImageIO.reat lee la cosa , luego con getscaletInstance cambia el tamaño.Hacer cambio te image a icon para poter establecerlo como icono te algo.\r\n");
		lblAquiVamosA.setOpaque(true);
		panel_1.add(lblAquiVamosA);

		textAreaEsc = new JTextArea();
		textAreaEsc.setMaximumSize(new Dimension(500, 300));
		textAreaEsc.setText("Soy la escricion\r\ne\r\nsas\r\nsacosas\r\ngh\r\n\r\nh\r\njh\r\nj");
		panel_1.add(textAreaEsc);

		pnlBilletes = new PanelCalculadora();
		pnlBilletes.setMaximumSize(new Dimension(500, 350));
		pnlBilletes.setPreferredSize(new Dimension(400, 300));
		pnlBilletes.setSize(new Dimension(400, 300));
		GridBagConstraints gbc_pnlBilletes = new GridBagConstraints();
		gbc_pnlBilletes.gridheight = 2;
		gbc_pnlBilletes.fill = GridBagConstraints.BOTH;
		gbc_pnlBilletes.insets = new Insets(0, 0, 5, 0);
		gbc_pnlBilletes.gridx = 2;
		gbc_pnlBilletes.gridy = 2;
		pnlInicio.add(pnlBilletes, gbc_pnlBilletes);
		// pnlBilletes.setLayout(new GridLayout(1, 0, 0, 0));

		pnlCambiosProductos = new JPanel();
		GridBagConstraints gbc_pnlCambiosProductos = new GridBagConstraints();
		gbc_pnlCambiosProductos.insets = new Insets(0, 0, 0, 5);
		gbc_pnlCambiosProductos.fill = GridBagConstraints.BOTH;
		gbc_pnlCambiosProductos.gridx = 0;
		gbc_pnlCambiosProductos.gridy = 4;
		pnlInicio.add(pnlCambiosProductos, gbc_pnlCambiosProductos);

		btnAñadirProducto = new JButton("Añadir");
		btnAñadirProducto.addActionListener(new BtnAñadirProductoActionListener());
		pnlCambiosProductos.add(btnAñadirProducto);

		btnModificarProducto = new JButton("Modificar");
		pnlCambiosProductos.add(btnModificarProducto);

		btnEliminrroducto = new JButton("Eliminar");
		btnEliminrroducto.addActionListener(new BtnEliminrroductoActionListener());
		pnlCambiosProductos.add(btnEliminrroducto);

		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 4;
		pnlInicio.add(panel, gbc_panel);

		btnCompra = new JButton("Comprar");
		panel.add(btnCompra);

		btnBorrar = new JButton("Borrar");
		panel.add(btnBorrar);

		pnlPedidos = new JPanel();
		tabPrincipales.addTab("Pedidos", null, pnlPedidos, null);
		GridBagLayout gbl_pnlPedidos = new GridBagLayout();
		gbl_pnlPedidos.columnWidths = new int[] { 918, 0 };
		gbl_pnlPedidos.rowHeights = new int[] { 514, 277, 0 };
		gbl_pnlPedidos.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_pnlPedidos.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		pnlPedidos.setLayout(gbl_pnlPedidos);

		pnldePedidos = new JPanel();
		GridBagConstraints gbc_pnldePedidos = new GridBagConstraints();
		gbc_pnldePedidos.anchor = GridBagConstraints.NORTH;
		gbc_pnldePedidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_pnldePedidos.gridx = 0;
		gbc_pnldePedidos.gridy = 1;
		pnlPedidos.add(pnldePedidos, gbc_pnldePedidos);
		pnldePedidos.setLayout(new GridLayout(0, 1, 0, 0));

		panel_2 = new JPanel();
		panel_2.setMaximumSize(new Dimension(327, 327));
		pnldePedidos.add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 108, 167, 125, 172, 204, 0 };
		gbl_panel_2.rowHeights = new int[] { 461, 0, 0, 0, 0, 0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
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
		gbl_pnlMapa.columnWidths = new int[] { 513, 61, 346, 0 };
		gbl_pnlMapa.rowHeights = new int[] { 298, 0, 295, 0 };
		gbl_pnlMapa.columnWeights = new double[] { 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlMapa.rowWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		pnlMapa.setLayout(gbl_pnlMapa);

		lstPedidos = new JList();
		GridBagConstraints gbc_lstPedidos = new GridBagConstraints();
		gbc_lstPedidos.anchor = GridBagConstraints.NORTH;
		gbc_lstPedidos.insets = new Insets(0, 0, 5, 5);
		gbc_lstPedidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_lstPedidos.gridx = 0;
		gbc_lstPedidos.gridy = 0;
		pnlMapa.add(lstPedidos, gbc_lstPedidos);

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
		gbl_pnlClientes.columnWidths = new int[] { 112, 246, 110, 223, 251, 20, 0, -38 };
		gbl_pnlClientes.rowHeights = new int[] { 47, 30, 20, 20, 20, 43, 0 };
		gbl_pnlClientes.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 4.9E-324, 0.0, 1.0 };
		gbl_pnlClientes.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlClientes.setLayout(gbl_pnlClientes);

		pnlClientesVips = new JScrollPane();
		GridBagConstraints gbc_pnlClientesVips = new GridBagConstraints();
		gbc_pnlClientesVips.gridwidth = 9;
		gbc_pnlClientesVips.insets = new Insets(0, 0, 5, 0);
		gbc_pnlClientesVips.fill = GridBagConstraints.BOTH;
		gbc_pnlClientesVips.gridx = 0;
		gbc_pnlClientesVips.gridy = 0;
		pnlClientes.add(pnlClientesVips, gbc_pnlClientesVips);

		tblClientesVips = new JTable();
		pnlClientesVips.setViewportView(tblClientesVips);
		tblClientesVips.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		TablaVips TablaClientes = new TablaVips();
		tblClientesVips.setModel((TableModel) TablaClientes);

		Object[] filas1 = { 111, "Juanjo", "Rodriguez Montalban", "Rialejo 10", 665895475, 19 };
		TablaClientes.aniadeFila(filas1);

		lblNombre = new JLabel("Nombre:  ");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 2;
		pnlClientes.add(lblNombre, gbc_lblNombre);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.anchor = GridBagConstraints.NORTH;
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 2;
		pnlClientes.add(txtNombre, gbc_txtNombre);

		lblTelf = new JLabel("Telefono:  ");
		GridBagConstraints gbc_lblTelf = new GridBagConstraints();
		gbc_lblTelf.anchor = GridBagConstraints.EAST;
		gbc_lblTelf.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelf.gridx = 2;
		gbc_lblTelf.gridy = 2;
		pnlClientes.add(lblTelf, gbc_lblTelf);

		fTxtTelefono = new JFormattedTextField();
		GridBagConstraints gbc_fTxtTelefono = new GridBagConstraints();
		gbc_fTxtTelefono.anchor = GridBagConstraints.NORTH;
		gbc_fTxtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_fTxtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_fTxtTelefono.gridx = 3;
		gbc_fTxtTelefono.gridy = 2;
		pnlClientes.add(fTxtTelefono, gbc_fTxtTelefono);

		btnAadir = new JButton("Añadir   ");
		btnAadir.addActionListener(new BtnAadirActionListener());

		cmbBIntolerancias = new JComboBox();
		cmbBIntolerancias.setModel(new DefaultComboBoxModel(
				new String[] { "Intolerancias", "Frutos Secos", "Glúten", "Lactosa", "Marisco" }));
		cmbBIntolerancias.setToolTipText("Intolerancias");
		GridBagConstraints gbc_cmbBIntolerancias = new GridBagConstraints();
		gbc_cmbBIntolerancias.anchor = GridBagConstraints.NORTH;
		gbc_cmbBIntolerancias.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbBIntolerancias.insets = new Insets(0, 0, 5, 5);
		gbc_cmbBIntolerancias.gridx = 4;
		gbc_cmbBIntolerancias.gridy = 2;
		pnlClientes.add(cmbBIntolerancias, gbc_cmbBIntolerancias);
		btnAadir.setMinimumSize(new Dimension(75, 20));
		btnAadir.setMaximumSize(new Dimension(100, 23));
		btnAadir.setPreferredSize(new Dimension(90, 23));
		GridBagConstraints gbc_btnAadir = new GridBagConstraints();
		gbc_btnAadir.anchor = GridBagConstraints.WEST;
		gbc_btnAadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadir.gridx = 6;
		gbc_btnAadir.gridy = 2;
		pnlClientes.add(btnAadir, gbc_btnAadir);

		lblApellidos = new JLabel("Apellidos:  ");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 0;
		gbc_lblApellidos.gridy = 3;
		pnlClientes.add(lblApellidos, gbc_lblApellidos);

		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.anchor = GridBagConstraints.NORTH;
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.gridx = 1;
		gbc_txtApellidos.gridy = 3;
		pnlClientes.add(txtApellidos, gbc_txtApellidos);

		lblDireccion = new JLabel("Direccion:  ");
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.anchor = GridBagConstraints.EAST;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 2;
		gbc_lblDireccion.gridy = 3;
		pnlClientes.add(lblDireccion, gbc_lblDireccion);

		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
		gbc_txtDireccion.anchor = GridBagConstraints.NORTH;
		gbc_txtDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDireccion.gridx = 3;
		gbc_txtDireccion.gridy = 3;
		pnlClientes.add(txtDireccion, gbc_txtDireccion);

		cmbBHistorial = new JComboBox();
		cmbBHistorial.setModel(new DefaultComboBoxModel(new String[] { "Historial", "Pedido1", "Pedido2", "Pedido3" }));
		cmbBHistorial.setToolTipText("Historial\r\n");
		GridBagConstraints gbc_cmbBHistorial = new GridBagConstraints();
		gbc_cmbBHistorial.anchor = GridBagConstraints.NORTH;
		gbc_cmbBHistorial.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbBHistorial.insets = new Insets(0, 0, 5, 5);
		gbc_cmbBHistorial.gridx = 4;
		gbc_cmbBHistorial.gridy = 3;
		pnlClientes.add(cmbBHistorial, gbc_cmbBHistorial);

		btnModificar = new JButton("Modificar");
		btnModificar.setPreferredSize(new Dimension(90, 23));
		btnModificar.setMaximumSize(new Dimension(100, 23));
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnModificar.gridx = 6;
		gbc_btnModificar.gridy = 3;
		pnlClientes.add(btnModificar, gbc_btnModificar);

		lblId = new JLabel("Id:  ");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 4;
		pnlClientes.add(lblId, gbc_lblId);

		txtInd = new JTextField();
		txtInd.setColumns(10);
		GridBagConstraints gbc_txtInd = new GridBagConstraints();
		gbc_txtInd.anchor = GridBagConstraints.NORTH;
		gbc_txtInd.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInd.insets = new Insets(0, 0, 5, 5);
		gbc_txtInd.gridx = 1;
		gbc_txtInd.gridy = 4;
		pnlClientes.add(txtInd, gbc_txtInd);

		lblPuntos = new JLabel("Puntos:  ");
		GridBagConstraints gbc_lblPuntos = new GridBagConstraints();
		gbc_lblPuntos.anchor = GridBagConstraints.EAST;
		gbc_lblPuntos.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos.gridx = 2;
		gbc_lblPuntos.gridy = 4;
		pnlClientes.add(lblPuntos, gbc_lblPuntos);

		txtPuntos = new JTextField();
		txtPuntos.setEditable(false);
		txtPuntos.setColumns(10);
		GridBagConstraints gbc_txtPuntos = new GridBagConstraints();
		gbc_txtPuntos.anchor = GridBagConstraints.NORTH;
		gbc_txtPuntos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPuntos.insets = new Insets(0, 0, 5, 5);
		gbc_txtPuntos.gridx = 3;
		gbc_txtPuntos.gridy = 4;
		pnlClientes.add(txtPuntos, gbc_txtPuntos);

		cmbBPreferencias = new JComboBox();
		cmbBPreferencias.setModel(new DefaultComboBoxModel(
				new String[] { "Preferencias", "Azucar", "Canela", "Ketchup", "Mayonesa", "Sacarina", "Sal" }));
		cmbBPreferencias.setToolTipText("Preferencias");
		GridBagConstraints gbc_cmbBPreferencias = new GridBagConstraints();
		gbc_cmbBPreferencias.anchor = GridBagConstraints.NORTH;
		gbc_cmbBPreferencias.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbBPreferencias.insets = new Insets(0, 0, 5, 5);
		gbc_cmbBPreferencias.gridx = 4;
		gbc_cmbBPreferencias.gridy = 4;
		pnlClientes.add(cmbBPreferencias, gbc_cmbBPreferencias);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setMinimumSize(new Dimension(75, 20));
		btnEliminar.setMaximumSize(new Dimension(100, 23));
		btnEliminar.addActionListener(new BtnEliminarActionListener());
		btnEliminar.setPreferredSize(new Dimension(90, 23));
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnEliminar.gridx = 6;
		gbc_btnEliminar.gridy = 4;
		pnlClientes.add(btnEliminar, gbc_btnEliminar);

		ListSelectionModel rowSMtc = tblClientesVips.getSelectionModel();
		rowSM.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
				if (!lsm.isSelectionEmpty()) {
					int filaSeleccionada = lsm.getMinSelectionIndex() + 1;
				}
			}
		});

	}

	private class BtnAñadirProductoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			/*
			 * JScrollPane pestana; JPanel tabla; Producto plato = new Producto();
			 * 
			 * pestana = (JScrollPane) tabComidas.getSelectedComponent(); tabla = (JPanel)
			 * pestana.getViewport().getView(); productos.add(plato); tabla.add(plato);
			 * tabla.repaint(); tabla.revalidate(); // textAreaEsc.setText((String)
			 * arg0.getSource()); esto te da el boton asiq no // vale
			 */

			Object[] nuevaFila = { "foto.", "protuct", "tescripcion", "precio" };
			JScrollPane pestana;
			JTable tabla = new JTable();
			MiTabla modelo = new MiTabla();
			pestana = (JScrollPane) tabComidas.getSelectedComponent();
			tabla = (JTable) pestana.getViewport().getView();
			modelo = (MiTabla) tabla.getModel();
			modelo.aniadeFila(nuevaFila);
			modelo.fireTableDataChanged();

		}
	}

	private class BtnEliminrroductoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			/*
			 * JScrollPane pestana; JPanel tabla; int i = 0; Producto elemento = new
			 * Producto(); pestana = (JScrollPane) tabComidas.getSelectedComponent(); tabla
			 * = (JPanel) pestana.getViewport().getView();
			 * 
			 * /* if (tabla.getComponents().length >= 1) {
			 * tabla.remove(tabla.getComponents().length - 1); tabla.repaint();
			 * tabla.revalidate(); }
			 * 
			 * 
			 * while (iterar.hasNext()) { elemento = iterar.next(); i++; if
			 * (elemento.getNombre().equals(seleccionado)) { iterar.remove();
			 * tabla.remove(i); tabla.repaint(); tabla.revalidate(); } }
			 * 
			 */
			JScrollPane pestana;
			JTable tabla = new JTable();
			MiTabla modelo = new MiTabla();
			pestana = (JScrollPane) tabComidas.getSelectedComponent();
			tabla = (JTable) pestana.getViewport().getView();
			modelo = (MiTabla) tabla.getModel();
			int n = tabla.getSelectedRow();
			if (n != -1) {
				modelo.eliminaFila(tabla.getSelectedRow());
				modelo.fireTableDataChanged();
			}
		}
	}

	private class BtnMenuPerfilUsuarioMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent arg0) {

			Perfil usuario = new Perfil();
			usuario.setVisible(true);
		}

	}

	private class BtnAadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			TablaVips TablaVip = (TablaVips) tblClientesVips.getModel();
			Object[] nuevaFila = { txtInd.getText(), txtNombre.getText(), txtApellidos.getText(),
					txtDireccion.getText(), fTxtTelefono.getText(), 0 };
			TablaVip.aniadeFila(nuevaFila);
			TablaVip.fireTableDataChanged();
			txtInd.setText(null);
			txtNombre.setText(null);
			txtApellidos.setText(null);
			txtDireccion.setText(null);
			fTxtTelefono.setText(null);

		}
	}

	private class BtnEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			TablaVips TablaVip = (TablaVips) tblClientesVips.getModel();
			int n = tblClientesVips.getSelectedRow();
			if (n != -1)
				TablaVip.eliminaFila(tblClientesVips.getSelectedRow());
			TablaVip.fireTableDataChanged();
		}
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public String getSeleccionado() {
		return seleccionado;
	}

	public static void setSeleccionado(String sele) {
		seleccionado = sele;
	}

	/*
	 * public void lectura() { //JScrollPane pestana; JPanel tabla;
	 * 
	 * // pestana = tabComidas; tabla = pnlPlatosCarne; try (FileInputStream
	 * saveFile = new FileInputStream("saveFile.sav"); ObjectInputStream objectInput
	 * = new ObjectInputStream(saveFile);) {
	 * 
	 * while (objectInput.readObject() != null) { Producto leerPlato = (Producto)
	 * objectInput.readObject(); tabla.add(leerPlato); tabla.repaint();
	 * tabla.revalidate(); }
	 * 
	 * } catch (IOException eof) { System.out.println("Reached end of file"); }
	 * catch (ClassNotFoundException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 */
}

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
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.AbstractListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;
import java.awt.Component;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class Principal extends JFrame{

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
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 939, 693);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tabPrincipales = new JTabbedPane(JTabbedPane.TOP);
		tabPrincipales.setToolTipText("Soy penstañas\r\n");
		getFrame().getContentPane().add(tabPrincipales, BorderLayout.CENTER);

		pnlInicio = new JPanel();
		pnlInicio.setName("");
		tabPrincipales.addTab("Inicio", null, pnlInicio, null);
		GridBagLayout gbl_pnlInicio = new GridBagLayout();
		gbl_pnlInicio.columnWidths = new int[] { 1010, 0, 642, 0 };
		gbl_pnlInicio.rowHeights = new int[] { 195, 205, 65, 0 };
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
		pnlBilletes.setMaximumSize(new Dimension(500, 350));
		pnlBilletes.setPreferredSize(new Dimension(400, 300));
		pnlBilletes.setSize(new Dimension(400, 300));
		GridBagConstraints gbc_pnlBilletes = new GridBagConstraints();
		gbc_pnlBilletes.fill = GridBagConstraints.BOTH;
		gbc_pnlBilletes.insets = new Insets(0, 0, 5, 0);
		gbc_pnlBilletes.gridx = 2;
		gbc_pnlBilletes.gridy = 1;
		pnlInicio.add(pnlBilletes, gbc_pnlBilletes);
		// pnlBilletes.setLayout(new GridLayout(1, 0, 0, 0));

		pnlCambiosProductos = new JPanel();
		GridBagConstraints gbc_pnlCambiosProductos = new GridBagConstraints();
		gbc_pnlCambiosProductos.insets = new Insets(0, 0, 0, 5);
		gbc_pnlCambiosProductos.fill = GridBagConstraints.BOTH;
		gbc_pnlCambiosProductos.gridx = 0;
		gbc_pnlCambiosProductos.gridy = 2;
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
		gbc_panel.gridy = 2;
		pnlInicio.add(panel, gbc_panel);

		btnCompra = new JButton("Comprar");
		panel.add(btnCompra);

		btnBorrar = new JButton("Borrar");
		panel.add(btnBorrar);

		pnlPedidos = new JPanel();
		tabPrincipales.addTab("Pedidos", null, pnlPedidos, null);

		pnlMapa = new JPanel();
		tabPrincipales.addTab("Mapa", null, pnlMapa, null);

		pnlClientes = new JPanel();
		tabPrincipales.addTab("Clientes", null, pnlClientes, null);
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

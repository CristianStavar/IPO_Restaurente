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
import javax.swing.JViewport;
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

public class Principal {

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
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JPanel pnlCambiosProductos;
	private JButton btnAñadirProducto;
	private JButton btnEliminrroducto;
	private JButton btnModificarProducto;
	private JScrollPane scrollPaneBocadillos;
	private JPanel panel_1;
	private JTextArea textAreaEsc;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 912, 607);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tabPrincipales = new JTabbedPane(JTabbedPane.TOP);
		tabPrincipales.setToolTipText("Soy penstañas\r\n");
		frame.getContentPane().add(tabPrincipales, BorderLayout.CENTER);

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
		
		scrollPaneCarnes = new JScrollPane();
		tabComidas.addTab("Carne", null, scrollPaneCarnes, null);
		
		pnlPlatosCarne = new JPanel();
		scrollPaneCarnes.setViewportView(pnlPlatosCarne);
		pnlPlatosCarne.setLayout(new GridLayout(0, 1, 0, 0));
		
		scrollPanePescado = new JScrollPane();
		tabComidas.addTab("Pescado", null, scrollPanePescado, null);
		
		pnlPlatosPescado = new JPanel();
		scrollPanePescado.setViewportView(pnlPlatosPescado);
		pnlPlatosPescado.setLayout(new GridLayout(0, 1, 0, 0));
		
		scrollPanePasta = new JScrollPane();
		tabComidas.addTab("Pasta", null, scrollPanePasta, null);
		
		pnlPlatosPasta = new JPanel();
		scrollPanePasta.setViewportView(pnlPlatosPasta);
		pnlPlatosPasta.setLayout(new GridLayout(0, 1, 0, 0));
		
		scrollPaneArroz = new JScrollPane();
		tabComidas.addTab("Arroz", null, scrollPaneArroz, null);
		
		pnlPlatosArroz = new JPanel();
		scrollPaneArroz.setViewportView(pnlPlatosArroz);
		pnlPlatosArroz.setLayout(new GridLayout(0, 1, 0, 0));

		scrollPaneBocadillos = new JScrollPane();
		tabComidas.addTab("Bocadillos", null, scrollPaneBocadillos, null);
		
		pnlPlatosBocadillos = new JPanel();
		scrollPaneBocadillos.setViewportView(pnlPlatosBocadillos);
		pnlPlatosBocadillos.setLayout(new GridLayout(0, 1, 0, 0));
		
		scrollPanePostre = new JScrollPane();
		tabComidas.addTab("Postres", null, scrollPanePostre, null);
		
		pnlPlatosostre = new JPanel();
		scrollPanePostre.setViewportView(pnlPlatosostre);
		pnlPlatosostre.setLayout(new GridLayout(0, 1, 0, 0));

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
		
				lblAquiVamosA = new JLabel(
						"escalao imagenes.Hay que usar objetos Image, no icon-ImageIO.reat lee la cosa , luego con getscaletInstance cambia el tamaño.Hacer cambio te image a icon para poter establecerlo como icono te algo.\r\n");
				panel_1.add(lblAquiVamosA);

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

		btnNewButton_1 = new JButton("comprar");
		panel.add(btnNewButton_1);

		btnNewButton_2 = new JButton("O no");
		panel.add(btnNewButton_2);

		pnlPedidos = new JPanel();
		tabPrincipales.addTab("Pedidos", null, pnlPedidos, null);

		pnlMapa = new JPanel();
		tabPrincipales.addTab("Mapa", null, pnlMapa, null);

		pnlClientes = new JPanel();
		tabPrincipales.addTab("Clientes", null, pnlClientes, null);
	}

	private class BtnAñadirProductoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			JScrollPane pestana;
		
			JPanel tabla;
		
			pestana = (JScrollPane) tabComidas.getSelectedComponent();
		
			tabla=(JPanel) pestana.getViewport().getView();
			
		

			tabla.add(new Producto());
			tabla.repaint();
			tabla.revalidate();

		}
	}

	private class BtnEliminrroductoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			JScrollPane pestana;
		
			JPanel tabla;
		
			pestana = (JScrollPane) tabComidas.getSelectedComponent();
		
			tabla=(JPanel) pestana.getViewport().getView();
			
			if (tabla.getComponents().length >= 1) {
				tabla.remove(tabla.getComponents().length - 1);
				tabla.repaint();
				tabla.revalidate();
			}

		}
	}
}

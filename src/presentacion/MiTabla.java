package presentacion;

import java.util.*;
import javax.swing.table.*;

public class MiTabla extends AbstractTableModel {

	private String[] nombreColumnas = { "Foto", "Producto", "Descripción", "Precio" };
	private Vector datos = new Vector();

	public int getColumnCount() {
		return nombreColumnas.length;
	}

	public int getRowCount() {
		return datos.size();
	}

	public String getColumnName(int col) {
		return nombreColumnas[col];
	}

	public Object getValueAt(int row, int col) {
		Object[] fila = (Object[]) datos.elementAt(row);
		return fila[col];
	}

	public boolean isCellEditable(int row, int col) {
		return true;
	}

	public void setValueAt(Object value, int row, int col) {
		if (row < getRowCount() && col < getColumnCount()) {
			Object[] fila = (Object[]) datos.elementAt(row);
			fila[col] = value;
			fireTableCellUpdated(row, col);
		}
	}

	public void eliminaFila(int row) {
		datos.remove(row);
	}

	public void aniadeFila(Object[] row) {
		datos.add(row);
	}

	public String getDescripcion(int row) {
		String descripcion = null;
		Object[] fila = (Object[]) datos.elementAt(row);
		descripcion = (String) fila[2];
		return descripcion;
	}

	public double getPrecio(int row) {
		double precio = 0;
		String p2 = null;
		Object[] fila = (Object[]) datos.elementAt(row);
		precio = (double) fila[3];

		return precio;
	}

	public String getNombre(int row) {
		String nombre = null;
		Object[] fila = (Object[]) datos.elementAt(row);
		nombre = (String) fila[1];
		return nombre;
	}

}

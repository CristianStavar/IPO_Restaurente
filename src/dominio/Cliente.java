package dominio;

public class Cliente {
	private String apellido;
	private String nombre;
	private int telefono;
	private String direccion;
	private String preferencias;
	private int puntos;

	public Cliente(String apellido, String nombre, String direccion, int telefono, String preferencias, int puntos) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.preferencias = preferencias;
		this.puntos = puntos;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPreferencias() {
		return preferencias;
	}

	public void setPreferencias(String preferencias) {
		this.preferencias = preferencias;
	}

}

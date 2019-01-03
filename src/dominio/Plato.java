package dominio;

public class Plato {

	private String foto;
	private String nombre;
	private String precio;
	private String descripcion;

	public Plato(String foto, String nombre, String precio, String descripcion) {
		super();
		this.foto = foto;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}

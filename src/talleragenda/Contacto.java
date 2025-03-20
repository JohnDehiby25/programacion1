package talleragenda;

public class Contacto {

	private String nombre;
	
	private String alias;
	
	private String direccion;
	
	private String telefono;
	
	private String email;
	
	public Contacto(String nombre, String alias, String direccion, String telefono, String email) {
		
		this.nombre=nombre;
		
		this.alias = alias;
		
		this.direccion = direccion;
		
		this.telefono = telefono;
		
		this.email = email;
	}
	
	public String datosGenerales() {
		
		return "Nombre: " + nombre + " Alias: " + alias + " Direccion: " +
		direccion + " Telefono: " + telefono + " Email: " + email;
	}
	
	public String getnombre() {
		
		return nombre;
	}
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String getTelefono() {
		
		return telefono;
	}
	public void setTelefono(String telefono) {
		
		this.telefono = telefono;
	}
	
	
	
}

package poo;

public class Empleado {

	public static void main(String[] args) {
		UsoEmpleado empleado1 = new UsoEmpleado("2323322", "juan", "gerente", "fefefef@gmail.com", "233443222", "23/22/2004");
		System.out.println(empleado1.damenombreCompleto());

	}

}

class UsoEmpleado{
	
	public UsoEmpleado(String numero, String nombre, String puesto, String correo, String telefono, String fechaContratacion) {
		
		numeroIdentificacion=numero;
		nombreCompleto=nombre;
		this.puesto=puesto;
		this.correo = correo;
		numeroTelefono = telefono;
		this.fechaContratacion = fechaContratacion;
		
	}
	
	private String numeroIdentificacion;
	private String nombreCompleto;
	private String puesto;
	private String correo;
	private String numeroTelefono;
	private String fechaContratacion;
	
	public String damenumeroId() {
		return numeroIdentificacion;
	}
	
	public String damenombreCompleto() {
		return nombreCompleto;
	}
	
	public String damePuesto() {
		return puesto;
	}
	
	public String dameCorreo() { 
		return correo;
	}
	
	public String damenumeroTelefono() {
		return numeroTelefono;
	}
	
	public String damefechaContrato() { 
		return fechaContratacion;
	}
	
	public void establecernumeroId(String numero) {
		
		numeroIdentificacion = numero;
	}
	
	public void establecernombre(String nombre) {
		nombreCompleto = nombre;
	}
	
	public void establecerpuesto(String puesto) { 
		this.puesto = puesto;
	}
	
	public void establecercorreo(String correo) {
		this.correo = correo;
	}
	
	public void establecernumeroTelefono(String telefono) {
		numeroTelefono = telefono;
	}
	
	public void establecerfechaContrato(String fechaContrato) {
		fechaContratacion = fechaContrato;
	}
	
}


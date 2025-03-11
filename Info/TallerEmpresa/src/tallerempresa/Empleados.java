package tallerempresa;

public class Empleados {
	private String nombre;
	private String cedula;
	private String cargo;
	private int anios;
	private double salario;
	
	public Empleados(String nombre, String cedula, String cargo, int anios) {
		
		this.nombre=nombre;
		this.cedula=cedula;
		this.cargo = cargo;
		this.anios= anios;
		
	}
	public void setNombre(String nombre) {
		
		this.nombre=nombre;
	}
	public void setCedula(String cedula) {
		this.cedula=cedula;
	}
	public void setCargo(String cargo) {
		
		this.cargo=cargo;
	}
	
	public void setAnios(int anios) {
		
		this.anios=anios;
	}
	public void setSalario(double salario) {
		
		this.salario= salario;
	}
	public double getSalario() {
		
		return salario;
	}
	public String getNombre() {
		
		return nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public String getCargo() {
		
		return cargo;
	}
	public int getAnios() {
		
		return anios;
	}
	
	@Override
	public String toString() {
		
		return "Empleado: " + nombre + " Cedula: " + cedula + " Cargo: "
				+ cargo + " Años en la empresa: " + anios + " Salario: "
				+ salario;
	}
	
}


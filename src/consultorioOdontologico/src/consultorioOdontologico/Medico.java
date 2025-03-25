package consultorioOdontologico;

public class Medico {

	private String id;
	private String nombre;
	private String numeroLicencia;
	private TipoMedico tipomedico;
	
	public Medico(String id, String nombre, String numeroLicencia, TipoMedico tipomedico) {
		
		this.id=id;
		this.nombre=nombre;
		this.numeroLicencia = numeroLicencia;
		this.tipomedico = tipomedico;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setNumeroLicencia(String numeroLicencia) {
		this.numeroLicencia=numeroLicencia;
	}
	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String numeroLicencia() {
		return numeroLicencia;
	}
	
}

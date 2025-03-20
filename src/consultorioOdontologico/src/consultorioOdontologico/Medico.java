package consultorioOdontologico;

public class Medico {
	
	private String id;
	private String nombre;
	private String numeroLicencia;
	Paciente[] listPacientes;
	
	public Medico(String id, String nombre, String numeroLicencia) {
		
		this.id = id;
		this.nombre=nombre;
		this.numeroLicencia=numeroLicencia;
		listPacientes= new Paciente[20];
		
	}
	public String getNombre() {
		
		return nombre;
	}
	public String getId() {
		
		return id;
	}
	public String getNumeroLicencia() {
		
		return numeroLicencia;
	}
	public void setNombre(String nombre) {
		
		this.nombre=nombre;
	}
	public void setId(String id) {
		
		this.id=id;
	}
	public boolean crearPaciente(Paciente newPaciente) {
		
		int espaciolibre= validarCupoPaciente();
		
		if(espaciolibre!=-1 && buscarPacienteTelefono(newPaciente.telefono())==-1) {
			
			listPacientes[espaciolibre]=newPaciente;
			
			return true;
		}
		return false;
	}
	
	public int validarCupoPaciente() {
		
		for(int i =0; i<listPacientes.length; i++) {
			
			if(listPacientes[i] == null) {
				
				return i;
			}
		}
		return -1;
	}
	
	public int buscarPacienteTelefono(String telefono) {
		
		for(int i=0; i<listPacientes.length; i++) {
			
			if(listPacientes[i].telefono().equals(telefono)) {
				
				return i;
			}
		}
		return -1;
	}
	
	public boolean actualizarPaciente(String idPacienteModificar, Paciente pacienteModificado) {
		
		int posicionPacienteModificar = buscarPacienteTelefono(idPacienteModificar);
		
		if(posicionPacienteModificar !=-1) {
			
			listPacientes[posicionPacienteModificar] = pacienteModificado;
			
			return true;
		}
		return false;
	}
	
	public boolean eliminarPaciente(String idPacienteEliminar) {
		
		for(int i=0; i<listPacientes.length; i++) {
			if(listPacientes[i].idHistoriaClinica().equals(idPacienteEliminar)) {
				
				listPacientes[i]=null;
				return true;
			}
		}
		return false;
	}
	
	public void setListPacientes(Paciente[] listPacientes) {
		
		this.listPacientes = listPacientes;
	}
	
	public Paciente[] getListPacientes() {
		
		return listPacientes;
	}
	
	public Paciente[] determinarPacientesRevisionGratis() {
		
		int contador =0;
		
		for(int i=0; i<listPacientes.length; i++) {
			
			if(listPacientes[i].numeroTratamientos() >= 5) {
				
				contador++;
			}
		}
		
		Paciente[] listPacientesRevisionGratis = new Paciente[contador];
		
		int index = 0;
		
		for(int i=0; i<listPacientes.length; i++) {
			
			if(listPacientes[i].numeroTratamientos() >= 5) {
				
				listPacientesRevisionGratis[index] = listPacientes[i];
				
				index++;
			}
		}
		return listPacientesRevisionGratis;
		
	}
	

}

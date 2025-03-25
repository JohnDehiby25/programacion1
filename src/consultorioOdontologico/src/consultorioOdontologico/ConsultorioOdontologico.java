package consultorioOdontologico;

import java.util.*;

public class ConsultorioOdontologico {
	
	private String nombre;
	private String direccion;
	private String telefono;
	private ArrayList<Medico> listMedicos;
	private ArrayList<Paciente> listPacientes;
	
	public ConsultorioOdontologico(String nombre, String direccion,String telefono) {
		
		this.nombre=nombre;
		this.direccion=direccion;
		this.telefono=telefono;
		this.listMedicos = new ArrayList<>();
		this.listPacientes = new ArrayList<>();
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	
	public void setTelefono(String telefono) {
		this.telefono=telefono;
	}
	
	public boolean agregarMedico(Medico newMedico) {
		if(buscarMedicoId(newMedico.getId()) ==-1){
			listMedicos.add(newMedico);
			return true;
		}
		return false;
	}
	public int buscarMedicoId(String id) {
		for(int i=0; i<listMedicos.size(); i++) {
			if(listMedicos.get(i).getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	public boolean eliminarMedico(String id) {
		int medicoEliminar = buscarMedicoId(id);
		if(medicoEliminar !=-1) {
			listMedicos.remove(medicoEliminar);
			return true;
		}
		return false;
	}
	public boolean actualizarMedico(String idMedicoActualizar,Medico medicoModificado) {
		int posicionMedicoModificar = buscarMedicoId(idMedicoActualizar);
		if(posicionMedicoModificar !=-1) {
			listMedicos.set(posicionMedicoModificar, medicoModificado);
			return true;
		}
		return false;
	}
	public void setListMedicos(ArrayList<Medico> listMedicos) {
		this.listMedicos=listMedicos;
	}
	public ArrayList<Medico> getListMedicos(){
		return listMedicos;
	}
	public boolean crearPaciente(Paciente newPaciente) {
		if(buscarPacienteId(newPaciente.idHistoriaClinica())==-1) {
			listPacientes.add(newPaciente);
			return true;
		}
		return false;
	}
	public int buscarPacienteId(String id) {
		for(int i =0; i<listPacientes.size();i++) {
			if(listPacientes.get(i).idHistoriaClinica().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	public boolean actualizarPaciente(String idHistoriaClinica, Paciente pacienteModificado) {
		int posicionPacienteModificar = buscarPacienteId(idHistoriaClinica);
		if(posicionPacienteModificar != -1) {
			listPacientes.set(posicionPacienteModificar, pacienteModificado);
			return true;
		}
		return false;
	}
	public void setListPacientes(ArrayList<Paciente> listPacientes) {
		this.listPacientes=listPacientes;
	}
	public ArrayList<Paciente> getListPacientes(){
		return listPacientes;
	}
	public ArrayList<Paciente> obtenerListaPacientesRevisionGratis(){
		ArrayList<Paciente> pacientesRevisionGratis = new ArrayList<>();
		
		for(Paciente paciente: listPacientes) {
			if(paciente.numeroTratamientos()>=5) {
				pacientesRevisionGratis.add(paciente);
			}
		}return pacientesRevisionGratis;
	}
	
	
	
	
	
	
	

}

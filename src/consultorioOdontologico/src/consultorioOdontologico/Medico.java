package consultorioOdontologico;

import java.util.ArrayList;
import java.util.List;


public class Medico {

    private String id;
    private String nombre;
    private String numeroLicencia;
    private EspecialidadOdontologica especialidad;
    private List<Paciente> listPacientes;

    public Medico(String id, String nombre, String numeroLicencia, EspecialidadOdontologica especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.numeroLicencia = numeroLicencia;
        this.especialidad = especialidad;
        this.listPacientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public EspecialidadOdontologica getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(EspecialidadOdontologica especialidad) {
        this.especialidad = especialidad;
    }

    public List<Paciente> getListPacientes() {
        return new ArrayList<>(listPacientes);
    }

    public boolean crearPaciente(Paciente newPaciente) {
        if (buscarPacienteTelefono(newPaciente.telefono()) == -1) {
            listPacientes.add(newPaciente);
            return true;
        }
        return false;
    }

    public int buscarPacienteTelefono(String telefono) {
        for (int i = 0; i < listPacientes.size(); i++) {
            if (listPacientes.get(i).telefono().equals(telefono)) {
                return i;
            }
        }
        return -1;
    }

    public boolean actualizarPaciente(String idPacienteModificar, Paciente pacienteModificado) {
        
    	int posicionPacienteModificar = buscarPacienteTelefono(idPacienteModificar);
        if (posicionPacienteModificar != -1) {
            listPacientes.set(posicionPacienteModificar, pacienteModificado);
            return true;
        }
        return false;
    }

    public List<Paciente> determinarPacientesRevisionGratis() {
        List<Paciente> pacientesRevisionGratis = new ArrayList<>();
        
        for (Paciente paciente : listPacientes) {
            if (paciente.numeroTratamientos() >= 5) {
                pacientesRevisionGratis.add(paciente);
            }
        }
        return pacientesRevisionGratis;
    }
}
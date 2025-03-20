package talleragenda;

public class Grupo {

	private String nombre;
	
	private Contacto [] listContactos;
	
	public Grupo(String nombre) {
		
		this.nombre=nombre;
		
		this.listContactos = new Contacto[5];
	}
	
	public void SetNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean crearContacto(Contacto newContacto) {
		
		int espacioLibre = validarCupoContacto();
		
		if(espacioLibre != -1 && buscarContactoTelefono(newContacto.getTelefono()) ==-1) {
			
			listContactos[espacioLibre] = newContacto;
			
			return true;
		}
		return false;
	}
	
	public int validarCupoContacto() {
		
		for(int i=0; i<listContactos.length; i++) {
			
			if(listContactos[i] == null) {
				
				return i;
			}
		}
		return -1;
	}
	
	public int buscarContactoTelefono(String telefono) {
		
		for(int i=0; i<listContactos.length; i++) {
			
			if(listContactos[i].getTelefono().equals(telefono)) {
				return i;
				
			}
		}
		return -1;
	}
	
	public boolean actualizarContacto(String telefonoContactoModificar, Contacto contactoModificado) {
		
		int posicionContactoModificar = buscarContactoTelefono(telefonoContactoModificar);
		
		if(posicionContactoModificar !=-1) {
			
			listContactos[posicionContactoModificar] = contactoModificado;
			
			return true;
		}
		return false;
	}
	
	public boolean eliminarContacto(String telefono) {
		
		int posicionContactoEliminar = buscarContactoTelefono(telefono);
		
		if(posicionContactoEliminar != -1) {
			
			listContactos[posicionContactoEliminar] = null;
			
			return true;
		}
		return false;
	}
	
	public void setListContactos(Contacto[] listaContactos) {
		
		this.listContactos = listContactos;
	}
	public Contacto[] getListContactos() {
		
		return listContactos;
	}
	
	public boolean validarContactoRepetido(String telefono, String nombre) {
		
		for(Contacto c: listContactos) {
			
			if(c.getTelefono().equalsIgnoreCase(telefono) && c.getnombre().equalsIgnoreCase(nombre)) {
				
				return true;
			}
		}
		return false;
		
	}
	
	
	
	
	
	
	
}

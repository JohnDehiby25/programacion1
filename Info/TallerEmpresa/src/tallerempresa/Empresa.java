package tallerempresa;

public class Empresa {
	
	private String nit;
	
	private String nombre;
	
	private Empleados[] listEmpleados;
	
	public Empresa(String nit, String nombre) {
		
		this.nit=nit;
		
		this.nombre= nombre;
		
		this.listEmpleados = new Empleados[50];
		
	}
	
	public void setNit(String nit) {
		
		this.nit= nit;
	}
	
	public String getNit() {
		
		return nit;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public boolean crearEmpleado(Empleados newEmpleado) {
		
		int espacioLibre= validarCupoEmpleado();
		
		if(espacioLibre != -1 && buscarEmpleadoCedula(newEmpleado.getCedula()) == -1) {
			
			listEmpleados[espacioLibre] = newEmpleado;
			
			return true;
		}
		return false;
	}
	
	public int validarCupoEmpleado() {
		
	    for (int i = 0; i < listEmpleados.length; i++) {
	    	
	        if (listEmpleados[i] == null) {
	        	
	            return i;
	        }
	    }
	    return -1;
	}
	
	public int buscarEmpleadoCedula(String cedula) {
		
		for(int i=0; i<listEmpleados.length; i++) {
			
			if(listEmpleados[i].getCedula().equals(cedula)) {
				
				return i;
			}
		}
		return -1;
	}
	
	public boolean actualizarEmpleado(String idEmpleadoModificar, Empleados empleadoModificado) {
		
		int posicionEmpleadoBuscar = buscarEmpleadoCedula(idEmpleadoModificar);
		
		if(posicionEmpleadoBuscar != -1) {
			
			listEmpleados[posicionEmpleadoBuscar] = empleadoModificado;
			
			return true;
		}
		return false;
	}
	
	public boolean eliminarEmpleado(String idEmpleadoEliminar) {
		
		int posicionEmpleadoEliminar = buscarEmpleadoCedula(idEmpleadoEliminar);
		
		if(posicionEmpleadoEliminar != -1) {
			
			listEmpleados[posicionEmpleadoEliminar] = null;
			
			return true;
		}
		return false;
	}
	
	public void setListEmpleados(Empleados [] listEmpleados) {
		
		this.listEmpleados= listEmpleados;
	}
	
	public Empleados[] getListEmpleados() {
		
		return listEmpleados;
	}
	
	public Empleados[] buscarEmpleadosCargo(String cargo) {
		
		int contador=0;
		
		for(int i = 0; i<listEmpleados.length; i++) {
			
			if(listEmpleados[i].getCargo().equals(cargo)) {
				
				contador++;
			}
		}
		Empleados[] listEmpleadosCargo = new Empleados[contador];
		
		int posicion=0;
		
		for (int i =0; i<listEmpleados.length; i++) {
			
			if(listEmpleados[i].getCargo().equals(cargo)) {
				
				listEmpleadosCargo[posicion] = listEmpleados[i];
				
				posicion++;
			}
		}
		return listEmpleadosCargo;
	}
	
	public double salarioSegunCargo(String cargo) {
		
		cargo = cargo.toLowerCase();
				
		switch (cargo) {
		
		case "Administrador":
			
			return 1000000;
		
		case "Gerente":
			
			return 2000000;
			
		case "Jefe":
			
			return 4000000;
			
		default:
			
			return  600000;
		}
	}
	
	public double calcularNomina(Empleados[] listEmpleados) {
		
		double nominaTotal = 0;
		
		for(int i =0; i<listEmpleados.length; i++) {
			
			double salarioBase = salarioSegunCargo(listEmpleados[i].getCargo());
			
			int anios = listEmpleados[i].getAnios();
			
			double bono = 0;
			
			if(anios > 10) {
				
				bono+= 0.15;
			}
			else if(anios > 5){
				
				bono+=0.10;
			}
			else if(anios > 3){
				
				bono+= 0.05;
			}else {
				
				bono+=0.0;
			}
			double salarioFinal = salarioBase+(salarioBase*bono);
			nominaTotal += salarioFinal;
			
		}
		return nominaTotal;
	}
	
	public Empleados[] empleadosSalarioAlto (double nominaTotal) {
		
		Empleados [] empleadoSalarioAlto = new Empleados[0];
		
		for(int i = 1; i<listEmpleados.length; i++) {
			
			if(listEmpleados[i].calcularNomina(nominaTotal) > empleadoSalarioAlto) {
				
				empleadoSalarioAlto[listEmpleados] = listEmpleados[i]; 
			}
		
		}
		
	}
	
	
}

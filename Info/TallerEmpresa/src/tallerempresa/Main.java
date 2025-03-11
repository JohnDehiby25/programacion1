package tallerempresa;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String nombreEmpresa = JOptionPane.showInputDialog(null, "Ingrese el nombre de la empresa: ");
		
		String nit = JOptionPane.showInputDialog(null, "Ingrese el nit de la empresa: ");
		
		Empresa empresa = new Empresa(nombreEmpresa,nit);
		
		String nombreEmpleado = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado");
		
		String cedula = JOptionPane.showInputDialog(null, "Ingrese la cedula del empleado");
		
		String cargo = JOptionPane.showInputDialog(null, "Ingrese el cargo del empleado");
		
		int anios = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los años en la empresa del empleado"));
		
		
		Empleados empleado = new Empleados (nombreEmpleado,cedula,cargo,anios);
		
		boolean empleadoCreado = empresa.crearEmpleado(empleado);
		
		if(empleadoCreado) {
			JOptionPane.showMessageDialog(null, "El empleado fue registrado correctamente");
		}else {
			JOptionPane.showMessageDialog(null, "El empleado no se pudo registrar, verifique si ya existe, o si hay espacio");
		}

	}

}

package tallerempresa;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
			
		Empresa empresa = new Empresa("124433232", "BBC");
		
		cargarDatos(empresa);
		
		boolean continuar = true;
		
		while(continuar) {
			
			String opciones = JOptionPane.showInputDialog(
					
				"Menu Empresa: \n" +
				"1. Crear Empleado \n" +
				"2. Eliminar Empleado \n" +
				"3. Actualizar Empleado \n" +	
				"4. Buscar Empleados con salario alto \n" +	
				"5. Listar Empleados \n" +
				"6. Salir del programa\n" 
					);
			
			if(opciones == null || opciones.equals("6")) {
				
				JOptionPane.showMessageDialog(null, "Saliendo del programa");
				
				break;
			}
			else {
				
				ejecutaropcion(opciones,empresa);
			}
		}
		
		
		
		
	}
	
	public static void ejecutaropcion(String opciones,Empresa empresa) {
		
		switch (opciones) {
		
		case "1":
			
			crearEmpleado(empresa);
			
			break;
			
		case "2":
			
			eliminarEmpleado(empresa);
			
			break;
			
		case "3":
			
			actualizarEmpleado(empresa);
			
			break;
			
		case "4":
			
			empresa.calcularNomina(empresa.getListEmpleados());
			
			buscarEmpleadosSalarioAlto(empresa);
			
			break;
			
		case "5":
			
			listarEmpleados(empresa);
			
			break;
			
		default: 
			
			JOptionPane.showMessageDialog(null, "Opcion inválida, intentelo de nuevo");
		}
	}
	
	public static void cargarDatos(Empresa empresa) {
        Empleados[] empleadosPrueba = new Empleados[8];
        
        empleadosPrueba[0] = new Empleados("Juan", "1234532", "Jefe", 8);
        empleadosPrueba[1] = new Empleados("Sara", "24322343", "Administrador", 3);
        empleadosPrueba[2] = new Empleados("Sofia", "4432233", "Gerente", 4);
        empleadosPrueba[3] = new Empleados("Ana", "23442020", "Aseo", 2);
        empleadosPrueba[4] = new Empleados("Andres", "245543266", "Gerente", 3);
        empleadosPrueba[5] = new Empleados("Shaye", "3455332", "Administrador", 2);
        empleadosPrueba[6] = new Empleados("Santiago", "8874838229", "Gerente", 5);
        empleadosPrueba[7] = new Empleados("Allison", "40054322", "Jefe", 9);

        for (int i = 0; i < empleadosPrueba.length; i++) {
            empleadosPrueba[i].setSalario(empresa.salarioSegunCargo(empleadosPrueba[i].getCargo()));
            empresa.crearEmpleado(empleadosPrueba[i]); 
        }
    }
	
	private static void crearEmpleado(Empresa empresa) {
		
		 String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
	        String id = JOptionPane.showInputDialog("Ingrese el ID del empleado:");
	        String cargo = JOptionPane.showInputDialog("Ingrese el cargo del empleado:");
	        int tiempoEmpresa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo en la empresa (en años):"));

	        Empleados nuevoEmpleado = new Empleados(nombre, id, cargo, tiempoEmpresa);

	        if (empresa.crearEmpleado(nuevoEmpleado)) {
	            JOptionPane.showMessageDialog(null, "Empleado creado exitosamente.");
	        } else {
	            JOptionPane.showMessageDialog(null, "Error: No se pudo crear el empleado (ID duplicado o sin espacio disponible).");
	        }
	}
	
	private static void eliminarEmpleado(Empresa empresa) {
		
		String id = JOptionPane.showInputDialog("Ingrese el ID del empleado a eliminar:");

        if (empresa.eliminarEmpleado(id)) {
            JOptionPane.showMessageDialog(null, "Empleado eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Error: No se encontró un empleado con ese ID.");
        }
	}
	
	private static void actualizarEmpleado(Empresa empresa) {
		
		String id = JOptionPane.showInputDialog("Ingrese el ID del empleado a actualizar:");

        String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del empleado:");
        String cargo = JOptionPane.showInputDialog("Ingrese el nuevo cargo del empleado:");
        int tiempoEmpresa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo tiempo en la empresa (en años):"));

        Empleados empleadoActualizado = new Empleados(nombre, id, cargo, tiempoEmpresa);

        if (empresa.actualizarEmpleado(id, empleadoActualizado)) {
            JOptionPane.showMessageDialog(null, "Empleado actualizado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Error: No se encontró un empleado con ese ID.");
        }
	}
	
	private static void buscarEmpleadosSalarioAlto(Empresa empresa) {
		
		Empleados[] empleadosSalarioAlto = empresa.determinarSalarioAlto();

        if (empleadosSalarioAlto.length == 0) {
            JOptionPane.showMessageDialog(null, "No hay empleados con salario registrado.");
            return;
        }

        StringBuilder resultado = new StringBuilder("Empleados con salario más alto:\n");
        for (Empleados emp : empleadosSalarioAlto) {
            resultado.append(emp).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
	}
	
	private static void listarEmpleados(Empresa empresa) { 
		
		Empleados[] listaEmpleados = empresa.getListEmpleados();
        StringBuilder resultado = new StringBuilder("Lista de empleados:\n");

        boolean hayEmpleados = false;
        for (Empleados emp : listaEmpleados) {
            if (emp != null) {
                resultado.append(emp).append("\n");
                hayEmpleados = true;
            }
        }

        if (!hayEmpleados) {
            resultado.append("No hay empleados registrados.");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
	}
	



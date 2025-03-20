package guarderiarq2;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Guarderia {
  //Atributos
  private String nombre;
  private String direccion;
  private String nit;
  private ArrayList<Estudiante> listEstudiantes;

  //Constructor
  public Guarderia(String nombre, String direccion, String nit) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.nit = nit;
  }

  public void mostarListaEstudiantesMayores(){
	  for (int i=0; i<listEstudiantes.size(); i++) {
		  if(listEstudiantes.get(i).getEdad() >= 18) {
			  System.out.println(listEstudiantes.get(i));
		  }
		  
	  }

  }

  public void crearEstudiante(Estudiante nuevoEstudiante){
    listEstudiantes.add(nuevoEstudiante);
  }
  

  public void eliminarEstudiante(String idEstudianteEliminar){

    for (int i = 0; i < listEstudiantes.size(); i++) {
      if (listEstudiantes.get(i).getIdentificacion() == idEstudianteEliminar){
        listEstudiantes.remove(i);
      }
    }
  }

  public void modificarEstudiante(String idEstudianteBuscar, Estudiante estudianteModificado){
	  for(int i = 0; i < listEstudiantes.size(); i++ ) {
		  if (listEstudiantes.get(i).getIdentificacion().equals(idEstudianteBuscar)) {
			  listEstudiantes.set(i, estudianteModificado);
		  }
	  }
  }

  public void mostrarListaEstudiantes(){
	  if(listEstudiantes.size()==0) {
		  JOptionPane.showMessageDialog(null, "No hay estudiantes registrados");
	  }else {
		  for(Estudiante estudiantes: listEstudiantes) {
			  JOptionPane.showMessageDialog(null, estudiantes);
		  }
	  }

  }

  //Getter y Setter
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getNit() {
    return nit;
  }

  public void setNit(String nit) {
    this.nit = nit;
  }

  public ArrayList<Estudiante> getListEstudiantes() {
    return listEstudiantes;
  }

  public void setListEstudiantes(ArrayList<Estudiante> listEstudiantes) {
    this.listEstudiantes = listEstudiantes;
  }
}

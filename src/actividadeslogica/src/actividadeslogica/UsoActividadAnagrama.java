package actividadeslogica;

import javax.swing.*;

public class UsoActividadAnagrama {

	public static void main(String[] args) {
		
		String palabra1 = JOptionPane.showInputDialog("Ingrese una palabra");
		
		String palabra2 = JOptionPane.showInputDialog("Ingrese otra palabra");
		
		ActividadAnagrama metodo = new ActividadAnagrama();
		
		if(metodo.verificarAnagrama(palabra1, palabra2)== false) {
			System.out.println("No son anagramas");
		}
		else {
			System.out.println("Sí son anagramas");
		}
	}

}

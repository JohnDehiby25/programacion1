package actividadeslogica;

import java.util.Arrays;

public class ActividadAnagrama {

	public boolean verificarAnagrama(String palabra1, String palabra2) {
		
		if (palabra1.length() != palabra2.length()) {
			return false;
		}
		//convierte las palabras en arrays de caracteres
		char [] array1 = palabra1.toCharArray();
		char [] array2 = palabra2.toCharArray();
		//ordena los arrays
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		//compara los arrays ordenados
		return Arrays.equals(array1, array2);
	}
	

}

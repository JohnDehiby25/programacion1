package poo;
import java.util.*;

public class ActividadFarenheitGrados {

	public static void main(String[] args) {
		///Realizar un programa permite convertir una temperatura dada en Fahrenheit a centígrados. C=(F-32)*5/9
		Scanner entrada_datos = new Scanner(System.in);
			    
		System.out.println("Ingrese la temperatura en fahrenheit");
	
		int datos = entrada_datos.nextInt();
			    
		int conversion = (datos - 32) * 5 / 9;
			    
		System.out.println("La conversión de fahrenheit a centígrados es : " + conversion);
			    
		entrada_datos.close();

	}

}

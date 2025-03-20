package talleragenda;

public class Main {

	public static void main(String[] args) {
		
		String [] nombre = new String [2];
		
		nombre[0]="Sara";
		nombre[1] = "Alejandro";
		
		for(int i=0; i<nombre.length; i++) {
			System.out.println(invertirCadenas(nombre[i]));
			
		}
	}
	public static String invertirCadenas(String nombre) {
		String invertido = "";
		
		for (int i = nombre.length() - 1; i >= 0; i--) {
            invertido += nombre.charAt(i);
        }
        return invertido;
		
	}
	

}

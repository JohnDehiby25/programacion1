package actividadeslogica;

public class Actividadfizzbuzz {

	public static void main(String[] args) {
		
		for(int i = 1; i<101; i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println("Fizzbuzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
			
			
		}

	}

}

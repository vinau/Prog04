/*
 * Programa que lea una frase y una palabra y que nos diga la posición de dicha palabra en la frase 
 * y si no la encuentra devuelva un cero.
*/
import java.util.Scanner;
public class Ejercicio403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		String frase, palabra; 
		
		System.out.println("Escribe una frase:");
		frase =teclado.nextLine();
		
		System.out.println("Escriba una palabra");
		palabra =teclado.nextLine();
		
		if (frase.indexOf(palabra)>=0){
		
		System.out.println(frase.indexOf(palabra));
		
		}
		
		else {
			
			System.out.println("0");
			
		}
	}

}

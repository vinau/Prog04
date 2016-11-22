/*
 * Leer una frase filtrándola a que todos sus caracteres sean mayúsculas, una vez filtrada y dado un numero entre
 *  1 y 10 haga un cifrado de la frase (denominado cifrado CESAR) del modo siguiente , si el numero por ejemplo es 3,
 *   transforme la frase de manera que cada carácter se transforme en 3 códigos ASCII mas es decir :
	Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
	Desarrollar los programas de codificar y descodificar mediante dos funciones.
*/
import java.util.Scanner;
public class Ejercicio408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int posicion=0,numero,caracter=0;
		String frase;
		
		System.out.println("Introduce una frase");
		frase=teclado.nextLine();
		
		System.out.println(frase.toUpperCase());
	

		System.out.println("Selecciona un numero entre 1 y 10");
		numero=teclado.nextInt();
		
		while (posicion<frase.length()){
				
			caracter=frase.charAt(posicion);
			
				System.out.print(caracter);
				caracter=caracter+numero;
				
				posicion++;
			}
			
		}
		
	}



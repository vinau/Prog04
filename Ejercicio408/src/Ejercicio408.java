/*
 * Leer una frase filtr�ndola a que todos sus caracteres sean may�sculas, una vez filtrada y dado un numero entre
 *  1 y 10 haga un cifrado de la frase (denominado cifrado CESAR) del modo siguiente , si el numero por ejemplo es 3,
 *   transforme la frase de manera que cada car�cter se transforme en 3 c�digos ASCII mas es decir :
	Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
	Desarrollar los programas de codificar y descodificar mediante dos funciones.
*/
import java.util.Scanner;
public class Ejercicio408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int posicion=0,numero,caracter=0;
		String frase, mayus;
		
		
		System.out.println("Introduce una frase");
		mayus=teclado.nextLine();
		
		frase = mayus.toUpperCase();
		
		System.out.println(frase);
	

		System.out.println("Selecciona un numero entre 1 y 10");
		numero=teclado.nextInt();
		
		while (posicion<frase.length()){
				
			caracter=frase.charAt(posicion);
			
				caracter=caracter+numero;
				
				posicion++;
				
				System.out.print((char)caracter);
				
			}
		while (posicion<frase.lenght()){
			
			
			
		}
		
		
			
		}
		
	}



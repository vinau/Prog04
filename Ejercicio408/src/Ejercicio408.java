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
		
		int posicion=0,numero,caracter=0, caracter2=0;
		String frase, mayus, frase2="";
		
		
		System.out.println("Introduce una frase");
		mayus=teclado.nextLine();
		
		frase = mayus.toUpperCase();
		
		System.out.println(frase);
	
		System.out.println("Selecciona un numero entre 1 y 10");
		numero=teclado.nextInt();
		
		/*
		for (posicion=0;posicion<frase.length();posicion++) {
			
			caracter=frase.charAt(posicion);
			
			caracter=caracter+numero;
			
			System.out.print((char)caracter);
			
			caracter2= caracter - numero;
			frase2= frase2 + caracter2;
			
		}
		int caracter3=0;
		
		System.out.println("");
		
		for (posicion=0; posicion<frase2.length(); posicion++) {
			
			caracter3=frase2.charAt(posicion);
			 
			 System.out.print((char)caracter3);
			
		}
		*/
		
		while (posicion<frase.length()){
				
			caracter=frase.charAt(posicion);
			
				caracter=caracter+numero;
				
				System.out.print((char)caracter);
				
			//System.out.println("");
			//	caracter=caracter-numero;
				
			//	System.out.print((char)caracter);
				
				posicion++;
				caracter2= caracter - numero;
				frase2= frase2 + caracter2;
				//System.out.println("");
			//	System.out.print((char)caracter2);
				
				
			}
		posicion=0;
		
		while (posicion<frase2.length()) {
			
			caracter2=frase2.charAt(posicion);
			 
			 System.out.print((char)caracter);
			
			 posicion++;
		}
			
		
		
		}
		
		
			
		}
		
	



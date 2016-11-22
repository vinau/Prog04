/*
 * Leer una frase por teclado y escribir a continuación cuantas mayúsculas, minúsculas y números contiene.
 */
import java.util.Scanner;
public class Ejercicio407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int posicion=0,caracter=0,contadorMayus=0,contadorMinus=0,contadorNum=0;
		String frase;
		
		System.out.println("Introduzca una frase");
		frase= teclado.nextLine();
		
		while (posicion<frase.length()){
			
			caracter=frase.charAt(posicion);
			
			if (caracter<='Z' && caracter>='A'){
				
				contadorMayus++;
			}
			
			if (caracter<='z' && caracter>='a' ) {
				
				contadorMinus++;
				
			}
			if (caracter>=48 && caracter<=57) {
			
				contadorNum++;
			}
			//System.out.println(caracter);
			
			posicion++;
			
		}
		
		System.out.println("El número de letras minúsculas es: "+contadorMinus);
		System.out.println("El número de letras mayúsculas es: "+contadorMayus);
		System.out.println("La cantidad de numeros es: "+contadorNum);
	}
	}
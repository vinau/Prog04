//Leer una frase por teclado (m�ximo 80 car) y construir otras dos cadenas 
//de forma que una contenga los caracteres en posici�n par y la otra los caracteres en posici�n impar.

import java.util.Scanner;
public class Ejercicio405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		String frase,frase1= "",frase2 = "";
		int posicion=0, posicion2=1;
		
		System.out.println("Introduzca una frase de maximo 80 caracteres");
		frase= teclado.nextLine();
		
	
		
		if (frase.length()<=80){
			
			while (posicion<frase.length()) {
				
				if ( posicion % 2 == 0 ) {
					
				 frase1= frase1 + frase.charAt(posicion);
				
				}
				
				else {
					
					 frase2= frase2 + frase.charAt(posicion);
					  
				}
				
				posicion++;
			}
			
			System.out.println(frase1);
			System.out.println(frase2);
			
		}
		else {
			System.out.println("Has superado el maximo de 80 caracteres");
			
		}
		
	}

}

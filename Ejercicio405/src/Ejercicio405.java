//Leer una frase por teclado (máximo 80 car) y construir otras dos cadenas 
//de forma que una contenga los caracteres en posición par y la otra los caracteres en posición impar.

import java.util.Scanner;
public class Ejercicio405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		String frase,frase1,frase2;
		int posicion=0, posicion2=1;
		
		System.out.println("Introduzca una frase de maximo 80 caracteres");
		frase= teclado.nextLine();
		
	
		
		if (frase.length()<=80){
			
			while (posicion<frase.length()) {
				
				System.out.print(frase.charAt(posicion));
				
				posicion=posicion+2;
				
			}
			
			System.out.println("");
			
			while (posicion2<frase.length()){
				
				System.out.print(frase.charAt(posicion2));
				
				posicion2=posicion2+2;
			}
			
		}
		else {
			System.out.println("Has superado el maximo de 80 caracteres");
			
			
			
			
		}
		
		
		
		
	}

}

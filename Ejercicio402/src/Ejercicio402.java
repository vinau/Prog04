/*
Dada una frase de no más de 80 caracteres hacer un programa que busque cuántas mayúsculas y minúsculas tiene y lo imprima
*/
import java.util.Scanner;
public class Ejercicio402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		int contadorMayus=0,contadorMinus=0,posicion=0,caracter=0;
		String frase;
		
		System.out.println("Introduzca una frase con un máximo de 80 caracteres:");
		frase= teclado.nextLine();
	
		if (frase.length()<=80){
		
			while (posicion<frase.length()){
				
				caracter=frase.charAt(posicion);
				
				if (caracter<='Z' && caracter>='A'){
					
					contadorMayus++;
				}
				
				if (caracter<='z' && caracter>='a' ) {
					
					contadorMinus++;
					
				}
				
				//System.out.println(caracter);
				
				posicion++;
				
			}
			
			System.out.println("El número de letras minúsculas es: "+contadorMinus);
			System.out.println("El número de letras mayúsculas es: "+contadorMayus);
		}
		else System.out.println("Ha excedido el número máximo de caracteres.");
	}		
}	
/*		
		int x,y;
		String frase;
	
		
		System.out.println("Introduzca una frase con un máximo de 80 caracteres:");
		frase=teclado.nextLine();
		
		if(frase.length()<=80){
			
			
			
			//for(x=0;x<frase.length();x++){
		if(frase.length()== ){
			
		}
			
		}
}
}
		*/
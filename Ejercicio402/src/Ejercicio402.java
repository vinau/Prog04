/*
Dada una frase de no m�s de 80 caracteres hacer un programa que busque cu�ntas may�sculas y min�sculas tiene y lo imprima
*/
import java.util.Scanner;
public class Ejercicio402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		int contadorMayus=0,contadorMinus=0,caracter=0;
		String frase;
		
		System.out.println("Introduzca una frase con un m�ximo de 80 caracteres:");
		frase= teclado.nextLine();
	
		if (frase.length()<=80){
		
			for (int posicion=0;posicion<frase.length();posicion++){
				
				caracter=frase.charAt(posicion);
				
				if (caracter<='Z' && caracter>='A'|| caracter =='�' ){
					
					contadorMayus++;
				}
				
				if (caracter<='z' && caracter>='a' || caracter=='�' ) {
					
					contadorMinus++;
					
				}
				
				//System.out.println(caracter);
			
				
			}
			
			System.out.println("El n�mero de letras min�sculas es: "+contadorMinus);
			System.out.println("El n�mero de letras may�sculas es: "+contadorMayus);
		}
		else System.out.println("Ha excedido el n�mero m�ximo de caracteres.");
	}		
}	
/*		
		int x,y;
		String frase;
	while (posicion<frase.length()){
		
		System.out.println("Introduzca una frase con un m�ximo de 80 caracteres:");
		frase=teclado.nextLine();
		
		if(frase.length()<=80){
			
			
			
			//for(x=0;x<frase.length();x++){
		if(frase.length()== ){
			
		}
			
		}
}
}
		*/
/*
Leer una frase por teclado (máximo 80) y a continuación escribir cuantas vocales, consonantes y caracteres
 numéricos posee.
*/
import java.util.Scanner;
public class Ejercicio407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		String frase;
		int contador=0,caracter=0,contadorvocales=0,contadorconsonantes=0,contadornumeros=0;
		
		System.out.println("Introduzca una frase de maximo 80 caracteres");
		frase= teclado.nextLine();
		
		if (frase.length()<80) {
			
			while (contador<frase.length()) {
				
				caracter=frase.charAt(contador);
				
				if (caracter=='a' | caracter=='A' | caracter=='e' | caracter=='E' | caracter=='i' | caracter=='I' 
						| caracter=='o'| caracter=='O'| caracter=='u'| caracter=='U'){
					contadorvocales++;
				}
				if ( caracter=='0'| caracter=='1'| caracter=='2'| caracter=='3'| caracter=='4'| caracter=='5'
						| caracter=='6'| caracter=='7'| caracter=='8'| caracter=='9'){
					contadornumeros++;
				}
				else {
					contadorconsonantes++;
				}
			}
			System.out.println("Numero de vocales = " + contadorvocales);
			System.out.println("Numero de numeros = " + contadornumeros);
			System.out.println("Numero de consonantes = " + contadorconsonantes);
		}
		else {
			System.out.println("La frase supera los 80 caracteres");
			
			
			
			
		}

	}

}

/*
Leer una cadena de hasta 80 caracteres y pasarla en funci�n de una variable de opci�n a may�sculas � a min�sculas
 e imprimir la cadena resultante
*/
import java.util.Scanner;
public class Ejercicio404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		int eleccion;
		String frase;
		
		System.out.println("Escriba una frase con un m�ximo de 80 caracteres:");
		frase =teclado.nextLine();

		if (frase.length()<=80) {
			
			System.out.println("Si lo quiere en May�sculas escriba 1, si lo quiere en Min�sculas escriba 2:");
			eleccion= teclado.nextInt();
			
			if (eleccion==1){
				
				System.out.println(frase.toUpperCase());
				
			}
			
			else {
				
				System.out.println(frase.toLowerCase());
				
			}
			
		} 
		
		else {
			
			System.out.println("La frase supera los 80 caracteres");
			
		}
		
	}

}

/*
Leer una frase de máximo 80 caracteres y escribirla progresivamente es decir si la frase es: 
“ciervo”, el programa debe imprimir
c
ci
cie
cier
cierv
ciervo
 * 
 * 
*/
import java.util.Scanner;
public class Ejercicio401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		int x,y;
		String frase;
	
		
		System.out.println("Introduzca una frase con 80 caracteres como maximo");
		frase=teclado.nextLine();
		
	if(frase.length()<=80){
		for(x=0;x<frase.length();x++){
			for(y=0;y<=x;y++){
				
				System.out.print(frase.charAt(y));
		}
			System.out.print("");		
		}
		

		
	}
	else{
		System.out.println("Su frase supera los 80 caracteres");
	}
	
	}
}
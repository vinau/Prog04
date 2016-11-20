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
		
		int contador1,contador2;
		String frase;
		
		System.out.println("Introduzca una frase con un máximo de 80 caracteres:");
		frase=teclado.nextLine();
		
		if (frase.length()<=80){
			
			for(contador1=0;contador1<frase.length();contador1++){
				
				for (contador2=0;contador2<=contador1;contador2++){
					
					System.out.print(frase.charAt(contador2));
					
				}
				
				System.out.println("");	
			}
		}
		
		
	}
}

/*		
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
*/
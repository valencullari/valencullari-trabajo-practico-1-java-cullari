package ej6;
import java.util.Scanner;


public class palabra_invertida {

	public static void main(String[] args) {
	
		String pal;
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print("ingrese una palabra o frase:\t");
		pal = scanner.nextLine();//pide al usuario un string y lee todo hasta espacios
		
		for(int i = pal.length()-1;i>=0;i--)//ciclo for que recorre la longitud de la palabra o frase ingresada de derecha a izquierda
		{
			System.out.print(pal.charAt(i));//imprime el espacio del string como char
		}
		
		scanner.close();
	}

}

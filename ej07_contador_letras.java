package ej7;
import java.util.Scanner;

public class contador_letras {

	public static void main(String[] args) {
		String pal;
		int cont_voc=0;
		int cont_con=0;
		
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print("ingrese una palabra o frase:\t");
		pal = scanner.nextLine();//lee la palabra o frase que ingrese con espacios incluidos
		pal = pal.toLowerCase();//convierte la palabra o frase en minusculas
		
		for(int i=0;i<pal.length();i++)//ciclo para contar vocales (a e i o u y si no es vocal que cuente consonante
		{
			if(pal.charAt(i)=='a' || pal.charAt(i)=='e' ||pal.charAt(i)=='i' ||pal.charAt(i)=='o' ||pal.charAt(i)=='u')
			{
				cont_voc++;
			}else
			{
				cont_con++;
			}
		}
		System.out.print("cantidad de vocales:	"+cont_voc);
		System.out.print("\ncantidad de consonantes:	"+cont_con);//muestra los contadores totales
		
		scanner.close();

	}

}

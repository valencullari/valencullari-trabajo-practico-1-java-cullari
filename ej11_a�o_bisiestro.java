package ej11;
import java.util.Scanner;

public class a�o_bisiestro {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
		int anio;
		
		do 
		{
			System.out.println("ingrese un año (numero no negativo):\t");
			anio=scanner.nextInt();
			
		}while(anio>0);//pide un numero positivo
		if(anio%4==0 && anio%10!=0||anio%400==0)//calcula si el año es bisiestro o no 
		{
			System.out.println("es un a�o bisiestro");
		}else
		{
			System.out.println("NO es un a�o bisiestro");
		}
	}

}

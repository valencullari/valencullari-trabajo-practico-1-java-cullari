package ej16;
import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		int [] num = new int[3];

		for(int i=0;i<3;i++)
		{
			System.out.print("ingrese el lado "+(i+1)+":\t");
			num[i]= scanner.nextInt();//pide los 3 lados del triangulo
		}
		if(num[0]==num[1] && num[0]!=num[2])
		{
			System.out.println("\nEs un triangulo isoceles");
		}
		if(num[2]==num[1] && num[0]!=num[2])
		{
			System.out.println("\nEs un triangulo isoceles");
		}
		if(num[2]==num[0] && num[1]!=num[2])
		{
			System.out.println("\nEs un triangulo isoceles");
		}//corrobora que sea isoceles (dos lados iguales)
		
		if(num[2]==num[1] && num[0]==num[2])
		{
			System.out.println("\nEs un triangulo equilatero");//corrobora que sea equilatero (todos los lados iguales)
		}
		
		if(num[2]!=num[1] && num[0]!=num[2])
		{
			System.out.println("\nEs un triangulo escaleno");//corrobora que sea escaleno (todos los lados distintos)
		}
		
		scanner.close();
	}

}

package ej9;

import java.util.Scanner;

public class tres_num {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in); 
		
		int [] num = new int[3];// declaracion de array para que tenga 3 espacios
		
		for(int i=0;i<3;i++)//pide los 3 numeros
		{
			System.out.println("ingrese el n" +(i+1)+":\t");
			num[i]= scanner.nextInt();
		}
		if(num[0]>num[1])//corrobora cual es el mayor y lo informa en pantalla
		{
			if(num[0]>num[2])
			{
				System.out.println("el numero mayor es:\t"+num[0]);
			}
			if(num[0]<num[2])
			{
				System.out.println("el numero mayor es:\t"+num[2]);
			}
				
		}
		if(num[0]<num[1])
		{
			if(num[1]>num[2])
			{
				System.out.println("el numero mayor es:\t"+num[1]);
			}
			if(num[1]<num[2])
			{
				System.out.println("el numero mayor es:\t"+num[2]);
			}
			
				
		}
		scanner.close();
	}

}

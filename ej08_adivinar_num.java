package ej8;
import java.util.Random;
import java.util.Scanner;

public class adivinar_num {

	public static void main(String[] args) {
		
		int num;
		
		Random random = new Random();//usa la libreria rand para crear numeros aleatorios
		Scanner scanner = new Scanner(System.in); 
	
	
		int rand=random.nextInt(100)+1;//generador de numero random (0 99) y se le suma uno para que sea de 1 a 100

		do 
		{
		System.out.println("Adivine un numero entre 1 y 100:\t");
		num = scanner.nextInt();
		if(num>rand)//si el numero random es menor le informa al usuario 
		{
			System.out.println("el numero es menor");
		}if(num<rand)//si el numero random es mayor le informa al usuario 
		{
			System.out.println("el numero es mayor");
		}
		}while(num!=rand);//corrobora que el numero ingresado por el usuario sea correcto si no vuelve a ingresar al ciclo 
		
		System.out.println("Correcto adivinaste el numero");
		scanner.close();
	}

}

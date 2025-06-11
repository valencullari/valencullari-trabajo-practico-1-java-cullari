package ej19;
import java.util.Random;
import java.util.Scanner;

public class dados {

	public static void main(String[] args) {
		
		int sum;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int dad1=random.nextInt(5)+1;//generador de numero random (0 5) y se le suma uno para que sea de 1 a 6
		int dad2=random.nextInt(5)+1;//generador de numero random (0 5) y se le suma uno para que sea de 1 a 6
		sum=dad1+dad2;
		System.out.println("dado 1: "+dad1);//imprime el valor de cada dado y luego la suma de ambos 
		System.out.println("dado 2: "+dad2);
		System.out.println("suma de ambos: "+sum);
		
		scanner.close();
	}

}

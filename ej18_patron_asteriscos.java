package ej18;
import java.util.Scanner;

public class patron_asteriscos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
		int num;
		
		System.out.print("ingrese un numero:\t");
		num = scanner.nextInt();
		for(int i=0;i<num;i++)//sistema burbuja para escribir los asteriscos 
		{
			for(int j =0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}

}

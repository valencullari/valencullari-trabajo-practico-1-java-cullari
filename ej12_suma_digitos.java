package ej12;
import java.util.Scanner;

public class suma_digitos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		String num;
		int  suma=0;
		System.out.println("ingrese un numero ");
		num=scanner.next();
		
		for(char letra: num.toCharArray())//for each(recorre la longitud del string)
		{
			suma+=Character.getNumericValue(letra);//transformar char en int y suma los digitos
		}
		System.out.println("la suma de sus digitos es:\t"+suma);//
		scanner.close();
	}

}

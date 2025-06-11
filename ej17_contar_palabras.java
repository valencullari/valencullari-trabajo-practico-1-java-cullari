package ej17;
import java.util.Scanner;

public class contar_palabras {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		String pal;
		int  can_pal=1;
		System.out.println("ingrese una palabra o frase:\t");
		pal = scanner.nextLine();
		
		for(int i=0;i<pal.length();i++)//ciclo para contar espacio (palabras)
		{
			if(pal.charAt(i)==' ')
			{
				can_pal++;
			}
		}
		System.out.println("cantidad de palabras:\t"+can_pal);//
		scanner.close();
	}

}

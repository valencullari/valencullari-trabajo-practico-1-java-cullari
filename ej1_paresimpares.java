package ej1;

public class paresimpares {

	public static void main(String[] args) {//funcion main
		for(int i=1;i<101;i++)//ciclo for desde 1 hasta 100
		{
			if(i%2==0)//condicion, si el numero es par 
			{
				System.out.println("par");//imprime en pantalla "par"
			}else//condicion si no ocurre lo anterior
			{
				System.out.println(i);//imprime en pantalla la variable i
			}
		}
	}

}

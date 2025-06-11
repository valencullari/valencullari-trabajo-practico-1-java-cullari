package ej2;

public class primos {
	public static void main(String[] args) {
	int contador = 0;//variable entera
	
	for(int i=50;i<101;i++)//ciclo for para contar los n de 50 a 100
	{
		for(int j=1;j<=i;j++)//ciclo for desde 1 hasta el valor actual de i
		{
			if(i%j==0)//condicion, si i es divisible por j
			{
				contador++;//la variable contador arranca en 0 se le suma uno
			}
		}//salida del ciclo for j
		if(contador==2)//condicion, si contador es = 2 (si el numero i es divisible solo por dos numeros, es primo)
		{
			System.out.print("es primo");//imprime en pantalla es primo
		}else//si no se cumple (no es primo)
		{
			for(int j=1;j<=i;j++)//ciclo for nuevamente desde 1 hasta el valor actual de i
			{
				if(i%j==0) //condicion, si i es divisible por j
				{
					System.out.print(" "+j);//imprime j es decir el divisor y un espacio
				}
			}
		}
		System.out.print("\n");//imprime un salto de linea
		contador=0;//a contador se le asigna 0 para volver a empezar a calcular si i es primo o no
		
	}
}
}

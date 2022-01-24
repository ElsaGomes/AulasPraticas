package exerciciosLaboratorio;

import java.util.Scanner;

public class Ficha2 
{
	public static void main(String[] args) 
	{
		Scanner consola = new Scanner(System.in);
		
		System.out.println("Indique a altura do triângulo");
		double alturaTriangulo = consola.nextInt();
		System.out.println("Indique a base do triângulo");
		double baseTriangulo = consola.nextInt();
		double areaTriangulo = areaTriang (alturaTriangulo, baseTriangulo);
		System.out.println("A área do triângulo é " + areaTriangulo);
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Indique a altura do retângulo");
		double alturaRetangulo = consola.nextInt();
		System.out.println("Indique o comprimento do retângulo");
		double comprimentoRetangulo = consola.nextInt();
		double areaRetangulo = areaRetang (alturaRetangulo, comprimentoRetangulo);
		System.out.println("A área do retângulo é " + areaRetangulo);
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Indique o valor de z");
		int z = consola.nextInt();
		double areaCal = areaCal(areaTriangulo, areaRetangulo, z);
		System.out.println("A área da figura é " + areaCal); 
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Indique o valor do fatorial n");
		int n = consola.nextInt();
		double fatorial = factor(n);
		System.out.println("O exponencial n é: "+ fatorial);
		consola.close();
	}
	
	public static double areaTriang(double aAlturaTriang, double aBaseTriang) 
	{
		double areaTriangulo = (aAlturaTriang*aBaseTriang)/2;

		return areaTriangulo;
	}
	
	public static double areaRetang(double aAlturaRetang, double aComprimentoRetang) 
	{
		double areaRetang = aAlturaRetang*aComprimentoRetang;

		return areaRetang;
	}
	
	public static double areaCal(double aX, double aY, int aZ) 
	{
		if (aZ==1)
		{
			return aX;
		}
		else
		{
			return aY;
		}
	}
		
	public static int factor(int fat) 
	{
		int i, resultado = 1;
		for (i=1;i<=fat;i++)
		 {
			resultado=resultado*i;
		 }
		return resultado;
	}
}
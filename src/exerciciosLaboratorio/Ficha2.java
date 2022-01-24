package exerciciosLaboratorio;

import java.util.Scanner;

public class Ficha2 
{
	public static void main(String[] args) 
	{
		Scanner consola = new Scanner(System.in);
		
		System.out.println("Indique a altura do tri�ngulo");
		double alturaTriangulo = consola.nextInt();
		System.out.println("Indique a base do tri�ngulo");
		double baseTriangulo = consola.nextInt();
		double areaTriangulo = areaTriang (alturaTriangulo, baseTriangulo);
		System.out.println("A �rea do tri�ngulo � " + areaTriangulo);
		
		System.out.println("------------------------------");
		
		System.out.println("Indique a altura do ret�ngulo");
		double alturaRetangulo = consola.nextInt();
		System.out.println("Indique o comprimento do ret�ngulo");
		double comprimentoRetangulo = consola.nextInt();
		double areaRetangulo = areaRetang (alturaRetangulo, comprimentoRetangulo);
		System.out.println("A �rea do ret�ngulo � " + areaRetangulo);
		consola.close();
		
		System.out.println("------------------------------");
	}
	
	public static double areaTriang(double aAlturaTriang, double aBaseTriang) 
	{
		double area = (aAlturaTriang*aBaseTriang)/2;

		return area;
	}
	
	public static double areaRetang(double aAlturaRetang, double aComprimentoRetang) 
	{
		double areaRetang = aAlturaRetang*aComprimentoRetang;

		return areaRetang;
	}
}
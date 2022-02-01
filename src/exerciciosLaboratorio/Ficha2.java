package exerciciosLaboratorio;

import java.util.Scanner;

public class Ficha2 
{
	public static void main(String[] args) 
	{
		Scanner consola = new Scanner(System.in);
		
		/*System.out.println("Indique a altura do triângulo");
		double alturaTriangulo = consola.nextInt();
		System.out.println("Indique a base do triângulo");
		double baseTriangulo = consola.nextInt();
		double areaTriangulo = areaTriang (alturaTriangulo, baseTriangulo);
		System.out.println("A área do triângulo é " + areaTriangulo);
				
		System.out.println("\n");
				
		System.out.println("Indique a altura do retângulo");
		double alturaRetangulo = consola.nextInt();
		System.out.println("Indique o comprimento do retângulo");
		double comprimentoRetangulo = consola.nextInt();
		double areaRetangulo = areaRetang (alturaRetangulo, comprimentoRetangulo);
		System.out.println("A área do retângulo é " + areaRetangulo);
				
		System.out.println("Indique o valor de z");
		int z = consola.nextInt();
		System.out.println("Indique o valor de x");
		int x = consola.nextInt();
		System.out.println("Indique o valor de y");
		int y = consola.nextInt();
		double areaCal = areaCal(x, y, z);
		System.out.println("A área da figura é " + areaCal); 
				
		System.out.println("Indique o valor do fatorial n");
		int n1 = consola.nextInt();
		double fatorial = factor(n1);
		System.out.println("O exponencial n1 é: "+ fatorial);
		
		System.out.println("Indique o valor do fatorial recursivo de n2");
		int n2 = consola.nextInt();
		double fatorialRecursivo = factorRecursivo(n2);
		System.out.println("O exponencial recursivo de n2 é: "+ fatorialRecursivo);
		
		System.out.println("Digite a sua frase:");
        String frase = consola.nextLine().toLowerCase();
        int totalVogais = numTotalVogal(frase);
        System.out.println("A sua frase possui " + totalVogais + " vogais");*/
		
		System.out.println("Digite a sua frase:");
        String frase = consola.nextLine();
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
			return areaTriang(aX, aY);
		}
		else
		{
			return areaRetang(aX, aY);
		}
	}
		
	public static double factor(int fat) 
	{
		int i, resultado = 1;
		for (i=1;i<=fat;i++)
		 {
			resultado=resultado*i;
		 }
		return resultado;
	}
	
	public static double factorRecursivo(int fatRecursivo) 
	{
		if (fatRecursivo == 0)
		{
			return 1;
		}
		else
		{
			return fatRecursivo * factor(fatRecursivo - 1);
		}
	}
	
	public static int numTotalVogal(String aFrase1) 
	{
		int count = 0;
		for (int i=0 ; i<aFrase1.length(); i++)
		{
			char ch = aFrase1.charAt(i);
	        if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u')
	        {count ++;}
	     }
		return count;
	}
	
	public static int numVogais(String aFrase2) 
	{
		return 0;
	}
}
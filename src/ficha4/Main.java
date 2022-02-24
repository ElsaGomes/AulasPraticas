package ficha4;

import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		Cesto cesto1 = new Cesto();
		
		FrutaVolume fruta1 = new FrutaVolume ("Maçã", 1);
		FrutaPeso fruta2 = new FrutaPeso ("Laranja", 1.5); 
		FrutaUnidade fruta3 = new FrutaUnidade ("Perâ", 0.5);
		
		cesto1.addFruta(fruta1);
		cesto1.addFruta(fruta2);
		cesto1.addFruta(fruta3);
		
		System.out.println("Indique o volume da fruta ");
		double volume = in.nextDouble();
		System.out.println("Valor a pagar " + fruta1.pagar(volume));
		
		System.out.println("\nIndique o peso da fruta ");
		double peso = in.nextDouble();
		System.out.println("Valor a pagar " + fruta2.pagar(peso));

		System.out.println("\nIndique a quantidade de fruta ");
		int unidade = in.nextInt();
		System.out.println("Valor a pagar " + fruta3.pagar(unidade));
		in.close();
	}
}
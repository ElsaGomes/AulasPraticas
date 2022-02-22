package ficha4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		List<Fruta> frutas = new ArrayList<Fruta>();
		FrutaVolume fruta1 = new FrutaVolume ("Maçã", 1);
		FrutaPeso fruta2 = new FrutaPeso ("Laranja", 1.5); 
		FrutaUnidade fruta3 = new FrutaUnidade ("Perâ", 0.5);
		
		frutas.add(fruta1);
		frutas.add(fruta2);
		frutas.add(fruta3);
		
		System.out.println("Indique o volume da fruta ");
		double volume = in.nextDouble();
		System.out.println("Valor a pagar " + fruta1.pagar(volume));
		
		System.out.println("Indique o peso da fruta ");
		double peso = in.nextDouble();
		System.out.println("Valor a pagar " + fruta2.pagar(peso));
		
		System.out.println("Indique a quantidade de fruta ");
		int unidade = in.nextInt();
		System.out.println("Valor a pagar " + fruta3.pagar(unidade));
		in.close();
	}
}
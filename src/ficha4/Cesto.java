package ficha4;

import java.util.List;

public class Cesto 
{
	private int totalItens;
	private int maxItens;
	private List<Fruta>frutas;
	
	public Cesto() 
	{
		maxItens = 100;
	}	
	
	public void addFruta(Fruta aFrutas) 
	{
		frutas.add(aFrutas);
	}
	
	public double totalCesto() 
	{
		double valorCesto = 0;
		int i = 0;
		for(Fruta fruta: frutas)
		{
			while(i < frutas.size())
			{
				valorCesto = fruta.pagar();
				i++;
			}
		}
		return valorCesto;
	}
	
	public int totalTipoFruta() 
	{
		return totalItens;
	}
	
	public double valorTotalTipoFruta() 
	{
		return 0;
	}
}
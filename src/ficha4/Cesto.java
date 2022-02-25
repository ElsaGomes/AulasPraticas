package ficha4;

import java.util.ArrayList;
import java.util.List;

public class Cesto 
{
	private int totalItens;
	private int maxItens;
	private List<Fruta>frutas;
	
	public Cesto() 
	{
		frutas = new ArrayList<Fruta>();
		maxItens = 100;
		totalItens = 0;
	}	

	public void addFruta(Fruta aFrutas) 
	{
		frutas.add(aFrutas);
	}
	
	public double totalCesto() 
	{
		double valorCesto = 0;

		for(Fruta fruta: frutas)
		{
			valorCesto += fruta.pagar();
		}
		return valorCesto;
	}
	
	public int totalTipoFruta(String tipo) 
	{
		int totalFruta = 0;
		for(Fruta fruta: frutas)
		{
			if(fruta.getClass().getSimpleName().equals(tipo))
			totalFruta++;
		}
		return totalFruta;
	}
	
	public double valorTotalTipoFruta(String tipo) 
	{
		double total = 0;
		for(Fruta fruta: frutas)
		{
			if(fruta.getClass().getSimpleName().equals(tipo))
			total += fruta.pagar();
		}
		return total;
	}
	
	public int getMaxItens() {
		return maxItens;
	}

	public void setMaxItens(int maxItens) {
		this.maxItens = maxItens;
	}

	public int getTotalItens() {
		return totalItens;
	}

	public void setTotalItens(int totalItens) {
		this.totalItens = totalItens;
	}
}
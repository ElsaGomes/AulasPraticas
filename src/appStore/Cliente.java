package appStore;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Utilizador
{
	private List<Compra>compras;
	private static List<App>appsCompradas;
	
	public Cliente(String aNome, int aIdade) 
	{
		super(aNome, aIdade);
		compras = new ArrayList<Compra>();
		appsCompradas = new ArrayList<App>();
	}
	public void comprar(Compra aCompra) 
	{
		compras.add(aCompra);
	}
	
	public void comprarApp(App aApps) 
	{
		appsCompradas.add(aApps);
	}
	
	public int avaliar(String aApps)
	{
		int avaliacao = Menu.menuAvaliar();
		for(App ap: appsCompradas)
		{
			if(ap.getNome().equals(aApps))
			{
				ap.setAvaliacao(avaliacao);
			}
		}
		return avaliacao;
	}
	
	public void comentarApp(App aApps) ////
	{
		
	}
}
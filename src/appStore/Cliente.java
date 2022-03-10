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
	
	public String avaliar(String aApps)
	{
		for(App ap: appsCompradas)
		{
			if(ap.getNome().equals(aApps))
			{
				Menu.menuAvaliar();
				avaliarApp(Menu.menuAvaliar());
			}
		}
		return aApps;
	}
	
	public static int avaliarApp(int avalicao) ///////
	{
		for(App ap: appsCompradas)
		{
			ap.setAvaliacao(avalicao);
		}
		return avalicao;
	}
	
	public void comentarApp(App aApps) ////
	{
		
	}
}
package appStore;

import java.util.List;

public class Cliente extends Utilizador
{
	private List<Compra>compras;
	private List<App>apps;
	
	public Cliente(String aNome, int aIdade) 
	{
		super(aNome, aIdade);
	}
	
	public List<Compra> getCompras() 
	{
		return compras;
	}

	public void setCompras(List<Compra> aCompras) 
	{
		compras = aCompras;
	}

	public void comprar(App aApps) 
	{
		apps.add(aApps);
	}
}
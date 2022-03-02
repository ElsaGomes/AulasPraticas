package appStore;

import java.util.List;

public class Cliente extends Utilizador
{
	private List<Compra>compras;
	
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

	public void comprar() 
	{
		
	}
}
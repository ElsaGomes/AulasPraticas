package appStore;

import java.util.Date;
import java.util.List;

public class Compra 
{
	private Date dataCompra;
	private double preco;
	private List<App>appsCompradas;
	
	public Compra(Date aDataCompra, double aPreco) 
	{
		dataCompra = new  Date();
		preco = aPreco;
	}

	public Date getDataCompra() 
	{
		return dataCompra;
	}

	public void setDataCompra(Date aDataCompra) 
	{
		dataCompra = aDataCompra;
	}

	public double getPreco() 
	{
		return preco;
	}

	public void setPreco(double aPreco)
	{
		preco = aPreco;
	}

	public List<App> getAppsCompradas() 
	{
		return appsCompradas;
	}

	public void setAppsCompradas(List<App> appsCompradas) 
	{
		this.appsCompradas = appsCompradas;
	}
	
}
package appStore;

import java.util.Date;

public class Compra 
{
	private Date dataCompra;
	private double preco;
	
	public Compra(Date aDataCompra, double aPreco) 
	{
		dataCompra = aDataCompra;
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
}
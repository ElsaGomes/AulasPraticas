package ficha3;

public class Casa 
{
	private String morada;
	private double precoCusto;
	private double precoVenda;
	
	public Casa() 
	{	
	}

	public Casa(String aMorada) 
	{
		morada = aMorada;
	}

	public String getMorada() 
	{
		return morada;
	}

	public void setMorada(String aMorada) 
	{
		morada = aMorada;
	}

	public double getPrecoCusto() 
	{
		return precoCusto;
	}

	public void setPrecoCusto(double aPrecoCusto) 
	{
		precoCusto = aPrecoCusto;
	}

	public double getPrecoVenda() 
	{
		return precoVenda;
	}

	public void setPrecoVenda(double aPrecoVenda) 
	{
		precoVenda = aPrecoVenda;
	}
	
	public double getLucro() 
	{
		double aLucro = precoVenda - precoCusto;
		return aLucro;
	}
	
	public double getPercentMargemLucro() 
	{
		double aPercentMargemLucro = precoVenda / precoCusto;
		return aPercentMargemLucro;
	}
}
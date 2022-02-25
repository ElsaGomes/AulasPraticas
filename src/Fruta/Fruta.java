package Fruta;

public abstract class Fruta 
{
	protected String nome;
	protected double precoBase;
	
	public Fruta(String aNome, double aPrecoBase)
	{
		nome = aNome;
		precoBase = aPrecoBase;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String aNome) 
	{
		nome = aNome;
	}

	public double getPrecoBase() 
	{
		return precoBase;
	}

	public void setPrecoBase(double aPrecoBase) 
	{
		precoBase = aPrecoBase;
	}
	
	public abstract double pagar();
}
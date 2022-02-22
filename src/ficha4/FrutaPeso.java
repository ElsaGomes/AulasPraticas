package ficha4;

public class FrutaPeso extends Fruta
{

	public FrutaPeso(String aNome, double aPrecoBase) 
	{
		super(aNome, aPrecoBase);
	}

	public double pagar(double peso) 
	{
		return precoBase * peso;
	}
}
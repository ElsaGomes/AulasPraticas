package ficha4;

public class FrutaPeso extends Fruta
{
	private float peso; 
	
	public FrutaPeso(String aNome, double aPrecoBase, float aPeso) 
	{
		super(aNome, aPrecoBase);
		peso = aPeso;
	}

	public double pagar() 
	{
		return precoBase * peso;
	}
}
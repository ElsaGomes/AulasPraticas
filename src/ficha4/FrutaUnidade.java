package ficha4;

public class FrutaUnidade extends Fruta
{

	public FrutaUnidade(String aNome, double aPrecoBase) 
	{
		super(aNome, aPrecoBase);
	}

	public double pagar(int unidade) 
	{
		return precoBase * unidade;
	}
}
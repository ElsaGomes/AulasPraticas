package ficha4;

public class FrutaUnidade extends Fruta
{
	private int unidade;

	public FrutaUnidade(String aNome, double aPrecoBase, int aUnidade) 
	{
		super(aNome, aPrecoBase);
		unidade = aUnidade;
	}

	public double pagar() 
	{
		return precoBase * unidade;
	}
}
package ficha4;

public class FrutaPeso extends Fruta implements Descontavel
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

	public double descontar(double aPercentagem) 
	{
		double desconto = pagar() - (pagar() * aPercentagem);
		return desconto;
	}
}
package ficha4;

public class FrutaVolume extends Fruta implements Descontavel
{
	private float volume;

	public FrutaVolume(String aNome, double aPrecoBase, float aVolume) 
	{
		super(aNome, aPrecoBase);
		volume = aVolume;
	}
	
	public double pagar() 
	{
		return precoBase * volume;
	}

	public double descontar(double aPercentagem) 
	{
		double desconto = pagar() - (pagar() * aPercentagem);
		return desconto;
	}
}
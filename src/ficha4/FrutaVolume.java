package ficha4;

public class FrutaVolume extends Fruta
{

	public FrutaVolume(String aNome, double aPrecoBase) 
	{
		super(aNome, aPrecoBase);
	}
	
	public double pagar(double volume) 
	{
		return precoBase * volume;
	}
}
package ficha4;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
		BigDecimal bd = new BigDecimal(desconto).setScale(2, RoundingMode.HALF_EVEN);
		return bd.doubleValue();
	}
}
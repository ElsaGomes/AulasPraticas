package Fruta;

import java.math.BigDecimal;
import java.math.RoundingMode;

import ficha4.Descontavel;

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
		
		BigDecimal bd = new BigDecimal(desconto).setScale(2, RoundingMode.HALF_EVEN);
		return bd.doubleValue();
	}
}
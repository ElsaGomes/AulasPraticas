package appStore;

public class Avaliacao 
{
	private static int[] avaliacao = {1, 2, 3, 4, 5};

	public Avaliacao() 
	{
		
	}

	public static int[] getAvaliacao() 
	{
		return avaliacao;
	}

	public void setAvaliacao(int[] avaliacao) 
	{
		Avaliacao.avaliacao = avaliacao;
	}
	
}
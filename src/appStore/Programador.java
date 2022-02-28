package appStore;

public class Programador extends Utilizador
{
	private double classificacao;
	
	public Programador(String aNome, int aIdade, int aId, double aClassificacao) 
	{
		super(aNome, aIdade, aId);
		classificacao = aClassificacao;
	}
	
	public void addApp()
	{
		
	}
}
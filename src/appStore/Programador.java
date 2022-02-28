package appStore;

import java.util.List;

public class Programador extends Utilizador
{
	private double avaliacao = 0;
	private List<App>apps;
	
	public Programador(String aNome) 
	{
		super(aNome);
	}
	
	public double getAvaliacao() 
	{
		return avaliacao;
	}

	public void setAvaliacao(double aAvaliacao) 
	{
		avaliacao = aAvaliacao;
	}

	public void addApp(App aApps)
	{
		apps.add(aApps);
	}
}
package appStore;

import java.util.ArrayList;
import java.util.List;

public class Programador extends Utilizador
{
	private double avaliacao;
	private List<App>apps;
	
	public Programador(String aNome, int aIdade) 
	{
		super(aNome, aIdade);
		apps = new ArrayList<App>();
	}
	
	public double getAvaliacao() 
	{
		return avaliacao;
	}

	public void setAvaliacao(double aAvaliacao) 
	{
		avaliacao = aAvaliacao;
	}

	public List<App> getApps() 
	{
		return apps;
	}

	public void setApps(List<App> aApps) 
	{
		apps = aApps;
	}
	
	public void addApp(App aApps)
	{
		apps.add(aApps);
	}	
}
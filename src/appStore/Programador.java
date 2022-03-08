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
	
	public App registoAPP(Programador prog)
	{
		System.out.println("Registo da Aplica��o");
		System.out.println("\nNome da Aplica��o");
		String nomeApp = Main.sc.nextLine();
		
		System.out.println("Pre�o da Aplica��o");
		double preco = Main.sc.nextDouble();
		
		TipoApp tipo = App.tipoEnum(nomeApp);
		
		for(App app: apps)
		{
			if()
			App app = new App(nomeApp, preco, tipo);
		}
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
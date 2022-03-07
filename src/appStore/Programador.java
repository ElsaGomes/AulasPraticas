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
		for(App app: apps)
		{
			
		}
	}
	
	public TipoApp tipoAPP(String Atipo)
	{
		System.out.println("Registo da Aplica��o");
		System.out.println("\nNome da Aplica��o");
		String nomeApp = Main.sc.nextLine();
		System.out.println("Pre�o da Aplica��o");
		double preco = Main.sc.nextDouble();
		System.out.println("Tipo de Aplica��o");
		Atipo = Main.sc.nextLine();
		TipoApp tipoEnum = TipoApp.valueOf(Atipo);
		for(App app: apps)
		{
			if(app.getClass().getSimpleName().equals(Atipo))
			{
				App app1 = new App(nomeApp, preco, tipoEnum);
			}
			else
			{
				System.out.println("Tipo de Aplica��o n�o existente, tente de novo!");
			}
		}
		return app1;
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
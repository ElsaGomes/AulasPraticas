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
			
			String tipo = 
			
			prog.addApp(apps);
			}
		}
	}
	
	public TipoApp tipoAPP(String Atipo)
	{
		System.out.println("Registo da Aplicação");
		System.out.println("\nNome da Aplicação");
		String nomeApp = Main.sc.nextLine();
		System.out.println("Preço da Aplicação");
		double preco = Main.sc.nextDouble();
		System.out.println("Tipo de Aplicação");
		Atipo = Main.sc.nextLine();
		for(App app: apps)
		{
			if(app.getClass().getSimpleName().equals(Atipo))
			{
				App apps = new App(nomeApp, preco, Atipo);
			}
		}
		return null;
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
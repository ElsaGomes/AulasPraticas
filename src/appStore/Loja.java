package appStore;

import java.util.ArrayList;
import java.util.List;

public class Loja 
{
	private List<Utilizador>utilizadores;
	private List<App>apps;
	
	public Loja() 
	{
		utilizadores = new ArrayList<Utilizador>();
		apps = new ArrayList<App>();
	}
	
	public void addUtilizador(Utilizador aUtilizadores)
	{
		utilizadores.add(aUtilizadores);
	}
	
	public void addApp(App aApps)
	{
		apps.add(aApps);
	}
	
	public double preco(String nomeApp)
	{
		double preco = 0;
		for(App ap: apps)
		{
			if(ap.getNome().equals(nomeApp))
			{
				preco = ap.getPreco();
			}
		}
		return preco;
	}
	
	public Utilizador escolherUtilizador(String utilizador)
	{
		for(Utilizador util: utilizadores)
		{
			if(util.getClass().getSimpleName().equals(utilizador))
			{
				return util;
			}
		}
		return null;
	}
	
	public Utilizador idProgramador(int prog)
	{
		for(Utilizador util: utilizadores)
		{
			if(util.getId() == prog)
			{
				return util;
			}
		}
		return null;
	}
	
	public String getDadosUtilizador()
	{
		String informacao = "";
		
		for(Utilizador util: utilizadores)
		{
			informacao += "\nNome do utilizador: " + util.getNome() + "\n" + "Idade: " + util.getIdade() + 
					"\n" +  "Número de utilizador: " + util.getId()+ "\n";			
		}
		return informacao;
	}
	
	public String listaAppCategoria(String aTipo)
	{
		String dadosApp = "";
		for(App ap: apps)
		{
			if(App.tipoEnum(aTipo) != null)
			{
				dadosApp +=  ap.getNome() + "\nValor: " + ap.getPreco() + "€" + 
						"\nClassificação: " + ap.getAvaliacao();
			}
		}
		return dadosApp;
	}

}
package appStore;

import java.util.ArrayList;
import java.util.List;

public class Loja 
{
	private List<Utilizador>utilizadores;
	
	public Loja() 
	{
		utilizadores = new ArrayList<Utilizador>();
	}
	
	public List<Utilizador> getUtilizadores() {
		return utilizadores;
	}

	public void setUtilizadores(List<Utilizador> utilizadores) {
		this.utilizadores = utilizadores;
	}

	public void addUtilizador(Utilizador aUtilizadores)
	{
		utilizadores.add(aUtilizadores);
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
			
			else
			{
				System.out.print("O utilizador não existe, verifique novamente!");
				idProgramador(prog);
			}
		}
		return null;
	}
	
	public String getDadosUtilizador()
	{
		String informacao = "";
		
		for(Utilizador util: utilizadores)
		{
			informacao += "\nNome do utilizador: " + util.getNome() + "\n" + "Idade: " + util.getIdade() + "\n" +  "Número de utilizador: " + util.getId() + "\n";			
		}
		return informacao;
	}
}
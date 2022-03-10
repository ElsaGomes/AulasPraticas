package appStore;

import java.util.ArrayList;
import java.util.List;

public class Utilizador 
{
	private List<Compra>compras;
	private List<App>appsCompradas;
	private String nome;
	private int idade;
	private static int numUtilizador = 1;
	private int id;
	
	public Utilizador(String aNome, int aIdade) 
	{
		nome = aNome;
		idade = aIdade;
		id = numUtilizador;
		numUtilizador +=1;
		compras = new ArrayList<Compra>();
		appsCompradas = new ArrayList<App>();
	}
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String aNome) 
	{
		nome = aNome;
	}

	public int getIdade() 
	{
		return idade;
	}

	public void setIdade(int aIdade) 
	{
		idade = aIdade;
	}

	public static int getNumUtilizador() 
	{
		return numUtilizador;
	}

	public static void setNumUtilizador(int aNumUtilizador) 
	{
		numUtilizador = aNumUtilizador;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int aId) 

	{
		id = aId;
	}
	
	public void comprar(Compra aCompra) 
	{
		compras.add(aCompra);
	}
	
	public void comprarApp(App aApps) 
	{
		appsCompradas.add(aApps);
	}
}
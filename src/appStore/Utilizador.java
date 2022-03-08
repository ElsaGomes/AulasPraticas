package appStore;

public class Utilizador 
{
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
}
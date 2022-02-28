package appStore;

public class Utilizador 
{
	private String nome;
	private int idade;
	private static int numUtilizador = 0;
	private int id;
	
	public Utilizador(String aNome, int aIdade, int aId) 
	{
		nome = aNome;
		idade = aIdade;
		id = numUtilizador;
		numUtilizador +=1;
	}
	
	public void comprar()
	{
		
	}
}
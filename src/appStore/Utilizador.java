package appStore;

public class Utilizador 
{
	protected String nome;
	protected int idade;
	static int numeroUtilizador;
	
	public Utilizador(String aNome, int aIdade, int aNumeroUtilizador) 
	{
		nome = aNome;
		idade = aIdade;
		numeroUtilizador = aNumeroUtilizador++;
	}
}
package projeto1;

import java.util.UUID;

public class Utilizador 
{
	protected String nome;
	protected int idade;
	protected UUID numeroUtilizador = UUID.randomUUID();;
	
	public Utilizador(String aNome, int aIdade, UUID aNumeroUtilizador) 
	{
		nome = aNome;
		idade = aIdade;
		numeroUtilizador = aNumeroUtilizador;
	}
}
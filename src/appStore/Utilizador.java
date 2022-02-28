package appStore;

public class Utilizador 
{
	private String nome;
	private int idade;
	private static int numUtilizador = 1;
	private int id;
	
	public Utilizador(String aNome) 
	{
		nome = aNome;
		id = numUtilizador;
		numUtilizador +=1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public static int getNumUtilizador() {
		return numUtilizador;
	}

	public static void setNumUtilizador(int numUtilizador) {
		Utilizador.numUtilizador = numUtilizador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
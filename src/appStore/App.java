package appStore;

public class App 
{
	private String nome;
	private double preco;
	private double avaliacao;
	private TipoApp tipo;
	private Programador id;
	
	public App(String aNome, double aPreco, TipoApp aTipo, Programador aId) 
	{
		nome = aNome;
		preco = aPreco;
		tipo = aTipo;
		id = aId;
	}
}
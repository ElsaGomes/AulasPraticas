package appStore;

public class App 
{
	private String nome;
	private double preco;
	private double avaliacao;
	private TipoApp tipo;
	
	public App(String aNome, double aPreco, TipoApp aTipo) 
	{
		nome = aNome;
		preco = aPreco;
		tipo = aTipo;
	}

	public static void registoAPP(Programador programador)
	{
		System.out.println("Registo da Aplicação");
		System.out.println("\nNome da Aplicação");
		String nome = Main.sc.nextLine();
		System.out.println("Preço da Aplicação");
		double preco = Main.sc.nextDouble();
		App app = new App(nome, preco, tipo);
		programador.addApp(app);
	}
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public double getPreco() 
	{
		return preco;
	}

	public void setPreco(double preco) 
	{
		this.preco = preco;
	}

	public double getAvaliacao() 
	{
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) 
	{
		this.avaliacao = avaliacao;
	}

	public TipoApp getTipo() 
	{
		return tipo;
	}

	public void setTipo(TipoApp tipo) 
	{
		this.tipo = tipo;
	}	
}
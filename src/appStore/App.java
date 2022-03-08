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

	public static TipoApp tipoEnum(String Atipo)
	{
		TipoApp tipoEnum = TipoApp.valueOf(Atipo);
		
		if(TipoApp.valueOf(Atipo) != null)
		{
			return tipoEnum;
		}
		
		else
		{
			System.out.println("A categoria que indicou não existe, tente de novo, "
					+ "escolhendo de entre as categorias anteriormente referidas!");
			tipoEnum(Atipo);
		}
		return tipoEnum;
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
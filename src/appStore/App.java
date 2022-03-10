package appStore;

public class App 
{
	private String nome;
	private double preco;
	private int avaliacao;
	private TipoApp tipo;
	private int numeroVendas;
	private static boolean isComprada;
	
	public App(String aNome, double aPreco, TipoApp aTipo) 
	{
		nome = aNome;
		preco = aPreco;
		tipo = aTipo;
	}

	public static TipoApp tipoEnum(String Atipo)
	{
		TipoApp tipoEnum = TipoApp.valueOf(Atipo.toUpperCase());
		
		if(TipoApp.valueOf(Atipo.toUpperCase()) != null)
		{
			return tipoEnum;
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

	public void setAvaliacao(int avaliacao) 
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

	public int getNumeroVendas() 
	{
		return numeroVendas;
	}

	public void setNumeroVendas(int numeroVendas) 
	{
		this.numeroVendas = numeroVendas;
	}

	public static boolean isComprada() 
	{
		return isComprada;
	}

	public void setComprada(boolean isComprada) 
	{
		this.isComprada = isComprada;
	}
}
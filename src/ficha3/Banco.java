package ficha3;

import java.util.ArrayList;
import java.util.List;

public class Banco 
{
	private String nome;
	private List<ContaBancaria>contas;

	public Banco(String aNome) 
	{
		nome = aNome;
		contas = new ArrayList<ContaBancaria>(100);
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String aNome) 
	{
		nome = aNome;
	}

	public List<ContaBancaria> getContas() 
	{
		return contas;
	}

	public void setContas(List<ContaBancaria>aContas) 
	{
		contas = aContas;
	}
	
	public void criaConta(ContaBancaria aContas) 
	{
		contas.add(aContas);
	}
	
	public ContaBancaria getConta(String aTitular) 
	{
		for(ContaBancaria conta: contas)
		{
			if (conta.getTitular().equals(aTitular))
			{
				return conta;
			}
		}
		return null;
	}
}
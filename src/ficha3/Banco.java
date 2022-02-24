package ficha3;

import java.util.ArrayList;
import java.util.List;

public class Banco 
{
	private String nome;
	private List<ContaBancaria>contas;
	private List<Casa>casas;
	
	public Banco(String aNome) 
	{
		nome = aNome;
		contas = new ArrayList<ContaBancaria>(100);
		casas = new ArrayList<Casa>();
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
	
	public List<Casa> getCasas() 
	{
		return casas;
	}

	public void setCasas(List<Casa> aCasas) 
	{
		casas = aCasas;
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
	
	public void criaCasa(Casa aCasas) 
	{
		casas.add(aCasas);
	}
	
	public void removerCasa(String aCasa)
	{
		for(Casa casa: casas) 
		{
			if(casa.getMorada().equals(aCasa))
			casas.remove(casa);
			System.out.println("A casa foi removida");
		}
	}
	
	public double getLucroPrevisto() 
	{
		double lucro = 0;
		int i = 0;
		for(Casa casa: casas)
		{
			while(i < casas.size())
			{
				lucro = casa.getLucro();
				i++;
			}
		}
		return lucro;
	}
}
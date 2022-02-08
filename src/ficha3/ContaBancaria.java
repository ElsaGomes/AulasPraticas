package ficha3;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContaBancaria 
{
	private String titular;
	private double saldo; //valor inicial = 0.0
	private Date dataAbertura; //data de hoje 
	private List<ContaBancaria>contas;
	
	public ContaBancaria(String aTitular) 
	{
		titular = aTitular;
		saldo = 0.0;
		dataAbertura = new Date();
		contas = new ArrayList<ContaBancaria>();
	}

	public ContaBancaria(String aTitular, double aSaldo) 
	{
		titular = aTitular;
		saldo = aSaldo;
		dataAbertura = new Date();
	}

	public String getTitular() 
	{
		return titular;
	}

	public Date getDataAbertura(String data) 
	{
		return dataAbertura;
	}

	public double getSaldo() 
	{
		return saldo;
	}

	public void setSaldo(double aSaldo) 
	{
		saldo = aSaldo;
	}
	
	public  String getInformacaoConta() 
	{
		SimpleDateFormat novoFormato = new SimpleDateFormat("dd/MM/YYYY");
		String data = novoFormato.format(dataAbertura);
		
		DecimalFormat df = new DecimalFormat("0.00");
		String saldoDecimal = df.format(saldo); 
		return "Titular: " + getTitular() + " Saldo: " + saldoDecimal + " Data Abertura: " + data;
	}
	
	public void depositar(double valorDepositado) 
	{
		double deposito = valorDepositado;
		saldo += deposito; 
	}
	
	public void levantar(double valorLevantado) 
	{
		if (valorLevantado <= saldo)
		{
			double levantamento = valorLevantado;
			saldo -= levantamento; 
		}
		else
		{
			System.out.println("Valor impossível de levantar.");
		}
	}

	public List<ContaBancaria> getContas() 
	{
		return contas;
	}

	public void setContas(List<ContaBancaria> contas) {
		this.contas = contas;
	}
	
}
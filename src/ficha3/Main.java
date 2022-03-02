package ficha3;

public class Main 
{
	public static void main(String args[])
	{
		Banco banco1 = new Banco("Santander");
		
		ContaBancaria conta1 = new ContaBancaria("Elsa Gomes");
		ContaBancaria conta2 = new ContaBancaria("Elsa Perez", 572.8);
		banco1.criaConta(conta1);
		banco1.criaConta(conta2);
		
		conta1.depositar(650.23);
		conta2.levantar(10);
		System.out.println("A conta1 " + " possui " + conta1.getSaldo());
		System.out.println("A conta2 " + " possui " + conta2.getSaldo());
		System.out.println(" ");
		
		System.out.println(conta1.getInformacaoConta());
		System.out.println(conta2.getInformacaoConta());	
		
		System.out.println(" ");
		conta2.levantar(563.8);
		System.out.println(conta2.getInformacaoConta());
		
		System.out.println("Insira o nome do titular");
		System.out.println(banco1.getConta("Elsa Gomes"));
		
		Casa casa1 = new Casa("Funchal");
		Casa casa2 = new Casa();
		Casa casa3 = new Casa("Cancela");
		banco1.criaCasa(casa1);
		banco1.criaCasa(casa2);
		banco1.criaCasa(casa3);
		
		casa1.setPrecoCusto(1500);
		casa1.setPrecoVenda(1000);
		casa2.setPrecoCusto(2500);
		casa2.setPrecoVenda(3500);
		casa3.setPrecoCusto(10000);
		casa3.setPrecoVenda(10500);
		System.out.println("O preço de venda é: " + casa1.getPrecoVenda());
		System.out.println("O lucro da venda é: " + casa1.getLucro());
		
		banco1.removerCasa("Funchal");
		banco1.getLucroPrevisto();
	}
}
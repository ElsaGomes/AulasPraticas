package ficha3;

public class Main 
{
	public static void main(String args[])
	{
		ContaBancaria conta1 = new ContaBancaria("Elsa Gomes");
		ContaBancaria conta2 = new ContaBancaria("Elsa Perez", 572.8);
		
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
	}
}
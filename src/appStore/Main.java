package appStore;

public class Main 
{
	public static void main(String args[])
	{
		Programador prog1 = new Programador("João");
		Programador prog2 = new Programador("Maria");
		
		Cliente cliente1 = new Cliente("Joana");
		Cliente cliente2 = new Cliente("Manuel");
		
		System.out.println(prog1.getId());
		System.out.println(prog2.getId());
		System.out.println(cliente1.getId());
		System.out.println(cliente2.getId());
	}
}
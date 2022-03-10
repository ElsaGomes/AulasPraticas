package appStore;

import java.util.Scanner;

public class Main 
{
	static Scanner sc = new Scanner(System.in);
	static Loja loja1 = new Loja();
	
	public static void main(String args[])
	{
		/**/Programador prog3 = new Programador("Maria", 25);
		
		Cliente cliente1 = new Cliente("José", 18);
		Cliente cliente2 = new Cliente("Ana", 18);
		
		App app1 = new App("Candy", 7.5, TipoApp.GAMES);
		App app2 = new App("Netflix", 20, TipoApp.GAMES);
		
		prog3.addApp(app2);
		prog3.addApp(app1);
		cliente1.comprarApp(app2);
		cliente2.comprarApp(app2); 
		cliente1.avaliar("Netflix");
		cliente2.avaliar("Netflix"); 
		System.out.println(app2.getAvaliacao()); 
		
		cliente1.comprarApp(app1);
		
		loja1.addUtilizador(cliente2);
		loja1.addUtilizador(cliente1);
		loja1.addUtilizador(prog3);
		loja1.addApp(app2);
		loja1.addApp(app1);
		
		System.out.println(loja1.listaAppCategoria("GAMES"));
		
		Menu.menuInicial(loja1);
	}
}
package appStore;

import java.util.Scanner;

public class Main 
{
	static Scanner sc = new Scanner(System.in);
	static Loja loja1 = new Loja();
	
	public static void main(String args[])
	{
		loja1.menuStore(loja1);
		
		/*Programador prog1 = new Programador("João", 30);
		Programador prog2 = new Programador("Maria", 45);
		Cliente cliente1 = new Cliente("Joana", 23);
		Cliente cliente2 = new Cliente("Manuel", 18);
		loja1.addUtilizador(prog1);
		loja1.addUtilizador(prog2);
		loja1.addUtilizador(prog1);
		loja1.addUtilizador(prog2);
		
		App app1 = new App("CandyCrush", 5.5, TipoApp.Games);
		App app2 = new App("Air B&B", 10, TipoApp.Travel);
		App app3 = new App("123", 7.35, TipoApp.Education);
		prog1.addApp(app1);
		prog1.addApp(app2);
		prog2.addApp(app3);*/
		
		sc.close();
	}
}
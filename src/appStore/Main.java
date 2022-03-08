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
		App app1 = new App("Candy", 7.5, TipoApp.Games);
		App app2 = new App("Netflix", 20, TipoApp.Entertainment);
		prog3.addApp(app2);
		prog3.addApp(app1);
		cliente1.comprar(app2);
		cliente2.comprar(app2);
		cliente1.comprar(app1);
		loja1.addUtilizador(cliente2);
		loja1.addUtilizador(cliente1);
		loja1.addUtilizador(prog3);
		loja1.addApp(app2);
		loja1.addApp(app1);
		
		System.out.println("\nMenu:" + "\n1 - Registar um novo utilizador" + "\n2 - Registar uma nova aplicação" + "\n3 - Lista de utilizadores"
				+ "\n4 - Loja de Aplicações" + "\n5 - Sair");
		
		int opcao = sc.nextInt();
		sc.nextLine();
	    switch (opcao) 
	    {
	    	case 1:
	    		try
	    		{
	    			System.out.println("Nome do utilizador");
	    			String nome = sc.nextLine();
		    		
		    		System.out.println("Idade do utilizador");
		    		int idade = sc.nextInt();
		    		
		    		System.out.println("\nIndique o tipo de utilizador:" + "\n1 - Registar novo cliente" + "\n2 - Registar novo programador");
		    		int utilizador = sc.nextInt();
		    		
		    		if(utilizador == 1)
		    		{
		    			Cliente cliente = new Cliente(nome, idade);
		    			loja1.addUtilizador(cliente);
		    		}
		    		else if(utilizador == 2)
		    		{
		    			Programador prog = new Programador(nome, idade);
		    			loja1.addUtilizador(prog);
		    		}
	    		}
	    		
	    		catch (Exception e)
	    		{
	    			System.out.println("Erro, tente novamente!");
	    		}
	    		main(args);
	    		break;
	    		
	    	case 2:
	    		System.out.println("Registo da Aplicação");
	    		System.out.println("Nome da Aplicação");
	    		String nomeApp = sc.nextLine();
	    		
	    		System.out.println("Preço da Aplicação");
	    		double preco = sc.nextDouble();
	    		sc.nextLine();
	    		
	    		System.out.println("Indique qual das seguintes cateforias é aquela que mais se adequa a sua aplicação:"
	    				+ "\nGames" + "\nBusiness" + "\nEducation" + "\nLifestyle" + "\nEntertainment" + "\nUtilities" + "\nTravel" + "\nHealthFitness");
	    		
	    		String tipo = sc.nextLine();
	    		TipoApp tipoEnum = App.tipoEnum(tipo); 
	    		System.out.println(tipoEnum);
	    		
	    		App app = new App(nomeApp, preco, tipoEnum);
	    		loja1.addApp(app);
	    		
	    		System.out.println("Indique o id do utilizador desejado");
	    		int id = sc.nextInt();
	    		
	    		if(loja1.idProgramador(id) != null)
	    		{
	    			Utilizador prog = loja1.escolherUtilizador("Programador");
	    			if(prog != null)
	    			{
	    				((Programador)prog).addApp(app); //para transformar utilizador em programador
	    			} 
	    		}
	    		main(args);
	    		break;
	    	
	    	case 3:
	    		System.out.println(loja1.getDadosUtilizador());
	    		main(args);
	    		break;
	    		
	    	case 4:
	    		System.out.println("\nPesquisar:" + "\n1 - Por categoria" + "\n2 - Por classificação aplicação");
	    		//menuLoja();
	    		main(args);
	    		break;
	    		
	    	case 5:
	    		//System.exit(0);
	    		System.out.println("Nome da Aplicação");
	    		String nomeAp = sc.nextLine();
	    		System.out.println(loja1.preco(nomeAp));
	    		main(args);
	    		break;
	    }
		
	}

	/*public static void menuLoja()
	{
		int opcao = sc.nextInt();
		sc.nextLine();
	    switch (opcao) 
	    {
	    	case 1:
	    		System.out.println("Indique de entre as seguintes cateforias aquela que mais deseja:"
	    				+ "\nGames" + "\nBusiness" + "\nEducation" + "\nLifestyle" + "\nEntertainment" + "\nUtilities" + "\nTravel" + "\nHealthFitness");
	    		
	    		String tipo = sc.nextLine();
	    		TipoApp tipo1 = App.tipoEnum(tipo); 
	    		System.out.println(tipo1);
	    		break;
	    		
	    	case 2:
	    		
	    		break;
	    }
	}*/
}
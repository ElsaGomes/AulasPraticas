package appStore;

import java.util.InputMismatchException;

public class Menu 
{
	public static void menuInicial(Loja aLoja)
	{
		try
		{
			System.out.println("\nMenu:" + "\n1 - Registar um novo utilizador" + "\n2 - Registar uma nova aplica��o" + "\n3 - Lista de utilizadores"
					+ "\n4 - Loja de Aplica��es" + "\n5 - Sair");
			while (true)
			{
				int opcao = Main.sc.nextInt();
				Main.sc.nextLine();
				switch (opcao) 
				{
				case 1://para o registo de um novo utilizador
					menuInicialUtilizador(aLoja);
					menuVoltarSair(aLoja);
		    		break;
		    		
		    	case 2://para registar uma nova app
		    		menuInicialApp(aLoja);
		    		menuVoltarSair(aLoja);
		    		break;
		    	
		    	case 3://para aceder dados do utilizador 
		    		System.out.println(aLoja.getDadosUtilizador());
		    		menuVoltarSair(aLoja);
		    		break;
		    		
		    	case 4://para aceder a loja de apps
		    		menuVoltarSair(aLoja);
		    		break;
		    		
		    	case 5://para sair da aplica��o
		    		System.exit(0);
		    		break;
				}
			}
		}
		catch (InputMismatchException e)
		{
			Main.sc.nextLine(); 
			System.out.println("Erro, insira um n�mero inteiro entre 1 e 5!");
			menuInicial(aLoja);
		}
	}

	public static void menuVoltarSair(Loja aLoja)
	{
		System.out.println("\n1 - Voltar ao menu" + "\n2 - Sair");
		int opcao = Main.sc.nextInt();
		switch (opcao) 
		{
		case 1://para voltar ao menu inicial
			menuInicial(aLoja);
    		break;
    		
    	case 2://para sair da app
    		System.exit(0);
    		break;
		}
	}

	public static void menuInicialUtilizador(Loja aLoja)
	{
		try
		{ 
			System.out.println("Nome do utilizador");
			String nome = Main.sc.nextLine();
			
			System.out.println("Idade do utilizador");
			int idade = Main.sc.nextInt();
			
			System.out.println("\nIndique o tipo de registo desejado:" + "\n1 - Registar novo cliente" + "\n2 - Registar novo programador");
	    	int utilizador = Main.sc.nextInt();
	    		
	    	if(utilizador == 1)
	    	{
	    		Cliente cliente = new Cliente(nome, idade);
	    		aLoja.addUtilizador(cliente);
	    	}
	    	else if(utilizador == 2)
	    	{
    			Programador prog = new Programador(nome, idade);
    			aLoja.addUtilizador(prog);
    		}
	    	else
	    	{
	    		Main.sc.nextLine();
	    		System.out.println("Escolha entre 1 e 2!");
				menuInicialUtilizador(aLoja);
    		}
    	}
		catch (InputMismatchException e)
		{
			Main.sc.nextLine(); 
			System.out.println("Erro, tente novamente!");
			menuInicialUtilizador(aLoja);
		}
	}	
	
	public static void menuInicialApp(Loja aLoja)
	{
		try
		{
			System.out.println("\nRegisto da Aplica��o");
			System.out.println("Nome");
			String nomeApp = Main.sc.nextLine();
			
			System.out.println("Pre�o");
			double preco = Main.sc.nextDouble();
			Main.sc.nextLine();

			System.out.println("Indique qual das seguintes categorias � aquela que mais se adequa a sua aplica��o:"
					+ "\nGames" + "\nBusiness" + "\nEducation" + "\nLifestyle" + "\nEntertainment" + "\nUtilities" + "\nTravel" + "\nHealthFitness");
			String tipo = Main.sc.nextLine();
			TipoApp tipoEnum = App.tipoEnum(tipo); 
			System.out.println(tipoEnum);
			
			App app = new App(nomeApp, preco, tipoEnum);
			aLoja.addApp(app);
			
			System.out.println("Indique o id do programador que deseja associar a aplica��o");
			int id = Main.sc.nextInt();
			
			if(aLoja.idProgramador(id) != null)
			{
				Utilizador prog = aLoja.escolherUtilizador("Programador");
				if(prog != null)
				{
					((Programador)prog).addApp(app); //para transformar utilizador em programador
				} 
			}
		}
		catch(IllegalArgumentException e) 
		{
			System.out.println("A categoria que indicou n�o existe, tente de novo, "
					+ "escolhendo de entre as categorias anteriormente referidas!");
			menuInicialApp(aLoja);
		}
		catch(InputMismatchException e)
		{
			Main.sc.nextLine(); 
			System.out.println("Erro, os seus dados est�o incorretos, tente de novo!");
			menuInicialApp(aLoja);
		} 
	}	
	
	public static void menuLoja(Loja aLoja)
	{
		System.out.println("\nPesquisar:" + "\n1 - Por categoria" + "\n2 - Por classifica��o aplica��o");
		System.out.println("Menu" + "\nPesquisar");
		while (true)
		{
			int opcao = Main.sc.nextInt();
			Main.sc.nextLine();
			switch (opcao) 
			{
			case 1:
				System.out.println("Indique como ");
				break;
	    		
	    	case 2:
	    		break;
	    	
	    	case 3:
	    		break;
	    		
	    	case 4:
	    		break;
	    		
	    	case 5:
	    		break;
			}
		}
	}
}
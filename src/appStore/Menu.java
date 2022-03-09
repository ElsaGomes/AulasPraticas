package appStore;

public class Menu 
{
	public static void menuInicial(Loja aLoja)
	{
		System.out.println("\nMenu:" + "\n1 - Registar um novo utilizador" + "\n2 - Registar uma nova aplicação" + "\n3 - Lista de utilizadores"
				+ "\n4 - Loja de Aplicações" + "\n5 - Sair");
		while (true)
		{
			int opcao = Main.sc.nextInt();
			Main.sc.nextLine();
			switch (opcao) 
			{
			case 1:
				System.out.println("Nome do utilizador");
				String nome = Main.sc.nextLine();
				
				System.out.println("Idade do utilizador");
				int idade = Main.sc.nextInt();
				
				System.out.println("\nIndique o tipo de utilizador:" + "\n1 - Registar novo cliente" + "\n2 - Registar novo programador");
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
		    	menuInicial(aLoja);
	    		break;
	    		
	    	case 2:
	    		System.out.println("Registo da Aplicação");
	    		System.out.println("Nome da Aplicação");
	    		String nomeApp = Main.sc.nextLine();
	    		
	    		System.out.println("Preço da Aplicação");
	    		double preco = Main.sc.nextDouble();
	    		Main.sc.nextLine();
	    		
	    		System.out.println("Indique qual das seguintes cateforias é aquela que mais se adequa a sua aplicação:"
	    				+ "\nGames" + "\nBusiness" + "\nEducation" + "\nLifestyle" + "\nEntertainment" + "\nUtilities" + "\nTravel" + "\nHealthFitness");
	    		
	    		String tipo = Main.sc.nextLine();
	    		TipoApp tipoEnum = App.tipoEnum(tipo); 
	    		System.out.println(tipoEnum);
	    		
	    		App app = new App(nomeApp, preco, tipoEnum);
	    		aLoja.addApp(app);
	    		
	    		System.out.println("Indique o id do utilizador desejado");
	    		int id = Main.sc.nextInt();
	    		
	    		if(aLoja.idProgramador(id) != null)
	    		{
	    			Utilizador prog = aLoja.escolherUtilizador("Programador");
	    			if(prog != null)
	    			{
	    				((Programador)prog).addApp(app); //para transformar utilizador em programador
	    			} 
	    		}
	    		menuInicial(aLoja);
	    		break;
	    	
	    	case 3:
	    		System.out.println(aLoja.getDadosUtilizador());
	    		menuInicial(aLoja);
	    		break;
	    		
	    	case 4:
	    		System.out.println("\nPesquisar:" + "\n1 - Por categoria" + "\n2 - Por classificação aplicação");
	    		menuInicial(aLoja);
	    		break;
	    		
	    	case 5:
	    		System.exit(0);
	    		menuInicial(aLoja);
	    		break;
			}
		}
	}

	public static void menuLoja(Loja aLoja)
	{
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
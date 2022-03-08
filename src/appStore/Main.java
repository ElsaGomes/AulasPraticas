package appStore;

import java.util.Scanner;

public class Main 
{
	static Scanner sc = new Scanner(System.in);
	static Loja loja1 = new Loja();
	
	public static void main(String args[])
	{
		/*Programador prog3 = new Programador("Maria", 25);
		Cliente cliente1 = new Cliente("Jos�", 18);
		App app1 = new App("Candy", 7.5, TipoApp.Games);
		App app2 = new App("Netflix", 20, TipoApp.Entertainment);
		prog3.addApp(app2);
		prog3.addApp(app1);*/
		
		System.out.println("\nMenu:" + "\n1 - Registar um novo utilizador" + "\n2 - Registar uma nova aplica��o" + "\n3 - Lista de utilizadores"
				+ "\n4 - Loja de Aplica��es" + "\n5 - Sair");
		
		int opcao = Main.sc.nextInt();
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
	    		System.out.println("Registo da Aplica��o");
	    		System.out.println("Nome da Aplica��o");
	    		String nomeApp = sc.nextLine();
	    		
	    		System.out.println("Pre�o da Aplica��o");
	    		double preco = sc.nextDouble();
	    		sc.nextLine();
	    		
	    		System.out.println("Indique qual das seguintes cateforias � aquela que mais se adequa a sua aplica��o:"
	    				+ "\nGames" + "\nBusiness" + "\nEducation" + "\nLifestyle" + "\nEntertainment" + "\nUtilities" + "\nTravel" + "\nHealthFitness");
	    		
	    		String tipo = sc.nextLine();
	    		TipoApp tipo1 = App.tipoEnum(tipo); System.out.println(tipo1);
	    		
	    		System.out.println("Indique o id do utilizador desejado");
	    		int id = sc.nextInt();
	    		
	    		if(loja1.idProgramador(id) != null)
	    		{
	    			Utilizador prog = loja1.escolherUtilizador("Programador");
	    			if(prog != null)
	    			{
	    				((Programador)prog).registoAPP(nomeApp, preco, tipo1); //para transformar utilizador em programador
	    			}
	    		}
	    		main(args);
	    		break;
	    	
	    	case 3:
	    		System.out.println(loja1.getDadosUtilizador());
	    		main(args);
	    		break;
	    		
	    	case 4:
	    		
	    		main(args);
	    		break;
	    		
	    	case 5:
	    		System.exit(0);
	    		break;
	    }
		
	}
}
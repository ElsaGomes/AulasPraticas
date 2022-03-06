package appStore;

import java.util.ArrayList;
import java.util.List;

public class Loja 
{
	private List<Utilizador>utilizadores;
	
	public Loja() 
	{
		utilizadores = new ArrayList<Utilizador>();
	}

	public static void menuStore(Loja loja)
	{
		System.out.println("\nMenu:");
		System.out.println("1 - Registar um novo utilizador");
		System.out.println("2 - Registar uma nova aplicação");
		System.out.println("3 - Lista de utilizadores");
		System.out.println("4 - Loja de Aplicações");
		System.out.println("5 - Sair");
		int opcao = Main.sc.nextInt();
	    switch (opcao) 
	    {
	      case 1:
	    	  Utilizador.registoUtilizador(loja);
	    	  break;
	    	  
	      case 2:
	    	  App.registoAPP(loja);
	    	  break;
	        
	      case 3:
	    	  System.out.println(loja.getDadosUtilizador());
	    	  Utilizador.menuSairUtilizador(loja);
	        break;
	        
	      case 4:
	    	  System.out.println(loja.getDadosUtilizador());
	        break;
	        
	      case 5:
	    	  System.exit(0);
	        break;
	    }
	}
	
	public static void menuSair(Loja loja)
	{
		System.out.println("1 - Voltar ao Menu");
		System.out.println("2 - Sair");
		int opcao = Main.sc.nextInt();
	    switch (opcao) 
	    {
	      case 1:
	    	  menuStore(loja);
	    	  break;
	    	  
	      case 2:
	        System.exit(0);
	        break;
	    }
	}
	
	public void addUtilizador(Utilizador aUtilizadores)
	{
		utilizadores.add(aUtilizadores);
	}
	
	public String getDadosUtilizador()
	{
		String informacao = "";
		
		for(Utilizador util: utilizadores)
		{
			informacao += "\nNome do utilizador: " + util.getNome() + "\n" + "Idade: " + util.getIdade() + "\n" +  "Número de utilizador: " + util.getId() + "\n";			
		}
		return informacao;
	}
}
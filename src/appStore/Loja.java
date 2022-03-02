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

	public void menuStore(Loja loja)
	{
		System.out.println("Menu:");
		System.out.println("1 - Registar um novo utilizador");
		System.out.println("2 - Registar uma nova aplicação");
		System.out.println("3 - Lista de utilizadores");
		int opcao = Main.sc.nextInt();
	    switch (opcao) 
	    {
	      case 1:
	    	  registoUtilizador(loja);
	    	  break;
	      case 2:
	    	  
	        break;
	      case 3:
	    	  System.out.println(loja.getDadosUtilizador());
	        break;
	    }
	}
	
	public void registoUtilizador(Loja loja)
	{
		  System.out.println("\nMenu:");
    	  System.out.println("1 - Registar novo cliente");
    	  System.out.println("2 - Registar novo programador");
    	  int utilizador = Main.sc.nextInt();
    	  switch (utilizador) 
    	  {
    	  case 1:
    		  System.out.println("Nome do utilizador");
    		  String nome = Main.sc.nextLine();
    		  Main.sc.nextLine();
    		  System.out.println("Idade do utilizador"); 
    		  System.out.print("2"+nome);
    		  int idade = Main.sc.nextInt();
    		  Main.sc.nextLine();
    		  Cliente cliente = new Cliente(nome, idade);
    		  loja.addUtilizador(cliente);
    		  menuStore(loja);
    		  break;
  	      case 2:System.out.println("Nome do utilizador");
    		  String nome1 = Main.sc.nextLine();
    		  Main.sc.nextLine();
    		  System.out.println("Idade do utilizador");
    		  int idade1 = Main.sc.nextInt();
    		  Main.sc.nextLine();
    		  Programador prog = new Programador(nome1, idade1);
    		  loja.addUtilizador(prog);
    		  menuStore(loja);
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
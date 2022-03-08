package appStore;

public class Utilizador 
{
	private String nome;
	private int idade;
	private static int numUtilizador = 1;
	private int id;
	
	public Utilizador(String aNome, int aIdade) 
	{
		nome = aNome;
		idade = aIdade;
		id = numUtilizador;
		numUtilizador +=1;
	}
	
	public static void registoUtilizador(Loja loja)
	{
		  System.out.println("\nMenu:");
    	  System.out.println("1 - Registar novo cliente");
    	  System.out.println("2 - Registar novo programador");
    	  int utilizador = Main.sc.nextInt();
    	  Main.sc.nextLine();
    	  switch (utilizador) 
    	  {
    	  case 1:
    		  System.out.println("Nome do utilizador");
    		  String nome = Main.sc.nextLine();
    		  
    		  System.out.println("Idade do utilizador");
    		  int idade = Main.sc.nextInt();
    		  
    		  Cliente cliente = new Cliente(nome, idade);
    		  loja.addUtilizador(cliente);
    		  Loja.menuSair(loja);
    		  break;
    		  
  	      case 2:System.out.println("Nome do utilizador");
    		  String nome1 = Main.sc.nextLine();
    		  
    		  System.out.println("Idade do utilizador");
    		  int idade1 = Main.sc.nextInt();
    		  
    		  Programador prog = new Programador(nome1, idade1);
    		  loja.addUtilizador(prog);
    		  Loja.menuSair(loja);
    		  break;
    	  }
	}
	
	public static void menuSairUtilizador(Loja loja)
	{
		System.out.println("1 - Voltar ao Menu");
		System.out.println("2 - Registar outro utilizador");
		System.out.println("3 - Sair");
		int opcao = Main.sc.nextInt();
	    switch (opcao) 
	    {
	      case 1:
	    	  Loja.menuStore(loja);
	    	  break;
	    	  
	      case 2:
	    	  registoUtilizador(loja);
	    	  break;
	    	  
	      case 3:
	        System.exit(0);
	        break;
	    }
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String aNome) 
	{
		nome = aNome;
	}

	public int getIdade() 
	{
		return idade;
	}

	public void setIdade(int aIdade) 
	{
		idade = aIdade;
	}

	public static int getNumUtilizador() 
	{
		return numUtilizador;
	}

	public static void setNumUtilizador(int aNumUtilizador) 
	{
		Utilizador.numUtilizador = aNumUtilizador;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int aId) 

	{
		id = aId;
	}
}
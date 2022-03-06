package appStore;

import java.util.Scanner;

public class Main 
{
	static Scanner sc = new Scanner(System.in);
	static Loja loja1 = new Loja();
	
	public static void main(String args[])
	{
		Loja.menuStore(loja1);
	}
}
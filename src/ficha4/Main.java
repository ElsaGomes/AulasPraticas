package ficha4;

public class Main 
{
	public static void main(String args[])
	{
		Cesto cesto1 = new Cesto();
		
		FrutaVolume fruta1 = new FrutaVolume ("Maçã", 1, 5); //volume
		FrutaPeso fruta2 = new FrutaPeso ("Laranja", 1.5, 10); //peso
		FrutaUnidade fruta3 = new FrutaUnidade ("Pêra", 0.5, 15); //unidade
		FrutaUnidade fruta4 = new FrutaUnidade ("Romã", 1.75, 3); //unidade
		FrutaPeso fruta5 = new FrutaPeso ("Anona", 1.45, 12); //peso
		FrutaUnidade fruta6 = new FrutaUnidade ("Melancia", 1.5, 3); //unidade
		
		cesto1.addFruta(fruta1);
		cesto1.addFruta(fruta2);
		cesto1.addFruta(fruta3);
		cesto1.addFruta(fruta4);
		cesto1.addFruta(fruta5);
		cesto1.addFruta(fruta6);
		
		System.out.println("Valor a pagar pela compra de " + fruta1.getNome() + ": " + fruta1.pagar());
		System.out.println("Valor a pagar pela compra de " + fruta2.getNome() + ": " + fruta2.pagar());
		System.out.println("Valor a pagar pela compra de " + fruta3.getNome() + ": " + fruta3.pagar());
		System.out.println("Valor a pagar pela compra de " + fruta4.getNome() + ": " + fruta4.pagar());
		System.out.println("Valor a pagar pela compra de " + fruta5.getNome() + ": " + fruta5.pagar());
		System.out.println("Valor a pagar pela compra de " + fruta6.getNome() + ": " + fruta6.pagar());
		
		System.out.println("\nTotal a pagar pelo cesto: " + cesto1.totalCesto());
		System.out.println("\nTotal de FrutaPeso: " + cesto1.totalTipoFruta("FrutaPeso"));
		System.out.println("Total de FrutaUnidade: " + cesto1.totalTipoFruta("FrutaUnidade"));
		System.out.println("Total de FrutaVolume: " + cesto1.totalTipoFruta("FrutaVolume"));
		
		System.out.println("\nValor total de FrutaVolume: " + cesto1.valorTotalTipoFruta("FrutaVolume")); 
		System.out.println("Valor total de FrutaPeso: " + cesto1.valorTotalTipoFruta("FrutaPeso")); 
		System.out.println("Valor total de FrutaUnidade: " + cesto1.valorTotalTipoFruta("FrutaUnidade"));
		
		System.out.println("\nValor com desconto da compra de " + fruta5.getNome()+ " é: " + fruta5.descontar(0.02));
		System.out.println("Valor com desconto da compra de " + fruta1.getNome()+ " é: " + fruta1.descontar(0.01));
	}
}
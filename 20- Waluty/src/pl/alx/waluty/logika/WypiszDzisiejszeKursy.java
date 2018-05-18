package pl.alx.waluty.logika;

import pl.alx.waluty.model.Tabela;
import pl.alx.waluty.model.Waluta;

public class WypiszDzisiejszeKursy {

	public static void main(String[] args) {
		Tabela tabela = ObslugaNBP.pobierzBiezaceKursy();
		System.out.println(tabela);
		for (Waluta waluta : tabela.getWszystkieWaluty()) {
			System.out.println(waluta);
			
		}
			
		}


}

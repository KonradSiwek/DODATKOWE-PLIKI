package pl.alx.waluty.model;

import java.math.BigDecimal;

public class ProgramTestujacyWaluty {

	public static void main(String[] args) {
		Waluta euro =new Waluta("EUR", "euro", new BigDecimal("4.20"));
		BigDecimal kwota = new BigDecimal("100.00");
		
		BigDecimal wynik = euro.walutaNaZlote(kwota);
		
		System.out.println("wynik "+ wynik);
		

	}

}

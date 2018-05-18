package pl.alx.waluty.model;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class WalutaTest {

	@Test
	void testWalutaNaZlote() {
		//arrange -przygotuje
		Waluta euro =new Waluta("EUR", "euro", new BigDecimal("4.2000"));
		BigDecimal kwota = new BigDecimal("100.0");
		//act - wykonaj
		BigDecimal wynik = euro.walutaNaZlote(kwota);
		//assert- sprawdzamy test
		BigDecimal oczekiwanyWynik= new BigDecimal("420.00");
	
		assertEquals(oczekiwanyWynik, wynik);	
	}
	@Test
	void testZloteNaWalute() {
		//arrange -przygotuje
		
		Waluta euro =new Waluta("EUR", "euro", new BigDecimal("4.2"));
		BigDecimal kwota = new BigDecimal("420");
		//act - wykonaj
		BigDecimal wynik = euro.zloteNaWaluta(kwota);
		//assert- sprawdzamy test
		BigDecimal oczekiwanyWynik= new BigDecimal("100.00");
	
		assertEquals(oczekiwanyWynik, wynik);	
	}
	@Test
	void testZloteNaWaluteZaokrąglone() {
		//arrange -przygotuje
		
		Waluta euro =new Waluta("USD", "dolar", new BigDecimal("3.0000"));
		BigDecimal kwota = new BigDecimal("400");
		//act - wykonaj
		BigDecimal wynik = euro.zloteNaWaluta(kwota);
		//assert- sprawdzamy test
		BigDecimal oczekiwanyWynik= new BigDecimal("133.33");
	
		assertEquals(oczekiwanyWynik, wynik);	
	}
	@Test
	void testWalutaNaZloteZaokraglanie() {
		//arrange -przygotuje
		Waluta euro =new Waluta("EUR", "euro", new BigDecimal("4.5555"));
		BigDecimal kwota = new BigDecimal("1.00");
		//act - wykonaj
		BigDecimal wynik = euro.walutaNaZlote(kwota);
		//assert- sprawdzamy test
		BigDecimal oczekiwanyWynik= new BigDecimal("4.56");
	
		assertEquals(oczekiwanyWynik, wynik);	
	}

}

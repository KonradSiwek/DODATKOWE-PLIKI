package pl.alx.waluty.logika;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import pl.alx.waluty.model.Tabela;
import pl.alx.waluty.model.Waluta;

public class WypiszKursyDlaDaty {

	public static void main(String[] args) {
		String data = JOptionPane.showInputDialog("Podaj datę ", LocalDate.now());
		
		Tabela tabela = ObslugaNBP.pobierzHistoryczneKursy(data);
		System.out.println(tabela);
		for (Waluta waluta : tabela.getWszystkieWaluty()) {
			System.out.println(waluta);
			
		}
			
		}


}

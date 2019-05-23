import java.util.Scanner;

import java.util.Random;

public class KurssiProjekti {

	public static void main(String[] args) {
		
		// Tulostetaan ohjeistus pelaajalle
		
		System.out.println("Tervetuloa pelaamaan Kivi-Sakset-Paperi -peli� tietokonetta vastaan.");

		System.out.println(
				"T�ss� peliss� oma vaihtoehto valitaan sy�tt�m�ll� numero v�lilt� 0-2, jossa 0 on Kivi, 1 on Sakset ja 2 on Paperi.");

		System.out.println("Pelin voi lopettaa sy�tt�m�ll� numeron, joka on suurempi kuin 2. ");

		// alustetaan lopuksi tulostettavat pelaajan voitot, koneen voitot ja tasapelit
		
		int pelaajanvoitot = 0; 

		int koneenvoitot = 0;

		int tasapelit = 0;

		Scanner lukija = new Scanner(System.in);

		int pelaaja;

		do {

			// Tietokone valitsee yhden luvun v�lilt� 0-2
			
			Random rand = new Random(); 

			int kone = rand.nextInt(3);
			
			// pelaaja antaa oman vaihtoehtonsa

			System.out.println("Valitse joko 0. Kivi, 1. Sakset tai 2. Paperi."); 

			pelaaja = lukija.nextInt();

			System.out.println("Kone valitsi: " + kone); 
			
			// Verrataan sy�tetty� lukua valittuun lukuun.

			if ((pelaaja == 0 && kone == 1) || (pelaaja == 1 && kone == 2) || (pelaaja == 2 && kone == 0)) {

				System.out.println(" Pelaaja voitti!");

				pelaajanvoitot++; // kasvatetaan pelaajan voittojen lukum��r�� yhdell�

			} else if ((pelaaja == 0 && kone == 2) || (pelaaja == 1 && kone == 0) || (pelaaja == 2 && kone == 1)) {

				System.out.println("Kone voitti!");

				koneenvoitot++; // kasvatetaan koneen voittojen lukum��r�� yhdell�

			} else if ((pelaaja == 0 && kone == 0) || (pelaaja == 1 && kone == 1) || (pelaaja == 2 && kone == 2)) {

				System.out.println("Tasapeli!"); 

			tasapelit++; // kasvatetaan tasapelien lukum��r�� yhdell�
			
			} else System.out.println("Lopetit pelin");
			
		} while ((pelaaja >= 0) && (pelaaja <= 2));
		
		//Kun pelaaja sy�tt�� pienemm�n kuin 0 tai suuremman kuin 2, lopettetaan silmukka ja tulostetaan lopputilanne

		System.out.println("Pelaajan voitot: " + pelaajanvoitot + ". " + "Koneen voitot: " + koneenvoitot + ".  "

				+ "Tasapelit: " + tasapelit + ".");

		if ((pelaajanvoitot > koneenvoitot) && (pelaajanvoitot > tasapelit)) {

			System.out.println("Pelaaja voitti!");

		} else if (koneenvoitot > pelaajanvoitot && (koneenvoitot > tasapelit)) {

			System.out.println("Kone voitti!");

		} else

			System.out.println("Tasapeli tuli!");

		System.out.print("Kiitos kun pelasit!");

	}

}

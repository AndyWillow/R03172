import java.util.Scanner;

import java.util.Random;

public class KurssiProjekti {

	public static void main(String[] args) {
		
		// Tulostetaan ohjeistus pelaajalle
		
		System.out.println("Tervetuloa pelaamaan Kivi-Sakset-Paperi -peliä tietokonetta vastaan.");

		System.out.println(
				"Tässä pelissä oma vaihtoehto valitaan syöttämällä numero väliltä 0-2, jossa 0 on Kivi, 1 on Sakset ja 2 on Paperi.");

		System.out.println("Pelin voi lopettaa syöttämällä numeron, joka on suurempi kuin 2. ");

		// alustetaan lopuksi tulostettavat pelaajan voitot, koneen voitot ja tasapelit
		
		int pelaajanvoitot = 0; 

		int koneenvoitot = 0;

		int tasapelit = 0;

		Scanner lukija = new Scanner(System.in);

		int pelaaja;

		do {

			// Tietokone valitsee yhden luvun väliltä 0-2
			
			Random rand = new Random(); 

			int kone = rand.nextInt(3);
			
			// pelaaja antaa oman vaihtoehtonsa

			System.out.println("Valitse joko 0. Kivi, 1. Sakset tai 2. Paperi."); 

			pelaaja = lukija.nextInt();

			System.out.println("Kone valitsi: " + kone); 
			
			// Verrataan syötettyä lukua valittuun lukuun.

			if ((pelaaja == 0 && kone == 1) || (pelaaja == 1 && kone == 2) || (pelaaja == 2 && kone == 0)) {

				System.out.println(" Pelaaja voitti!");

				pelaajanvoitot++; // kasvatetaan pelaajan voittojen lukumäärää yhdellä

			} else if ((pelaaja == 0 && kone == 2) || (pelaaja == 1 && kone == 0) || (pelaaja == 2 && kone == 1)) {

				System.out.println("Kone voitti!");

				koneenvoitot++; // kasvatetaan koneen voittojen lukumäärää yhdellä

			} else if ((pelaaja == 0 && kone == 0) || (pelaaja == 1 && kone == 1) || (pelaaja == 2 && kone == 2)) {

				System.out.println("Tasapeli!"); 

			tasapelit++; // kasvatetaan tasapelien lukumäärää yhdellä
			
			} else System.out.println("Lopetit pelin");
			
		} while ((pelaaja >= 0) && (pelaaja <= 2));
		
		//Kun pelaaja syöttää pienemmän kuin 0 tai suuremman kuin 2, lopettetaan silmukka ja tulostetaan lopputilanne

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

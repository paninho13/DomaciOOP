package biblioteka;

public class Main {

	public static void main(String[] args) {
		Knjiga k1 = new Knjiga();
		Knjiga k2 = new Knjiga("Na Drini cuprija", "Ivo Andric");
		Knjiga k3 = new Knjiga("Prokleta avlija", "Ivo Andric", 1954, 120, 890.0);

		System.out.println();
		k1.prikaziPodatke();
		k2.prikaziPodatke();
		k3.prikaziPodatke();

		System.out.println();
		k1.setNaslov("Dervis i smrt");
		k1.setAutor("Mesa Selimovic");
		k1.setGodinaizdanja(1966);
		k1.setBrojstrana(480);
		k1.setCena(1250.0);

		System.out.println();
		k2.setCena(-300);
		k2.setGodinaizdanja(3000);

		System.out.println();
		k2.prikaziPodatke();

		System.out.println();
		System.out.println("Naslov: " + k3.getNaslov());
		System.out.println("Cena: " + k3.getCena() + " RSD");

		System.out.println();
		System.out.println("Cena jedne knjige: " + k3.izracunajCenu() + " RSD");
		System.out.println("Cena za 5 primeraka: " + k3.izracunajCenu(5) + " RSD");
		System.out.println("Cena za 5 primeraka sa 10% popusta: " + k3.izracunajCenu(5, 10) + " RSD");

		System.out.println("--- Kratak prikaz knjige k1 (kratko = true) ---");
		k1.prikaziPodatke(true);
		System.out.println("\n--- Puni prikaz knjige k3 (kratko = false) ---");
		k3.prikaziPodatke(false);

		System.out.println("\n--- Provera cene (jeSkupljaOd) ---");
		if (k1.jeSkupljaOd(k3)) {
			System.out.println("Knjiga \"" + k1.getNaslov() + "\" je skuplja od knjige \"" + k3.getNaslov() + "\".");
		} else {
			System.out.println("Knjiga \"" + k1.getNaslov() + "\" nije skuplja od knjige \"" + k3.getNaslov() + "\".");
		}

		System.out.println("\n--- Ukupan broj kreiranih knjiga ---");
		System.out.println("Ukupno je napravljeno objekata klasa Knjiga: " + Knjiga.getBrojKnjiga());
	}

}

package biblioteka;

public class Knjiga {
	private String naslov;
	private String autor;
	private int godinaizdanja;
	private int brojstrana;
	private double cena;

	private static int brojKnjiga = 0;

	public Knjiga() {
		this.naslov = "Nepoznato";
		this.autor = "Nepoznato";
		this.godinaizdanja = 2000;
		this.brojstrana = 100;
		this.cena = 0;

		brojKnjiga++;
	}

	public Knjiga(String naslov, String autor) {
		this();
		setNaslov(naslov);
		setAutor(autor);
	}

	public Knjiga(String naslov, String autor, int godinaizdanja, int brojstrana, double cena) {
		this();
		setNaslov(naslov);
		setAutor(autor);
		setGodinaizdanja(godinaizdanja);
		setBrojstrana(brojstrana);
		setCena(cena);
	}

	public static int getBrojKnjiga() {
		return brojKnjiga;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		if (naslov != null && !naslov.trim().isEmpty()) {
			this.naslov = naslov;
		} else {
			System.out.println("Greska: naslov ne sme biti prazan.");
		}
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor != null && !autor.trim().isEmpty()) {
			this.autor = autor;
		} else {
			System.out.println("Greska: autor ne sme biti prazan.");
		}
	}

	public int getGodinaizdanja() {
		return godinaizdanja;
	}

	public void setGodinaizdanja(int godinaizdanja) {
		if (godinaizdanja >= 1450 && godinaizdanja <= 2026) {
			this.godinaizdanja = godinaizdanja;
		} else {
			System.out.println("Greska: godina izdanja mora biti izmedju 1450 i 2026.");
		}
	}

	public int getBrojstrana() {
		return brojstrana;
	}

	public void setBrojstrana(int brojstrana) {
		if (brojstrana > 0) {
			this.brojstrana = brojstrana;
		} else {
			System.out.println("Greska: broj strana mora biti veci od 0.");
		}
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		if (cena >= 0) {
			this.cena = cena;
		} else {
			System.out.println("Greska: cena ne moze biti negativna.");
		}
	}

	public void prikaziPodatke() {
		System.out.println("Naslov: " + naslov + " | Autor: " + autor + " | Godina izdanja: " + godinaizdanja
				+ " | Broj strana: " + brojstrana + " | Cena: " + cena + " RSD");
	}

	public double izracunajCenu() {
		return this.cena;
	}

	public double izracunajCenu(int kolicina) {
		return this.cena * kolicina;
	}

	public double izracunajCenu(int kolicina, double popustProcenat) {
		if (popustProcenat >= 0 && popustProcenat <= 50) {
			return this.cena * kolicina * (1 - popustProcenat / 100.0);
		} else {
			System.out.println("Greska: popust mora biti izmedju 0 i 50%. Vracena je cena bez popusta.");
			return izracunajCenu(kolicina);
		}
	}

	public boolean jeSkupljaOd(Knjiga druga) {
		if (druga != null) {
			return this.cena > druga.cena;
		}
		return false;
	}

	public void prikaziPodatke(boolean kratko) {
		if (kratko) {
			System.out.println("Naslov: " + naslov + " | Autor: " + autor);
		} else {
			prikaziPodatke();
		}
	}
}
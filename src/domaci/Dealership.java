package domaci;

public class Dealership {

	public static void main(String[] args) {
		Automobil auto = new Automobil("Volkswagen", "Passat b6", 2020, 15000);

        System.out.println(auto.getMarka());
        System.out.println(auto.getModel());
        System.out.println(auto.getGodina());
        System.out.println(auto.getCena());

        auto.setCena(13000);

        System.out.println("Nova cena: " + auto.getCena());

	}

}

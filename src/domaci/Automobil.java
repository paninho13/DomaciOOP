package domaci;

public class Automobil {

    private String marka;
    private String model;
    private int godina;
    private double cena;

    public Automobil(String marka, String model, int godina, double cena) {
        this.marka = marka;
        this.model = model;
        this.godina = godina;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getGodina() {
        return godina;
    }

    public double getCena() {
        return cena;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}

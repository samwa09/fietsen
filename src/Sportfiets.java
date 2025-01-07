public class Sportfiets {

    private String merk;
    private String kleur;
    private double prijs;

    public Sportfiets(String merk, String kleur, double prijs) {
        this.merk = merk;
        this.kleur = kleur;
        this.prijs = prijs;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }
}

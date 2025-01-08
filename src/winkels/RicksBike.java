package winkels;

public class RicksBike {

    private String straatNaam;
    private int aantalPersoneel;

    public RicksBike(String straatNaam, int aantalPersoneel) {
        this.straatNaam = straatNaam;
        this.aantalPersoneel = aantalPersoneel;
    }

    public String getStraatNaam() {
        return straatNaam;
    }

    public void setStraatNaam(String straatNaam) {
        this.straatNaam = straatNaam;
    }

    public int getAantalPersoneel() {
        return aantalPersoneel;
    }

    public void setAantalPersoneel(int aantalPersoneel) {
        this.aantalPersoneel = aantalPersoneel;
    }
}
